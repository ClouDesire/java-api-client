package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.CommentDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface UserReviewsApi
{
    @POST( "comment" )
    Call<CommentDTO> create( @Body CommentDTO resource );

    @DELETE( "comment/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @GET( "comment" )
    Call<List<CommentDTO>> getAllByProductAndUser( @Query( "product" ) Integer product, @Query( "user" ) Integer user );

    @GET( "comment/product={id}" )
    Call<List<CommentDTO>> getAll( @Path( "id" ) Integer id, @QueryMap Map<String, String> pageRequest );

    @GET( "comment/{id}" )
    Call<CommentDTO> get( @Path( "id" ) Integer id );

    @PUT( "comment/{id}" )
    Call<CommentDTO> update( @Path( "id" ) Integer id, @Body CommentDTO resource );
}
