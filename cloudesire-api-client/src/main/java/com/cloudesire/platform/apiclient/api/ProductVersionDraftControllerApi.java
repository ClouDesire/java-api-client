package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ProductVersionDraftDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface ProductVersionDraftControllerApi
{
    @GET( "productVersion/{id}/draft" )
    Call<ProductVersionDraftDTO> get( @Path( "id" ) Integer id );

    @GET( "productVersion/draft" )
    Call<List<ProductVersionDraftDTO>> getAll( @QueryMap Map<String, String> pageRequest );
}
