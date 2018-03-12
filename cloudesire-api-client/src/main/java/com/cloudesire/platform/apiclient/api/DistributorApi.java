package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.DistributorDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface DistributorApi
{
    @POST( "distributor" )
    Call<DistributorDTO> create( @Body DistributorDTO distributor );

    @GET( "distributor/{id}" )
    Call<DistributorDTO> get( @Path( "id" ) int id );

    @GET( "distributor" )
    Call<List<DistributorDTO>> getAll(
            @Query( "textField" ) String textField,
            @QueryMap Map<String, String> pageRequest );

    @PUT( "distributor/{id}" )
    Call<DistributorDTO> update( @Path( "id" ) int id, @Body DistributorDTO distributor );

    @DELETE( "distributor/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
