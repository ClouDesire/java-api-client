package com.liberologico.cloudesire.cmw.model.dto;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

public class SyndicationEndpointDTO
{
    @NotEmpty
    @URL
    private String url;

    private String secret;

    public SyndicationEndpointDTO( String url, String secret )
    {
        this.url = url;
        this.secret = secret;
    }

    public SyndicationEndpointDTO()
    {
    }

    public String getUrl()
    {
        return url;
    }

    public String getSecret()
    {
        return secret;
    }

    public void setUrl( String url )
    {
        this.url = url;
    }

    public void setSecret( String secret )
    {
        this.secret = secret;
    }
}
