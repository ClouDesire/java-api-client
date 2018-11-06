package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.body.VMInstancePatch;
import com.liberologico.cloudesire.cmw.model.dto.VirtualMachineInstanceDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

import java.util.List;

public interface VMInstanceApi
{
    @GET( "virtualMachineInstance" )
    Call<List<VirtualMachineInstanceDTO>> getAll();

    @GET( "virtualMachineInstance/nodename={nodename}" )
    Call<VirtualMachineInstanceDTO> getByNodeName( @Path( "nodename" ) String nodename );

    @GET( "virtualMachineInstance/{id}" )
    Call<VirtualMachineInstanceDTO> get( @Path( "id" ) Integer id );

    @DELETE( "virtualMachineInstance/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @PATCH( "virtualMachineInstance/{id}" )
    Call<Void> patch( @Path( "id" ) Integer id, @Body VMInstancePatch input );
}
