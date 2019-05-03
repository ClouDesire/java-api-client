package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.BackupPricingDTO;
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

public interface BackupPricingApi
{
    @POST( "backupPricing" )
    Call<BackupPricingDTO> create( @Body BackupPricingDTO resource );

    @GET( "backupPricing" )
    Call<List<BackupPricingDTO>> getAll( @Query( "cloudProvider" ) int cloudProvider );

    @GET( "backupPricing/{id}" )
    Call<BackupPricingDTO> get( @Path( "id" ) int id );

    @PUT( "backupPricing/{id}" )
    Call<BackupPricingDTO> update( @Path( "id" ) int id, @Body BackupPricingDTO pricing );

    @PATCH( "backupPricing/{id}" )
    Call<Void> patch( @Path( "id" ) int id, @Body PricingPatchDTO price );

    @DELETE( "backupPricing/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
