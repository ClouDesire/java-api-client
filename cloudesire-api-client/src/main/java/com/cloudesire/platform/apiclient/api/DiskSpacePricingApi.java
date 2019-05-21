package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.DiskSpacePricingDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.PricingPatchDTO;
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

public interface DiskSpacePricingApi
{
    @POST( "diskSpacePricing" )
    Call<DiskSpacePricingDTO> create( @Body DiskSpacePricingDTO resource );

    @GET( "diskSpacePricing" )
    Call<List<DiskSpacePricingDTO>> getAll( @Query( "cloudProvider" ) int cloudProvider );

    @GET( "diskSpacePricing/{id}" )
    Call<DiskSpacePricingDTO> get( @Path( "id" ) int id );

    @PUT( "diskSpacePricing/{id}" )
    Call<DiskSpacePricingDTO> update( @Path( "id" ) int id, @Body DiskSpacePricingDTO pricing );

    /**
     * @deprecated use {@link #update(int, DiskSpacePricingDTO)}
     */
    @Deprecated
    @PATCH( "diskSpacePricing/{id}" )
    Call<Void> patch( @Path( "id" ) int id, @Body PricingPatchDTO price );

    @DELETE( "diskSpacePricing/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
