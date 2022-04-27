package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SubscriptionV1DTO extends BaseBaseSubscriptionDTO
{
    @ApiModelProperty( value = "The value chosen by the customer for a list of ConfigurationParameters", example = "{ \"configurationParameter/123\": \"custom_value\"}" )
    @Valid
    private Map<UrlEntityDTO, String> configurationParameters = new HashMap<>();

    private Map<UrlEntityDTO, BigDecimal> billingItems = new HashMap<>();

    public Map<UrlEntityDTO, String> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public void setConfigurationParameters( Map<UrlEntityDTO, String> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
    }

    public Map<UrlEntityDTO, BigDecimal> getBillingItems()
    {
        return billingItems;
    }

    public SubscriptionV1DTO setBillingItems( Map<String, BigDecimal> billingItems )
    {
        if ( billingItems == null ) return this;

        this.billingItems = new HashMap<>();

        for ( Map.Entry<String, BigDecimal> entry : billingItems.entrySet() )
        {
            this.billingItems.put( new UrlEntityDTO( entry.getKey() ), entry.getValue() );
        }

        return this;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        SubscriptionV1DTO that = (SubscriptionV1DTO) o;
        return Objects.equals( billingItems, that.billingItems );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), billingItems );
    }
}
