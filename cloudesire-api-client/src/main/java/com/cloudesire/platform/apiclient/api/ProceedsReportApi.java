package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ProceedsReportLineDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.VendorOrderLineDTO;
import com.cloudesire.platform.apiclient.query.ProceedsReportQuery;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;

public interface ProceedsReportApi
{
    @HEAD( "proceedsReport" )
    Call<Void> headAll( @QueryMap ProceedsReportQuery query );

    @GET( "proceedsReport" )
    Call<List<ProceedsReportLineDTO>> getAll();

    @GET( "proceedsReport" )
    Call<List<ProceedsReportLineDTO>> getAll( @QueryMap ProceedsReportQuery query );

    @Streaming
    @GET( "proceedsReport" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv();

    @Streaming
    @GET( "proceedsReport" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap ProceedsReportQuery query );

    @POST( "proceedsReport" )
    Call<Void> post( @Body List<VendorOrderLineDTO> lines );

    @DELETE( "proceedsReport/{subscriptionId}/{tag}/{value}" )
    Call<Void> delete(
            @Path( "subscriptionId" ) int subscriptionId,
            @Path( "tag" ) String tag,
            @Path( "value" ) String value
    );

    /**
     * @deprecated by {@link #delete(int, String, String)}
     */
    @DELETE( "proceedsReport/{subscriptionId}/{tag}" )
    @Deprecated( since = "3.1.0", forRemoval = true )
    Call<Void> delete( @Path( "subscriptionId" ) int subscriptionId, @Path( "tag" ) String tag );
}
