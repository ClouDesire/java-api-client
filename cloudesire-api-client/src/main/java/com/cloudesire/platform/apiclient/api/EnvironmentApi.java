package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.EnvironmentDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.util.List;

public interface EnvironmentApi
{
    @GET( "environment/{name}" )
    Call<EnvironmentDTO> get( @Path( "name" ) String name );

    @GET( "environment" )
    Call<List<EnvironmentDTO>> getAll();

    @PUT( "environment/{name}" )
    Call<EnvironmentDTO> update( @Path( "name" ) String name, @Body EnvironmentDTO environmentDTO );

    @GET( "environment/{name}/sitemap" )
    Call<String> getSitemap( @Path( "name" ) String name );

    @DELETE( "environment" )
    Call<Void> reset();
}
