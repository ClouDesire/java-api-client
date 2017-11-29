package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.DiskSpacePricingDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;

public interface DiskSpacePricingApi
{
    @POST( "diskSpacePricing" )
    Call<DiskSpacePricingDTO> create( @Body DiskSpacePricingDTO resource );

    @GET( "diskSpacePricing" )
    Call<List<DiskSpacePricingDTO>> getAll( @Query( "cloudProvider" ) Integer cloudProvider );
}
