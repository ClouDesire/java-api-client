package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;

public class StripeTokenDTO implements PaymentDataDTO
{
    @JsonProperty( "stripeToken" )
    @NotEmpty
    private String token;

    public StripeTokenDTO( String token )
    {
        this.token = token;
    }

    public StripeTokenDTO()
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
