package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.MailRequestDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MessageApi
{
    @POST( "message/send" )
    Call<Void> send( @Body MailRequestDTO request );
}
