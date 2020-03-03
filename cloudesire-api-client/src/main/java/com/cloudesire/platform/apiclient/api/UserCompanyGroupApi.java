package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.UserCompanyGroupDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface UserCompanyGroupApi
{
    @POST( "userCompanyGroup" )
    Call<UserCompanyGroupDTO> create( @Body UserCompanyGroupDTO group );

    @GET( "userCompanyGroup" )
    Call<List<UserCompanyGroupDTO>> getAll();

    @GET( "userCompanyGroup" )
    Call<List<UserCompanyGroupDTO>> getAll( @Query( "userCompanyId" ) int userCompanyId );

    @GET( "userCompanyGroup/{id}" )
    Call<UserCompanyGroupDTO> get( @Path( "id" ) int id );

    @PUT( "userCompanyGroup/{id}" )
    Call<UserCompanyGroupDTO> update( @Path( "id" ) int id, @Body UserCompanyGroupDTO group );

    @DELETE( "userCompanyGroup/{id}" )
    Call<UserCompanyGroupDTO> delete( @Path( "id" ) int id );
}
