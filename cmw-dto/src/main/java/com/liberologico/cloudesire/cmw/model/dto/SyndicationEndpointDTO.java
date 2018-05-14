package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

@ApiModel( description = "An Endpoint where to dispatch web hooks notifications" )
public class SyndicationEndpointDTO
{
    @NotEmpty
    @URL
    @ApiModelProperty( "URL where to dispatch web hooks" )
    private String url;

    @ApiModelProperty( "An optional secret to sign outgoing web hooks" )
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
