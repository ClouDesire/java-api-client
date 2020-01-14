package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;

public class TokenDataDTO extends PaymentDataDTO
{
    @JsonProperty( "stripeToken" )
    @NotEmpty
    private String token;

    public TokenDataDTO( String token )
    {
        super( "Default" );
        this.token = token;
    }

    public TokenDataDTO()
    {
    }

    public String getToken()
    {
        return token;
    }

    public void setToken( String token )
    {
        this.token = token;
    }
}
