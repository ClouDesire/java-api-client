package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.ApplicationMetricDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApplicationMetricApi
{
    @POST( "applicationMetric" )
    Call<ApplicationMetricDTO> create( @Body ApplicationMetricDTO input );

    @DELETE( "applicationMetric/{id}" )
    Call<Void> delete( @Path( "id" ) int id );

    @GET( "applicationMetric" )
    Call<ApplicationMetricDTO> getAllByProduct( @Query( "productId" ) String productId );

    @GET( "applicationMetric/{id}" )
    Call<ApplicationMetricDTO> get( @Path( "id" ) int id );

    @PUT( "applicationMetric/{id}" )
    Call<ApplicationMetricDTO> update( @Body ApplicationMetricDTO input, @Path( "id" ) int id );
}
