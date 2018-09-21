package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.SingleInstancePricingPatchDTO;
import com.liberologico.cloudesire.cmw.model.dto.InstancePricingDTO;
import com.liberologico.cloudesire.cmw.model.patch.InstancePricingPatchDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface InstancePricingApi
{
    @POST( "instancePricing" )
    Call<InstancePricingDTO> create( @Body InstancePricingDTO outres );

    @GET( "instancePricing/{id}" )
    Call<InstancePricingDTO> get( @Path( "id" ) int id );

    @GET( "instancePricing" )
    Call<List<InstancePricingDTO>> getAll( @Query( "cloudProvider" ) Integer cloudProvider );

    @GET( "instancePricing" )
    Call<List<InstancePricingDTO>> getAll(
            @Query( "cloudProvider" ) int cloudProvider, @Query( "deprecated" ) Boolean deprecated
    );

    @GET( "instancePricing" )
    Call<List<InstancePricingDTO>> getLinked(
            @Query( "cloudProvider" ) int cloudProvider,
            @Query( "virtualMachineConfiguration" ) int virtualMachineConfiguration
    );

    @PATCH( "instancePricing" )
    Call<Void> patch( @Body InstancePricingPatchDTO input );

    @PATCH( "instancePricing/{id}" )
    Call<Void> patch( @Path( "id" ) int id, @Body SingleInstancePricingPatchDTO input );

    @DELETE( "instancePricing/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
