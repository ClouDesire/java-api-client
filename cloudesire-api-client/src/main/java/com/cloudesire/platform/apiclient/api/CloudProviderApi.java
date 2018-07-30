package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.CloudProviderDTO;
import com.liberologico.cloudesire.cmw.model.enums.ProductType;
import com.liberologico.cloudesire.cmw.model.patch.CloudProviderPatchDTO;
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
import java.util.Map;

public interface CloudProviderApi
{
    @POST( "cloudProvider" )
    Call<CloudProviderDTO> create( @Body CloudProviderDTO resource );

    @DELETE( "cloudProvider/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @GET( "cloudProvider" )
    Call<List<CloudProviderDTO>> getAll(
            @Query( "excluding" ) List<Integer> excluding,
            @Query( "withDisabled" ) Boolean withDisabled,
            @Query( "enabled" ) Boolean enabled,
            @Query( "productType" ) ProductType productType
    );

    @GET( "cloudProvider/{id}" )
    Call<CloudProviderDTO> get( @Path( "id" ) Integer id );

    @GET( "cloudProvider/cloudProviderTags" )
    Call<Map<String, String>> getTags();

    @PATCH( "cloudProvider/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body CloudProviderPatchDTO input );

    @PUT( "cloudProvider/{id}" )
    Call<CloudProviderDTO> update( @Body CloudProviderDTO providerDTO, @Path( "id" ) Integer id );
}
