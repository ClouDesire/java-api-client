package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.VendorReportLineDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.VendorTotalsDTO;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

public interface VendorReportApi
{
    @GET( "proceedsReport/vendor" )
    Call<List<VendorReportLineDTO>> getAll();

    @GET( "proceedsReport/vendor" )
    Call<List<VendorReportLineDTO>> getAll( @QueryMap Map<String, String> filters );

    @GET( "proceedsReport/vendor/totals" )
    Call<VendorTotalsDTO> getTotals( @QueryMap Map<String, String> filters );

    @Streaming
    @GET( "proceedsReport/vendor" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest );
}
