package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.liberologico.cloudesire.common.enums.OSType;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.AccessMode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Schema( description = "Definition of a cloud provider" )
public class CloudProviderDTO extends NamedEntityDTO
{
    @Schema( description = "URL of a logo to display on the marketplace")
    private String logoUrl;

    @Schema( description = "An alias for the cloud provider")
    private String alias;

    @Schema( description = "Whether the cloud provider is enabled")
    private boolean enabled;

    @Schema( description = "Whether the cloud provider is private")
    private Boolean privateCloud = false;

    @Schema( description = "Weight order for displaying on the marketplace")
    private int weight;

    @Schema( description = "Enabled features of the cloud provider")
    private List<CloudProviderFeatureDTO> features = new ArrayList<>();

    @Schema( description = "Default SSH username per OS type", accessMode = AccessMode.READ_ONLY )
    private Map<OSType, String> usernames;

    /**
     * @deprecated by {@link #usernames}
     */
    @Schema( hidden = true )
    @Deprecated
    private String username;

    @Schema( description = "Supported operating systems", accessMode = AccessMode.READ_ONLY )
    private List<OSType> supportedOperatingSystems;

    private UrlEntityDTO principal;

    @Schema( accessMode = AccessMode.READ_ONLY )
    private Set<UrlEntityDTO> regions;

    @Schema( description = "Conversion factors from foreign currencies", accessMode = AccessMode.READ_ONLY )
    private Map<String, BigDecimal> currencyConversion;

    @JsonIgnore
    @Override
    public String getDisplayName()
    {
        return getAlias();
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

    public Map<OSType, String> getUsernames()
    {
        return usernames;
    }

    public void setUsernames( Map<OSType, String> usernames )
    {
        this.usernames = usernames;
    }

    /**
     * @deprecated unsupported
     */
    @Deprecated
    public String getUsername()
    {
        return username;
    }

    /**
     * @deprecated unsupported
     */
    @Deprecated
    public void setUsername( String username )
    {
        this.username = username;
    }

    public List<OSType> getSupportedOperatingSystems()
    {
        return supportedOperatingSystems;
    }

    public void setSupportedOperatingSystems( List<OSType> supportedOperatingSystems )
    {
        this.supportedOperatingSystems = supportedOperatingSystems;
    }

    public UrlEntityDTO getPrincipal()
    {
        return principal;
    }

    public void setPrincipal( UrlEntityDTO principal )
    {
        this.principal = principal;
    }

    public Set<UrlEntityDTO> getRegions()
    {
        return regions;
    }

    public void setRegions( Set<UrlEntityDTO> regions )
    {
        this.regions = regions;
    }

    public Map<String, BigDecimal> getCurrencyConversion()
    {
        return currencyConversion;
    }

    public void setCurrencyConversion( Map<String, BigDecimal> currencyConversion )
    {
        this.currencyConversion = currencyConversion;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof CloudProviderDTO ) ) return false;
        CloudProviderDTO that = (CloudProviderDTO) o;
        return enabled == that.enabled && weight == that.weight && Objects.equals( logoUrl, that.logoUrl ) && Objects
                .equals( alias, that.alias ) && Objects.equals( privateCloud, that.privateCloud );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( logoUrl, alias, enabled, privateCloud, weight );
    }

    @Override
    public String toString()
    {
        return "CloudProviderDTO{" + "logoUrl='" + logoUrl + '\'' + ", alias='" + alias + '\'' + ", enabled=" + enabled
                + ", privateCloud=" + privateCloud + ", weight=" + weight + "} " + super.toString();
    }
}
