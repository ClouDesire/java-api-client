package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.FileDTO;
import com.liberologico.cloudesire.cmw.model.dto.ProductImageFilePatchDTO;
import okhttp3.RequestBody;
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

/**
 * @deprecated by {@link ProductFileApi}
 */
@Deprecated
public interface ProductImageFileApi
{
    @Multipart
    @POST( "productImageFile" )
    Call<FileDTO> create( @Part( "file\"; filename=\"file" ) RequestBody file,
            @Query( "weight" ) Integer weight );

    @DELETE( "productImageFile/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @PATCH( "productImageFile/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body ProductImageFilePatchDTO input );

    @GET( "productImageFile" )
    Call<List<FileDTO>> getAll( @Query( "productId" ) Integer productId, @Query( "tag" ) String tag );

    @GET( "productImageFile/static/{name}" )
    Call<List<byte[]>> getFile( @Path( "name" ) String name );

    @GET( "productImageFile/{id}" )
    Call<FileDTO> get( @Path( "id" ) Integer id );
}
