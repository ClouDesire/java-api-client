package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.StackParameterDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface StackParameterApi
{
    @GET( "stackParameter" )
    Call<List<StackParameterDTO>> getAllByNodeRoleId( @Query( "nodeRoleId" ) int nodeRoleId );

    @GET( "stackParameter" )
    Call<List<StackParameterDTO>> getAllByNodeRoleName( @Query( "nodeRoleName" ) String nodeRoleName );

    @GET( "stackParameter" )
    Call<List<StackParameterDTO>> getAll();

    @GET( "stackParameter/{identifier}" )
    Call<StackParameterDTO> get( @Path( "identifier" ) String identifier );
}
