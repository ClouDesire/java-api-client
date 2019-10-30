package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.MinimalCompanyDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.UserCompanyDTO;
import com.cloudesire.platform.apiclient.dto.model.patch.BaseCompanyPatchDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.util.Map;

public interface UserCompanyApi
{
    @POST( "userCompany" )
    Call<UserCompanyDTO> create( @Body UserCompanyDTO company );

    /**
     * @deprecated by {@link #create(UserCompanyDTO)}
     */
    @Deprecated
    @POST( "userCompany" )
    Call<UserCompanyDTO> create( @Body MinimalCompanyDTO company );

    @GET( "userCompany/externalId={extId}" )
    Call<UserCompanyDTO> getByExternalId( @Path( "extId" ) String extId );

    @GET( "userCompany/{id}" )
    Call<UserCompanyDTO> get( @Path( "id" ) int id );

    @GET( "userCompany/{id}/metadata" )
    Call<Map<String, Object>> getMetadata( @Path( "id" ) int id );

    @PUT( "userCompany/{id}" )
    Call<UserCompanyDTO> update( @Path( "id" ) int id, @Body UserCompanyDTO company );

    @PUT( "userCompany/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) int id, @Body Map<String, Object> payload );

    @PATCH( "userCompany/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body BaseCompanyPatchDTO patch );

    @DELETE( "userCompany/{id}" )
    Call<Void> delete( @Path( "id" ) int id );

    @DELETE( "userCompany/{id}/metadata/{key}" )
    Call<Void> deleteMetadata( @Path( "id" ) int id, @Path( "key" ) String key );
}
