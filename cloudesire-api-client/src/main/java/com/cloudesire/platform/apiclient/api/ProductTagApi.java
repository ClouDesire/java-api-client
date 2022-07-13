package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.ProductTagDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.Set;

public interface ProductTagApi
{
    @GET( "productTag" )
    Call<Set<ProductTagDTO>> getAll();
}
