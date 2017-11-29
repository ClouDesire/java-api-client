package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CloudProviderDTO extends NamedEntityDTO
{
    private String logoUrl;

    private String alias;

    private boolean enabled;

    private Boolean privateCloud = false;

    private int weight;

    private List<CloudProviderFeatureDTO> features = new ArrayList<>();

    @JsonInclude ( JsonInclude.Include.NON_EMPTY )
    private List<String> missing = new ArrayList<>();

    public List<String> getMissing()
    {
        return missing;
    }

    public void setMissing( List<String> missing )
    {
        this.missing = missing;
    }

    public String getAlias()
    {
        return alias;
    }

    public void setAlias( String alias )
    {
        this.alias = alias;
    }

    public String getLogoUrl()
    {
        return logoUrl;
    }

    public void setLogoUrl( String logoUrl )
    {
        this.logoUrl = logoUrl;
    }

    public Boolean getPrivateCloud()
    {
        return privateCloud;
    }

    public void setPrivateCloud( Boolean privateCloud )
    {
        this.privateCloud = privateCloud;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public void setEnabled( boolean enabled )
    {
        this.enabled = enabled;
    }

    public List<CloudProviderFeatureDTO> getFeatures()
    {
        return features;
    }

    public void setFeatures( List<CloudProviderFeatureDTO> features )
    {
        this.features = features;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight( int weight )
    {
        this.weight = weight;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof CloudProviderDTO ) ) return false;
        CloudProviderDTO that = (CloudProviderDTO) o;
        return enabled == that.enabled && weight == that.weight && Objects.equals( logoUrl, that.logoUrl ) && Objects
                .equals( alias, that.alias ) && Objects.equals( privateCloud, that.privateCloud ) && Objects
                .equals( features, that.features );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( logoUrl, alias, enabled, privateCloud, weight, features );
    }

    @Override
    public String toString()
    {
        return "CloudProviderDTO{" + "logoUrl='" + logoUrl + '\'' + ", alias='" + alias + '\'' + ", enabled=" + enabled
                + ", privateCloud=" + privateCloud + ", weight=" + weight + ", features=" + features + "} " + super
                .toString();
    }
}
