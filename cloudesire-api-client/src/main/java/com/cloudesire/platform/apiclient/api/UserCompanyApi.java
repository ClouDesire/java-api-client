package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.MinimalCompanyDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.UserCompanyDTO;
import com.cloudesire.platform.apiclient.dto.model.patch.BaseCompanyPatchDTO;
import com.cloudesire.platform.apiclient.query.PageRequestQuery;
import com.cloudesire.platform.apiclient.query.UserCompanyQuery;
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

    @GET( "userCompany" )
    Call<List<UserCompanyDTO>> getAll();

    @GET( "userCompany" )
    Call<List<UserCompanyDTO>> getAll( @QueryMap UserCompanyQuery query );

    /**
     * @deprecated by {@link #getAll(UserCompanyQuery)}
     */
    @Deprecated( since = "20240905", forRemoval = true )
    @GET( "userCompany" )
    Call<List<UserCompanyDTO>> getAll( @Query( "textField" ) String textField, @QueryMap PageRequestQuery pageRequest );

    @GET( "userCompany/{id}" )
    Call<UserCompanyDTO> get( @Path( "id" ) int id );

    @GET( "userCompany/{id}/metadata" )
    Call<Map<String, String>> getMetadata( @Path( "id" ) int id );

    @PUT( "userCompany/{id}" )
    Call<UserCompanyDTO> update( @Path( "id" ) int id, @Body UserCompanyDTO company );

    @PUT( "userCompany/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) int id, @Body Map<String, String> payload );

    @PATCH( "userCompany/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body BaseCompanyPatchDTO patch );

    @DELETE( "userCompany/{id}" )
    Call<Void> delete( @Path( "id" ) int id );

    @DELETE( "userCompany/{id}/metadata/{key}" )
    Call<Void> deleteMetadata( @Path( "id" ) int id, @Path( "key" ) String key );
}
