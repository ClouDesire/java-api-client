package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ProceedsReportLineDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.ProceedsTotalsDTO;
import com.cloudesire.platform.apiclient.query.ProceedsReportQuery;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;

public interface ProceedsReportApi
{
    @GET( "proceedsReport" )
    Call<List<ProceedsReportLineDTO>> getAll();

    @GET( "proceedsReport" )
    Call<List<ProceedsReportLineDTO>> getAll( @QueryMap ProceedsReportQuery query );

    @GET( "proceedsReport/totals" )
    Call<ProceedsTotalsDTO> getTotals();

    @GET( "proceedsReport/totals" )
    Call<ProceedsTotalsDTO> getTotals( @QueryMap ProceedsReportQuery query );

    @Streaming
    @GET( "proceedsReport" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv();

    @Streaming
    @GET( "proceedsReport" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap ProceedsReportQuery query );
}
