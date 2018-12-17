package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.PageRequestDTO;
import com.liberologico.cloudesire.cmw.model.dto.TaskExecutorDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

public interface AdminApi
{
    @GET( "task" )
    Call<List<TaskExecutorDTO>> getTasks();

    @PATCH( "task/{className}" )
    Call<Void> executeTask( @Path ( "className" ) String className );

    @POST( "admin/report/generate" )
    Call<Void> generateMissingReports( @Body PageRequestDTO page );

    @DELETE( "admin/report/purge" )
    Call<Void> purgeReports();

    @DELETE( "admin/zip" )
    Call<Void> reloadZipFileConfiguration();

    @DELETE( "cache" )
    Call<Void> emptyCache();
}
