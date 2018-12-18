package com.cloudesire.platform.apiclient;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface EnumApi
{
    @GET( "enum/{name}" )
    Call<List<String>> get( String name );
}
