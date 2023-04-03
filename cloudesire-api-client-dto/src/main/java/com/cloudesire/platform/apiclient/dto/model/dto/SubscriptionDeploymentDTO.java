package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class SubscriptionDeploymentDTO extends BaseEntityDTO
{
    @JsonProperty( "buyer" )
    private UrlEntityDTO nominee;

    private String type;

    private List<SubscriptionBillingItemDTO> billingItems;

    private List<SubscriptionConfigurationParameterDTO> configurationParameters;

    public void setNominee( UrlEntityDTO nominee )
    {
        this.nominee = nominee;
    }

    public UrlEntityDTO getNominee()
    {
        return nominee;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public List<SubscriptionBillingItemDTO> getBillingItems()
    {
        return billingItems;
    }

    public void setBillingItems( List<SubscriptionBillingItemDTO> billingItems )
    {
        this.billingItems = billingItems;
    }

    public List<SubscriptionConfigurationParameterDTO> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public void setConfigurationParameters( List<SubscriptionConfigurationParameterDTO> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        SubscriptionDeploymentDTO that = (SubscriptionDeploymentDTO) o;
        return Objects.equals( nominee, that.nominee ) && Objects.equals( type, that.type );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), nominee, type );
    }
}
