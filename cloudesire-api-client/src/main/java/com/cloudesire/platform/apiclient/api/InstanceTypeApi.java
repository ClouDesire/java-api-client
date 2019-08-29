package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.InstanceTypeDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface InstanceTypeApi
{
    @POST( "instanceType" )
    Call<InstanceTypeDTO> create( @Body InstanceTypeDTO instanceType );

    @GET( "instanceType" )
    Call<List<InstanceTypeDTO>> getAll();

    @GET( "instanceType" )
    Call<List<InstanceTypeDTO>> getAll( @Query( "cloudProviderId" ) int cloudProviderId );

    @GET( "instanceType/{id}" )
    Call<InstanceTypeDTO> get( @Path( "id" ) int id );

    @PUT( "instanceType/{id}" )
    Call<InstanceTypeDTO> update( @Path( "id" ) int id, @Body InstanceTypeDTO instanceType );

    @DELETE( "instanceType/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
