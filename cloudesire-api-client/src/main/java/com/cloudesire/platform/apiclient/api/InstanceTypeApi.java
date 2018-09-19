package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.InstanceTypeDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface InstanceTypeApi
{
    @GET( "instanceType" )
    Call<List<InstanceTypeDTO>> getAll();

    @GET( "instanceType" )
    Call<List<InstanceTypeDTO>> getAll( @Query( "cloudProviderId" ) int cloudProviderId );
}
