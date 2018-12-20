package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.CountryCodeDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

import static com.liberologico.cloudesire.cmw.model.constants.Parameters.LANGUAGE;

public interface CountryCodeApi
{
    @GET( "countryCodes" )
    Call<List<CountryCodeDTO>> getAll( @Query( LANGUAGE ) String language );

    @GET( "countryCodes" )
    Call<CountryCodeDTO> get( @Query( "country" ) String country );
}
