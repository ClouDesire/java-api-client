package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CommentDTO;
import com.cloudesire.platform.apiclient.query.CommentQuery;
import com.cloudesire.platform.apiclient.query.PageRequestQuery;
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

public interface CommentApi
{
    @POST( "comment" )
    Call<CommentDTO> create( @Body CommentDTO comment );

    @GET( "comment/{id}" )
    Call<CommentDTO> get( @Path( "id" ) int id );

    @GET( "comment" )
    Call<List<CommentDTO>> getAll( @QueryMap CommentQuery query );

    /**
     * @deprecated by {@link #getAll(CommentQuery)}
     */
    @Deprecated
    @GET( "comment" )
    Call<List<CommentDTO>> getListByProduct( @Query( "productId" ) int productId );

    /**
     * @deprecated by {@link #getAll(CommentQuery)}
     */
    @Deprecated
    @GET( "comment" )
    Call<List<CommentDTO>> getListByProduct( @Query( "productId" ) int productId, @QueryMap PageRequestQuery pager );

    @PUT( "comment/{id}" )
    Call<CommentDTO> update( @Path( "id" ) int id, @Body CommentDTO comment );

    @DELETE( "comment/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
