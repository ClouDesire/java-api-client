package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.MailEnvironmentDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;

public interface MailEnvironmentApi
{
    @GET( "mailEnvironment" )
    Call<MailEnvironmentDTO> get();

    @PUT( "mailEnvironment" )
    Call<MailEnvironmentDTO> update( @Body MailEnvironmentDTO mailEnvironmentDTO );

    @DELETE( "mailEnvironment" )
    Call<Void> reset();
}
