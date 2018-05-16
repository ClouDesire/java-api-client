package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.FileDTO;
import com.liberologico.cloudesire.cmw.model.dto.ProductFilePatchDTO;
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
import retrofit2.http.Query;

import java.util.List;

public interface ProductFileApi
{
    @Multipart
    @POST( "file" )
    Call<FileDTO> create( @Part MultipartBody.Part file, @Query( "tag" ) String tag,
            @Query( "weight" ) Integer weight );

    @DELETE( "file/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @PATCH( "file/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body ProductFilePatchDTO input );

    @GET( "file" )
    Call<List<FileDTO>> getAll( @Query( "productId" ) Integer productId, @Query( "tag" ) String tag );

    @GET( "file/static/{name}" )
    Call<List<byte[]>> getFile( @Path( "name" ) String name );

    @GET( "file/{id}" )
    Call<FileDTO> get( @Path( "id" ) Integer id );
}
