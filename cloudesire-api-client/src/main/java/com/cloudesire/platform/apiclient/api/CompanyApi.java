package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.body.CompanyPatch;
import com.liberologico.cloudesire.cmw.model.dto.CompanyDTO;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

public interface CompanyApi
{
    @POST( "company" )
    Call<CompanyDTO> create( @Body CompanyDTO company );

    @POST( "company" )
    Call<CompanyDTO> create( @Body CompanyDTO company, @Query( "type" ) CompanyDTO.Type type );

    @DELETE( "company/externalId={extid}" )
    Call<Void> deleteByExternalId( @Path( "extid" ) String extid );

    @DELETE( "company/{id}" )
    Call<Void> delete( @Path( "id" ) int id );

    @PATCH( "company/externalId={extId}" )
    Call<Void> partialUpdate( @Path( "extId" ) String extId, @Body Object input );

    @GET( "company" )
    Call<List<CompanyDTO>> getAllPaged( @QueryMap Map<String, String> pageRequest, @Query( "email" ) String email,
            @Query( "companyName" ) String companyName, @Query( "like" ) Boolean like );

    @GET( "company/externalId={extId}" )
    Call<CompanyDTO> getByExternalId( @Path( "extId" ) String extId );

    @GET( "company/typeahead/{query}" )
    Call<List<CompanyDTO>> getTypeahead( @Path( "query" ) String query );

    @GET( "company/{id}" )
    Call<CompanyDTO> get( @Path( "id" ) int id );

    @PATCH( "company/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body CompanyPatch input );

    @PUT( "company/{id}" )
    Call<CompanyDTO> update( @Path( "id" ) int id, @Body CompanyDTO company );

    @Streaming
    @GET( "company" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest, @Query( "email" ) String email,
            @Query( "companyName" ) String companyName, @Query( "like" ) Boolean like );

    @Streaming
    @GET( "company" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest );
}
