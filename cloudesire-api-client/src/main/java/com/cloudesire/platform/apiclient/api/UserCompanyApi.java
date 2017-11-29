package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.CompanyDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserCompanyApi
{
    @POST( "userCompany" )
    Call<CompanyDTO> create( @Body CompanyDTO company );

    @GET( "userCompany/externalId={extId}" )
    Call<CompanyDTO> getByExternalId( @Path( "extId" ) String extId );

    @GET( "userCompany/{id}" )
    Call<CompanyDTO> get( @Path( "id" ) int id );

    @PUT( "userCompany/{id}" )
    Call<CompanyDTO> update( @Path( "id" ) int id, @Body CompanyDTO company );

    @DELETE( "userCompany/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
