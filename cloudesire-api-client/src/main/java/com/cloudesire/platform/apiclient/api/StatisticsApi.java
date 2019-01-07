package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.StatisticsDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface StatisticsApi
{
    @GET( "statistics" )
    Call<StatisticsDTO> get();

    @GET( "statistics" )
    Call<StatisticsDTO> get( @Query( "environment" ) String environment );

    @GET( "statistics/{year}" )
    Call<StatisticsDTO> get( @Path( "year" ) String year, @Query( "environment" ) String environment );

    @GET( "statistics/{year}/{month}" )
    Call<StatisticsDTO> get( @Path( "year" ) String year, @Path( "month" ) String month,
            @Query( "environment" ) String environment );

    @GET( "statistics/{year}/{month}/{day}" )
    Call<StatisticsDTO> get( @Path( "year" ) String year, @Path( "month" ) String month, @Path( "day" ) String day,
            @Query( "environment" ) String environment );
}
