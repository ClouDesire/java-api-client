package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

import static io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY;

@ApiModel( description = "Custom cloud credentials" )
public class CloudCredentialDTO extends NamedEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @Valid
    private UrlEntityDTO owner;

    @Valid
    private UrlEntityDTO subscription;

    @ApiModelProperty( value = "The name of the linked subscription", accessMode = READ_ONLY )
    private String subscriptionName;

    @ApiModelProperty(
            value = "Whether the actual credentials have been uploaded to vault or metadata is present",
            accessMode = READ_ONLY
    )
    private Boolean uploaded;

    @ApiModelProperty( value = "The vault path of the uploaded credentials, if present", accessMode = READ_ONLY )
    private String path;

    public CloudCredentialDTO( String name, UrlEntityDTO cloudProvider )
    {
        super( name );
        this.cloudProvider = cloudProvider;
    }

    public CloudCredentialDTO()
    {
    }

    public UrlEntityDTO getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( UrlEntityDTO cloudProvider )
    {
        this.cloudProvider = cloudProvider;
    }

    public UrlEntityDTO getOwner()
    {
        return owner;
    }

    public void setOwner( UrlEntityDTO owner )
    {
        this.owner = owner;
    }

    public UrlEntityDTO getSubscription()
    {
        return subscription;
    }

    public void setSubscription( UrlEntityDTO subscription )
    {
        this.subscription = subscription;
    }

    public String getSubscriptionName()
    {
        return subscriptionName;
    }

    public void setSubscriptionName( String subscriptionName )
    {
        this.subscriptionName = subscriptionName;
    }

    public Boolean getUploaded()
    {
        return uploaded;
    }

    public void setUploaded( Boolean uploaded )
    {
        this.uploaded = uploaded;
    }

    public String getPath()
    {
        return path;
    }

    public void setPath( String path )
    {
        this.path = path;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        CloudCredentialDTO that = (CloudCredentialDTO) o;
        return Objects.equals( cloudProvider, that.cloudProvider );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), cloudProvider );
    }
}
