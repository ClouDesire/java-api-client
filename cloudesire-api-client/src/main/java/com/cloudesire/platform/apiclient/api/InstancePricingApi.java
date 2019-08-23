package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.InstancePricingDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.InstancePricingPatchDTO;
import com.liberologico.cloudesire.common.enums.OSType;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
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

    @Deprecated
    @GET( "instancePricing" )
    Call<List<InstancePricingDTO>> getCompatible(
            @Query( "cloudProvider" ) int cloudProvider,
            @Query( "virtualMachineConfiguration" ) int virtualMachineConfiguration,
            @Query( "osType" ) OSType osType
    );

    @PUT( "instancePricing/{id}" )
    Call<InstancePricingDTO> update( @Path( "id" ) int id, @Body InstancePricingDTO resource );

    /**
     * @deprecated use {@link #update(int, InstancePricingDTO)}
     */
    @Deprecated
    @PATCH( "instancePricing/{id}" )
    Call<Void> patch( @Path( "id" ) int id, @Body InstancePricingPatchDTO input );

    @DELETE( "instancePricing/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
