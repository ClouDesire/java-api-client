package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CloudCredentialDTO;
import com.cloudesire.platform.apiclient.dto.model.patch.CloudCredentialPatchDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface CloudCredentialApi
{
    @POST( "cloudCredential" )
    Call<CloudCredentialDTO> create( @Body CloudCredentialDTO resource );

    @GET( "cloudCredential/{id}" )
    Call<CloudCredentialDTO> get( @Path( "id" ) int id );

    @GET( "cloudCredential" )
    Call<List<CloudCredentialDTO>> getAll();

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
}
