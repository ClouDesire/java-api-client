package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CompanyGroupDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface CompanyGroupApi
{
    @POST( "companyGroup" )
    Call<CompanyGroupDTO> create( @Body CompanyGroupDTO group );

    @GET( "companyGroup" )
    Call<List<CompanyGroupDTO>> getAll();

    @GET( "companyGroup" )
    Call<List<CompanyGroupDTO>> getAll( @Query( "userCompanyId" ) int userCompanyId );

    @GET( "companyGroup/{id}" )
    Call<CompanyGroupDTO> get( @Path( "id" ) int id );

    @PUT( "companyGroup/{id}" )
    Call<CompanyGroupDTO> update( @Path( "id" ) int id, @Body CompanyGroupDTO group );

    @DELETE( "companyGroup/{id}" )
    Call<CompanyGroupDTO> delete( @Path( "id" ) int id );
}
