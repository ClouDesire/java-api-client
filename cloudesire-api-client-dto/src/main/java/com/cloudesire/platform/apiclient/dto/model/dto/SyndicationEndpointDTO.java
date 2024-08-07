package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Schema( description = "An Endpoint where to dispatch web hooks notifications" )
public class SyndicationEndpointDTO implements DTO
{
    @NotEmpty
    @URL
    @Schema( description = "URL where to dispatch web hooks")
    @Size( max = 1024 )
    private String url;

    @Schema( description = "An optional secret to sign outgoing web hooks")
    @Size( max = 64 )
    private String secret;

    public SyndicationEndpointDTO( String url, String secret )
    {
        this.url = url;
        this.secret = secret;
    }

    public SyndicationEndpointDTO( String url )
    {
        this.url = url;
    }

    public SyndicationEndpointDTO()
    {
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl( String url )
    {
        this.url = url;
    }

    public String getSecret()
    {
        return secret;
    }

    public void setSecret( String secret )
    {
        this.secret = secret;
    }
}
