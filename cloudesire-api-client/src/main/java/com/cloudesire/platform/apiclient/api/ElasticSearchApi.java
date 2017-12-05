package com.cloudesire.platform.apiclient.api;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ElasticSearchApi
{
    @POST( "admin/search/index" )
    Call<Void> massIndexes();

    @DELETE( "admin/search/index" )
    Call<Void> dropIndexes( @Query( "entity" ) String entity );
}
