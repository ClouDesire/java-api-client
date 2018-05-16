package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.FileDTO;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

import java.util.List;

public interface CompanyLogoApi
{
    @Multipart
    @POST( "companyLogoFile" )
    Call<FileDTO> create( @Part MultipartBody.Part file );

    @DELETE( "companyLogoFile/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @PATCH( "companyLogoFile/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body Object input );

    @GET( "companyLogoFile/static/{name}" )
    Call<List<byte[]>> getFile( @Path( "name" ) String name );

    @GET( "companyLogoFile/{id}" )
    Call<FileDTO> get( @Path( "id" ) Integer id );
}
