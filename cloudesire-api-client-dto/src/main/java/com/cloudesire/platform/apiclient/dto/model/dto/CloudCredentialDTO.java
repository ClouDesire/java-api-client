package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

import static io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY;

@Schema( description = "Custom cloud credentials" )
public class CloudCredentialDTO extends NamedEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @Valid
    private UrlEntityDTO owner;

    @Valid
    private UrlEntityDTO subscription;

    @Schema( description = "The name of the linked subscription", accessMode = READ_ONLY )
    private String subscriptionName;

    @Schema(
            description = "Whether the actual credentials have been uploaded to vault or metadata is present",
            accessMode = READ_ONLY
    )
    private Boolean uploaded;

    @Schema( description = "The vault path of the uploaded credentials, if present", accessMode = READ_ONLY )
    private String secretsPath;

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

    public String getSecretsPath()
    {
        return secretsPath;
    }

    public void setSecretsPath( String secretsPath )
    {
        this.secretsPath = secretsPath;
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
