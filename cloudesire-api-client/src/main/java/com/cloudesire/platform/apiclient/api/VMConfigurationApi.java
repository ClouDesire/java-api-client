package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.VirtualMachineConfigurationDTO;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface VMConfigurationApi
{
    @POST( "virtualMachineConfiguration" )
    Call<VirtualMachineConfigurationDTO> create( @Body VirtualMachineConfigurationDTO inputVmc );

    @DELETE( "virtualMachineConfiguration/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @PATCH( "virtualMachineConfiguration/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body Object input );

    @GET( "virtualMachineConfiguration" )
    Call<List<VirtualMachineConfigurationDTO>> getAllVMC( @QueryMap Map<String, String> pageRequest,
            @Query( "applicationFileAssociationType" ) String applicationFileAssociationType );

    @GET( "virtualMachineConfiguration/{id}/compose" )
    Call<List<byte[]>> getDockerCompose( @Path( "id" ) Integer id );

    @GET( "virtualMachineConfiguration/{id}" )
    Call<VirtualMachineConfigurationDTO> getVMC( @Path( "id" ) Integer id );

    @Multipart
    @POST( "virtualMachineConfiguration/{id}/compose" )
    Call<VirtualMachineConfigurationDTO> parseDockerCompose( @Path( "id" ) Integer id,
            @Part MultipartBody.Part file, @Query( "version" ) String version );

    @PUT( "virtualMachineConfiguration/{id}" )
    Call<VirtualMachineConfigurationDTO> update( @Body VirtualMachineConfigurationDTO vmc, @Path( "id" ) Integer id );
}
