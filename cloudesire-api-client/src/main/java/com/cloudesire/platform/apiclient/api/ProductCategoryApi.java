package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.ProductCategoryDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

import static com.liberologico.cloudesire.cmw.model.constants.Headers.MODE;
import static com.liberologico.cloudesire.cmw.model.constants.Parameters.RESELLER;

public interface ProductCategoryApi
{
    @GET( "category" )
    Call<List<ProductCategoryDTO>> getAll();

    @GET( "category" )
    Call<List<ProductCategoryDTO>> getList( @Header( MODE ) String mode );

    @GET( "category" )
    Call<List<ProductCategoryDTO>> getList( @Header( MODE ) String mode, @Query( RESELLER ) String reseller );

    @GET( "category/{id}" )
    Call<ProductCategoryDTO> get( @Path( "id" ) int id );

    @POST( "category" )
    Call<ProductCategoryDTO> create( @Body ProductCategoryDTO category );

    @DELETE( "category/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
