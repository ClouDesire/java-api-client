package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.FileDTO;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Streaming;

public interface CompanyLogoApi
{
    @Multipart
    @POST( "companyLogoFile" )
    Call<FileDTO> create( @Part MultipartBody.Part file );

    @DELETE( "companyLogoFile/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @PATCH( "companyLogoFile/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body Object input );

    @GET( "file/{id}/static" )
    @Headers( "Accept: image/*" )
    @Streaming
    Call<ResponseBody> getFile( @Path( "id" ) Integer id );

    @GET( "companyLogoFile/{id}" )
    Call<FileDTO> get( @Path( "id" ) Integer id );
}
