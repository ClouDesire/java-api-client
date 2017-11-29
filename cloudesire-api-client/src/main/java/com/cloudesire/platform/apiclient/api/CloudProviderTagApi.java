package com.cloudesire.platform.apiclient.api;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface CloudProviderTagApi
{
    @GET( "cloudProviderTag" )
    Call<List<String>> getAll();
}
