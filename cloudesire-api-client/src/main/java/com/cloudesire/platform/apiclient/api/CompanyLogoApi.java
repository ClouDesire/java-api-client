package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.FileDTO;
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
import retrofit2.http.Query;
import retrofit2.http.Streaming;

public interface CompanyLogoApi
{
    @Multipart
    @POST( "companyLogoFile" )
    Call<FileDTO> create( @Part MultipartBody.Part file );

    @GET( "companyLogoFile/{id}" )
    Call<FileDTO> get( @Path( "id" ) int id );

    @GET( "companyLogoFile/{id}/static" )
    @Headers( "Accept: image/*" )
    @Streaming
    Call<ResponseBody> getFile( @Path( "id" ) int id );

    @PATCH( "companyLogoFile/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body Object input );

    @PATCH( "companyLogoFile/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body Object input, @Query( "language" ) String language );

    @DELETE( "companyLogoFile/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
