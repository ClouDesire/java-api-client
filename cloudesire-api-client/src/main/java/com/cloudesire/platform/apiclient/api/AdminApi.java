package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CacheDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.TaskExecutorDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.UrlEntityDTO;
import com.cloudesire.platform.apiclient.query.PageRequestQuery;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;

public interface AdminApi
{
    @GET( "task" )
    Call<List<TaskExecutorDTO>> getTasks();

    @PATCH( "task/{className}" )
    Call<Void> executeTask( @Path ( "className" ) String className );

    @GET( "admin/report" )
    Call<List<UrlEntityDTO>> retrieveInvoicesWithoutReport( @QueryMap PageRequestQuery page );

    @POST( "admin/report" )
    Call<Void> generateMissingReports( @QueryMap PageRequestQuery page );

    @DELETE( "admin/report" )
    Call<Void> deleteReports( @Query( "invoiceId" ) int invoiceId );

    @GET( "cache" )
    Call<CacheDTO> getCache();

    @DELETE( "cache" )
    Call<Void> emptyCache();
}
