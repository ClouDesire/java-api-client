package com.cloudesire.platform.apiclient.test;

import com.cloudesire.platform.apiclient.CloudesireClient;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.ThrowableAssert;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class CloudesireClientTest
{
    @Test
    public void builderMandatoryParameters()
    {
        final CloudesireClient.Builder builder = new CloudesireClient.Builder();
        assertThatThrownBy( new ThrowableAssert.ThrowingCallable()
        {
            @Override
            public void call() throws Throwable
            {
                builder.build();
            }
        } ).isInstanceOf( NullPointerException.class );
        builder.setBaseUrl( "http://www.google.it" );
        assertThatThrownBy( new ThrowableAssert.ThrowingCallable()
        {
            @Override
            public void call() throws Throwable
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
        builder.setMapper( new ObjectMapper() );
        CloudesireClient client = builder.build();
        CloudesireClient.Builder anotherBuilder = client.newBuilder();
        assertThat( builder == anotherBuilder ).isFalse();
        assertThat( builder ).isEqualTo( anotherBuilder );
        CloudesireClient anotherClient = anotherBuilder.build();
        assertThat( client == anotherClient ).isFalse();
        assertThat( client ).isEqualTo( anotherClient );
    }

    @Test
    public void userAgent() throws IOException
    {
        CloudesireClient.Builder builder = new CloudesireClient.Builder();
        builder.setBaseUrl( "https://httpbin.org" );
        builder.setMapper( objectMapper() );
        builder.setUserAgent( "PIPPO CLIENT" );
        CloudesireClient client = builder.build();
        Httpbin api = client.getApi( Httpbin.class );
        HttpbinResponse response = api.get().execute().body();
        assertThat( response.getOrigin() ).isNotEmpty();
        assertThat( response.getHeaders() )
                .containsValue( "PIPPO CLIENT" );
    }

    private ObjectMapper objectMapper()
    {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false );
        return mapper;
    }
}
