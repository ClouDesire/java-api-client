package com.cloudesire.platform.apiclient.test;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Httpbin
{
    @GET( "bearer" )
    Call<HttpbinBearerResponse> bearer();

    @GET( "get" )
    Call<HttpbinResponse> get();

    @GET( "get" )
    Call<ResponseBody> getResponse();
}
