package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.PageRequestDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;

public interface AdminApi
{
    @POST( "admin/report/generate" )
    Call<Void> generateMissingReports( @Body PageRequestDTO page );

    @DELETE( "admin/report/purge" )
    Call<Void> purgeReports();
}
