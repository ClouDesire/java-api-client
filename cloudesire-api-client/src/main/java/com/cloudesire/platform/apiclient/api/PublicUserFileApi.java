package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.FileDTO;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Streaming;

public interface PublicUserFileApi
{
    @Multipart
    @POST( "publicUserFile" )
    Call<FileDTO> create( @Part() MultipartBody.Part file );

    @GET( "publicUserFile/{id}" )
    Call<FileDTO> get( @Path( "id" ) int id );

    @GET( "publicUserFile/static/{name}" )
    Call<ResponseBody> download( @Path( "name" ) String name );

    @GET( "publicUserFile/static/{name}" )
    @Headers( "Accept: image/*" )
    @Deprecated
    Call<ResponseBody> downloadImage( @Path( "name" ) String name );

    @GET( "file/{id}/static" )
    @Headers( "Accept: image/*" )
    @Streaming
    Call<ResponseBody> getFile( @Path( "id" ) Integer id );

    @DELETE( "publicUserFile/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
