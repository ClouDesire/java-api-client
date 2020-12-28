package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ApplicationFileDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.ApplicationFileEnvironmentDTO;
import com.cloudesire.platform.apiclient.dto.model.enums.AssociationType;
import com.cloudesire.platform.apiclient.query.ApplicationFileQuery;
import com.cloudesire.platform.apiclient.query.PageRequestQuery;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

public interface ApplicationFileApi
{
    @POST( "applicationFile" )
    Call<ApplicationFileDTO> create( @Body ApplicationFileDTO file );

    @GET( "applicationFile" )
    Call<List<ApplicationFileDTO>> getAll( @QueryMap PageRequestQuery pageRequest );

    @GET( "applicationFile" )
    Call<List<ApplicationFileDTO>> getAll( @QueryMap ApplicationFileQuery pageRequest );

    /**
     * @deprecated by {@link #getAll(ApplicationFileQuery)}
     */
    @Deprecated
    @GET( "applicationFile" )
    Call<List<ApplicationFileDTO>> getAll( @QueryMap PageRequestQuery pageRequest,
            @Query( "associationType" ) AssociationType type );

    @GET( "applicationFile" )
    Call<List<ApplicationFileDTO>> getAllVersions( @Query( "virtualMachineInstance" ) int virtualMachineInstanceId );

    @GET( "applicationFile/{id}/environment" )
    Call<List<ApplicationFileEnvironmentDTO>> getEnvironments( @Path( "id" ) int id );

    @GET( "applicationFile/active" )
    Call<ApplicationFileDTO> getActive( @Query( "virtualMachineConfiguration" ) Integer virtualMachineConfiguration,
            @Query( "name" ) String name );

    @GET( "applicationFile/{id}" )
    Call<ApplicationFileDTO> get( @Path( "id" ) int id );

    @GET( "applicationFile/private/{id}" )
    @Headers( "Accept: image/*" )
    @Streaming
    Call<ResponseBody> getFile( @Path( "id" ) int id );

    @GET( "applicationFile/static/{secret}/{id}" )
    @Headers( "Accept: image/*" )
    @Streaming
    Call<ResponseBody> getFile( @Path( "id" ) int id, @Path( "secret" ) String secret );

    @PUT( "applicationFile/{id}" )
    Call<ApplicationFileDTO> update( @Path( "id" ) int id, @Body ApplicationFileDTO input );

    @PATCH( "applicationFile/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body Map<String, Object> input );

    @PATCH( "applicationFile/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body Map<String, Object> input,
            @Query( "language" ) String language );

    @DELETE( "applicationFile/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
