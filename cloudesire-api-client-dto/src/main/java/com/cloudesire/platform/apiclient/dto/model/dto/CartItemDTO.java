package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.enums.OSType;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

public class CartItemDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO productVersion;

    @Valid
    private UrlEntityDTO cloudProvider;

    private UrlEntityDTO bandwidthPricing;

    private OSType operatingSystem;

    @Valid
    private Map<UrlEntityDTO, BigDecimal> billingItems;

    @Valid
    private Map<UrlEntityDTO, String> configurationParameters;

    private BudgetDTO budget;

    public CartItemDTO( @NotNull @Valid UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    public CartItemDTO()
    {
    }

    public UrlEntityDTO getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    public UrlEntityDTO getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( UrlEntityDTO cloudProvider )
    {
        this.cloudProvider = cloudProvider;
    }

    public UrlEntityDTO getBandwidthPricing()
    {
        return bandwidthPricing;
    }

    public void setBandwidthPricing( UrlEntityDTO bandwidthPricing )
    {
        this.bandwidthPricing = bandwidthPricing;
    }

    public OSType getOperatingSystem()
    {
        return operatingSystem;
    }

    public void setOperatingSystem( OSType operatingSystem )
    {
        this.operatingSystem = operatingSystem;
    }

    public Map<UrlEntityDTO, BigDecimal> getBillingItems()
    {
        return billingItems;
    }

    public void setBillingItems( Map<UrlEntityDTO, BigDecimal> billingItems )
    {
        this.billingItems = billingItems;
    }

    public Map<UrlEntityDTO, String> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public void setConfigurationParameters( Map<UrlEntityDTO, String> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
    }

    public BudgetDTO getBudget()
    {
        return budget;
    }

    public void setBudget( BudgetDTO budget )
    {
        this.budget = budget;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        CartItemDTO that = (CartItemDTO) o;
        return Objects.equals( productVersion, that.productVersion );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), productVersion );
    }
}
