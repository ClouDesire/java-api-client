package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ProceedsReportLineDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.ProceedsTotalsDTO;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

/**
 * @deprecated by {@link ProceedsReportApi}
 */
@Deprecated
public interface ResellingReportApi
{
    @GET( "proceedsReport/reselling" )
    Call<List<ProceedsReportLineDTO>> getAll();

    @GET( "proceedsReport/reselling" )
    Call<List<ProceedsReportLineDTO>> getAll( @QueryMap Map<String, String> filters );

    @GET( "proceedsReport/reselling/totals" )
    Call<ProceedsTotalsDTO> getTotals();

    @GET( "proceedsReport/reselling/totals" )
    Call<ProceedsTotalsDTO> getTotals( @QueryMap Map<String, String> filters );

    @Streaming
    @GET( "proceedsReport/reselling" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv();

    @Streaming
    @GET( "proceedsReport/reselling" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest );
}
