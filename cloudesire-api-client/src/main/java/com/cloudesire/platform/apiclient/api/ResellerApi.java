package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.ResellerDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ResellerApi
{
    @POST( "reseller" )
    Call<ResellerDTO> create( @Body ResellerDTO reseller );

    @GET( "reseller/{id}" )
    Call<ResellerDTO> get( @Path( "id" ) int id );

    @PUT( "reseller/{id}" )
    Call<ResellerDTO> update( @Path( "id" ) int id, @Body ResellerDTO reseller );

    @DELETE( "reseller/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
