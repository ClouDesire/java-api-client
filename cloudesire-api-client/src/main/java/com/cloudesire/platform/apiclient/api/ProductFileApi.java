package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.FileDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.ProductFilePatchDTO;
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

import java.util.List;

public interface ProductFileApi
{
    @Multipart
    @POST( "file" )
    Call<FileDTO> create( @Part MultipartBody.Part file, @Query( "tag" ) String tag );

    @Multipart
    @POST( "file" )
    Call<FileDTO> create( @Part MultipartBody.Part file, @Query( "tag" ) String tag,
            @Query( "weight" ) Integer weight );

    @GET( "file" )
    Call<List<FileDTO>> getAll( @Query( "productId" ) int productId, @Query( "tag" ) String tag );

    @GET( "file/{id}" )
    Call<FileDTO> get( @Path( "id" ) int id );

    @GET( "file/{id}/static" )
    @Headers( "Accept: image/*" )
    @Streaming
    Call<ResponseBody> getFile( @Path( "id" ) int id );

    /**
     * @deprecated by {@link #getFile(int)}
     */
    @Deprecated
    @GET( "file/static/{name}" )
    @Streaming
    Call<ResponseBody> getFile( @Path( "name" ) String name );

    @PATCH( "file/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body ProductFilePatchDTO input );

    @DELETE( "file/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
