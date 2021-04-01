package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CloudCredentialDTO;
import com.cloudesire.platform.apiclient.dto.model.patch.CloudCredentialPatchDTO;
import com.cloudesire.platform.apiclient.query.CloudCredentialQuery;
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

public interface CloudCredentialApi
{
    @POST( "cloudCredential" )
    Call<CloudCredentialDTO> create( @Body CloudCredentialDTO resource );

    @GET( "cloudCredential/{id}" )
    Call<CloudCredentialDTO> get( @Path( "id" ) int id );

    @GET( "cloudCredential" )
    Call<List<CloudCredentialDTO>> getAll();

    @GET( "cloudCredential" )
    Call<List<CloudCredentialDTO>> getAll( @QueryMap CloudCredentialQuery query );

    /**
     * @deprecated by {@link #getAll(CloudCredentialQuery)}
     */
    @Deprecated
    @GET( "cloudCredential" )
    Call<List<CloudCredentialDTO>> getAll(
            @Query( "providerId" ) Integer providerId,
            @Query( "userCompanyId" ) Integer userCompanyId,
            @Query( "userId" ) Integer userId
    );

    @PATCH( "cloudCredential/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body CloudCredentialPatchDTO input );

    @DELETE( "cloudCredential/{id}" )
    Call<Void> delete( @Path( "id" ) int id );

    @GET( "cloudCredential/{id}/metadata" )
    Call<Map<String, String>> getMetadata( @Path( "id" ) int id );

    @PUT( "cloudCredential/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) int id, @Body Map<String, String> payload );

    @DELETE( "cloudCredential/{id}/metadata/{key}" )
    Call<Void> deleteMetadata( @Path( "id" ) int id, @Path( "key" ) String key );
}
