package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class TokenDataDTO extends PaymentDataDTO
{
    @JsonProperty( "stripeToken" )
    @NotEmpty
    private String token;

    public TokenDataDTO( String token )
    {
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
