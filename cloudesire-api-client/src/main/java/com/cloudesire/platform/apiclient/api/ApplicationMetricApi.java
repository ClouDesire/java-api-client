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

import java.util.List;

public interface ApplicationMetricApi
{
    @POST( "applicationMetric" )
    Call<ApplicationMetricDTO> create( @Body ApplicationMetricDTO input );

    @GET( "applicationMetric" )
    Call<List<ApplicationMetricDTO>> getAllByProduct( @Query( "productId" ) int productId );

    @GET( "applicationMetric" )
    Call<List<ApplicationMetricDTO>> getAllByVMC( @Query( "virtualMachineConfiguration" ) int vmcId );

    @GET( "applicationMetric/{id}" )
    Call<ApplicationMetricDTO> get( @Path( "id" ) int id );

    @PUT( "applicationMetric/{id}" )
    Call<ApplicationMetricDTO> update( @Path( "id" ) int id, @Body ApplicationMetricDTO input );

    @DELETE( "applicationMetric/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
