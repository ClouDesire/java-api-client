package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ResellerDTO;
import com.cloudesire.platform.apiclient.dto.model.patch.BaseCompanyPatchDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface ResellerApi
{
    @POST( "reseller" )
    Call<ResellerDTO> create( @Body ResellerDTO reseller );

    @GET( "reseller/{id}" )
    Call<ResellerDTO> get( @Path( "id" ) int id );

    @GET( "reseller" )
    Call<List<ResellerDTO>> getAll(
            @Query( "textField" ) String textField,
            @QueryMap Map<String, String> pageRequest );

    @GET( "reseller" )
    Call<List<ResellerDTO>> getAll(
            @Query( "textField" ) String textField,
            @Query( "enabled" ) Boolean enabled,
            @Query( "distributorId" ) Integer distributorId,
            @QueryMap Map<String, String> pageRequest );

    @PUT( "reseller/{id}" )
    Call<ResellerDTO> update( @Path( "id" ) int id, @Body ResellerDTO reseller );

    @PATCH( "reseller/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body BaseCompanyPatchDTO patch );

    @DELETE( "reseller/{id}" )
    Call<Void> delete( @Path( "id" ) int id );

    @GET( "reseller/{id}/metadata" )
    Call<Map<String, String>> getMetadata( @Path( "id" ) int id );

    @PUT( "reseller/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) int id, @Body Map<String, String> payload );

    @DELETE( "reseller/{id}/metadata/{key}" )
    Call<Void> deleteMetadata( @Path( "id" ) int id, @Path( "key" ) String key );
}
