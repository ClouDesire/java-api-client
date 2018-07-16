package com.cloudesire.platform.apiclient.test;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Httpbin
{
    @GET( "get" )
    Call<HttpbinResponse> get();
}
