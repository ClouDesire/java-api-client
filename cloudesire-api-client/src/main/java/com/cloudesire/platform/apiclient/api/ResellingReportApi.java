package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.ResellingReportLineDTO;
import com.liberologico.cloudesire.cmw.model.dto.ResellingTotalsDTO;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

public interface ResellingReportApi
{
    @GET( "proceedsReport/reselling" )
    Call<List<ResellingReportLineDTO>> getAll( @QueryMap Map<String, String> filters );

    @GET( "proceedsReport/reselling/totals" )
    Call<ResellingTotalsDTO> getTotals( @QueryMap Map<String, String> filters );

    @Streaming
    @GET( "proceedsReport/reselling" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest );
}
