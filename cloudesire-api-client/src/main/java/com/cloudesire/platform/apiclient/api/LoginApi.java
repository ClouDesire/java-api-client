package com.cloudesire.platform.apiclient.api;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface LoginApi
{
    @POST( "login" )
    Call<String> login( @Query( "expire" ) Boolean expire );
}
