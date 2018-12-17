package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.VirtualMachineInstanceDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

import java.util.List;
import java.util.Map;

public interface VMInstanceApi
{
    @GET( "virtualMachineInstance" )
    Call<List<VirtualMachineInstanceDTO>> getAll();

    @GET( "virtualMachineInstance/nodename={nodename}" )
    Call<VirtualMachineInstanceDTO> getByNodeName( @Path( "nodename" ) String nodename );

    @GET( "virtualMachineInstance/{id}" )
    Call<VirtualMachineInstanceDTO> get( @Path( "id" ) int id );

    @PATCH( "virtualMachineInstance/{id}" )
    Call<Void> patch( @Path( "id" ) int id, @Body Map<String, Object> input );

    @DELETE( "virtualMachineInstance/{id}" )
    Call<Void> delete( @Path( "id" ) int id );
}
