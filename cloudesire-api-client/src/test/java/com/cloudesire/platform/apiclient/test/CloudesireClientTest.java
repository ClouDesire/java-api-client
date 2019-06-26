package com.cloudesire.platform.apiclient.test;

import com.cloudesire.platform.apiclient.CloudesireClient;
import com.cloudesire.platform.apiclient.CloudesireClientCallExecutor;
import com.cloudesire.platform.apiclient.response.CallResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.ThrowableAssert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CloudesireClientTest
{
    private static final String USER_AGENT = "Cloudesire API Client 20190624";

    private CloudesireClientCallExecutor executor;

    @Before
    public void setup()
    {
        executor = new CloudesireClientCallExecutor( objectMapper() );
    }

    private ObjectMapper objectMapper()
    {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false );
        return mapper;
    }

    @Test
    public void userAgent() throws IOException
    {
        Httpbin api = getHttpbinApi();
        HttpbinResponse response = api.get().execute().body();
        assertThat( response ).isNotNull();
        assertThat( response.getOrigin() ).isNotEmpty();
        assertThat( response.getHeaders() ).containsKey( "User-Agent" );
        assertThat( response.getHeaders().get( "User-Agent" ) ).isEqualTo( USER_AGENT );
    }

    private Httpbin getHttpbinApi()
    {
        CloudesireClient.Builder builder = new CloudesireClient.Builder();
        builder.setBaseUrl( "https://httpbin.org" );
        builder.setMapper( objectMapper() );
        return builder.build().getApi( Httpbin.class );
    }

    @Test
    public void callExecutorBasic()
    {
        Httpbin api = getHttpbinApi();
        HttpbinResponse response = this.executor.execute( api.get() );

        assertThat( response.getOrigin() ).isNotEmpty();
        assertThat( response.getHeaders() ).containsKey( "User-Agent" );
        assertThat( response.getHeaders().get( "User-Agent" ) ).isEqualTo( USER_AGENT );
    }

    @Test
    public void builderMandatoryParameters()
    {
        final CloudesireClient.Builder builder = new CloudesireClient.Builder();
        assertThatThrownBy( new ThrowableAssert.ThrowingCallable()
        {
            @Override
            public void call()
            {
                builder.build();
            }
        } ).isInstanceOf( NullPointerException.class );

        builder.setBaseUrl( "http://www.google.it" );
        assertThatThrownBy( new ThrowableAssert.ThrowingCallable()
        {
            @Override
            public void call()
            {
                builder.build();
            }
        } ).isInstanceOf( NullPointerException.class );

        builder.setMapper( new ObjectMapper() );
        assertThat( builder.build() ).isNotNull();
    }

    @Test
    public void newBuilder()
    {
        final CloudesireClient.Builder builder = new CloudesireClient.Builder();
        builder.setBaseUrl( "http://www.google.it" );
        builder.setMapper( objectMapper() );
        CloudesireClient client = builder.build();

        CloudesireClient.Builder anotherBuilder = client.newBuilder();

        assertThat( builder == anotherBuilder ).isFalse();
        assertThat( builder ).isEqualTo( anotherBuilder );

        CloudesireClient anotherClient = anotherBuilder.build();

        assertThat( client == anotherClient ).isFalse();
        assertThat( client ).isEqualTo( anotherClient );
    }

    @Test
    public void callExecutorFullResponse()
    {
        Httpbin api = getHttpbinApi();
        CallResponse<HttpbinResponse> response = this.executor.executeFullResponse( api.get() );

        assertThat( response.getHeader( "server" ) ).isNotEmpty();
        assertThat( response.paginator().getPageNumber() ).isNull();
    }
}
