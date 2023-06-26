package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.VirtualMachineConfigurationDTO;
import com.cloudesire.platform.apiclient.dto.model.enums.AssociationType;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface VirtualMachineConfigurationApi
{
    @POST( "virtualMachineConfiguration" )
    Call<VirtualMachineConfigurationDTO> create( @Body VirtualMachineConfigurationDTO inputVmc );

    @DELETE( "virtualMachineConfiguration/{id}" )
    Call<Void> delete( @Path( "id" ) int id );

    @PATCH( "virtualMachineConfiguration/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body Object input );

    @GET( "virtualMachineConfiguration" )
    Call<List<VirtualMachineConfigurationDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    @GET( "virtualMachineConfiguration" )
    Call<List<VirtualMachineConfigurationDTO>> getAll(
            @Query( "applicationFileAssociationType" ) AssociationType applicationFileAssociationType,
            @QueryMap Map<String, String> pageRequest
    );

    @GET( "virtualMachineConfiguration/{id}" )
    Call<VirtualMachineConfigurationDTO> get( @Path( "id" ) int id );

    @PUT( "virtualMachineConfiguration/{id}" )
    Call<VirtualMachineConfigurationDTO> update( @Path( "id" ) int id, @Body VirtualMachineConfigurationDTO vmc );
}
