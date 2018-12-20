package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.MinimalCompanyDTO;
import com.liberologico.cloudesire.cmw.model.dto.UserCompanyDTO;
import com.liberologico.cloudesire.cmw.model.patch.BaseCompanyPatchDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserCompanyApi
{
    @POST( "userCompany" )
    Call<UserCompanyDTO> create( @Body MinimalCompanyDTO company );

    @GET( "userCompany/externalId={extId}" )
    Call<UserCompanyDTO> getByExternalId( @Path( "extId" ) String extId );

    @GET( "userCompany/{id}" )
    Call<UserCompanyDTO> get( @Path( "id" ) int id );

    @PUT( "userCompany/{id}" )
    Call<UserCompanyDTO> update( @Path( "id" ) int id, @Body UserCompanyDTO company );

    @PATCH( "userCompany/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body BaseCompanyPatchDTO patch );

    @DELETE( "userCompany/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
