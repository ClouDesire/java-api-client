package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ProductCategoryDTO;
import com.cloudesire.platform.apiclient.query.CategoryQuery;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;

import static com.cloudesire.platform.apiclient.response.Headers.MODE;
import static com.cloudesire.platform.apiclient.dto.model.constants.Parameters.DISTRIBUTOR;
import static com.cloudesire.platform.apiclient.dto.model.constants.Parameters.RESELLER;

public interface ProductCategoryApi
{
    @POST( "category" )
    Call<ProductCategoryDTO> create( @Body ProductCategoryDTO category );

    @GET( "category" )
    Call<List<ProductCategoryDTO>> getAll();

    @GET( "category" )
    Call<List<ProductCategoryDTO>> getAll( @QueryMap CategoryQuery query );

    @GET( "category" )
    Call<List<ProductCategoryDTO>> getAll( @Header( MODE ) String mode, @QueryMap CategoryQuery query );

    /**
     * @deprecated by {@link #getAll(String, CategoryQuery)}
     */
    @Deprecated
    @GET( "category" )
    Call<List<ProductCategoryDTO>> getList( @Header( MODE ) String mode );

    /**
     * @deprecated by {@link #getAll(String, CategoryQuery)}
     */
    @Deprecated
    @GET( "category" )
    Call<List<ProductCategoryDTO>> getList( @Header( MODE ) String mode, @Query( RESELLER ) String reseller );

    /**
     * @deprecated by {@link #getAll(String, CategoryQuery)}
     */
    @Deprecated
    @GET( "category" )
    Call<List<ProductCategoryDTO>> getList( @Header( MODE ) String mode, @Query( DISTRIBUTOR ) String distributor,
            @Query( RESELLER ) String reseller );

    @GET( "category/{id}" )
    Call<ProductCategoryDTO> get( @Path( "id" ) int id );

    @DELETE( "category/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
