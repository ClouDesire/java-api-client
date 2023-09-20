package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.enums.OSType;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CartItemDTO extends BaseEntityDTO
{
    @Min( 1 )
    private Integer quantity = 1;

    @NotNull
    @Valid
    private UrlEntityDTO productVersion;

    @Valid
    private UrlEntityDTO cloudProvider;

    private UrlEntityDTO bandwidthPricing;

    private OSType operatingSystem;

    @Valid
    private Map<UrlEntityDTO, Integer> billingItems;

    @Valid
    private Map<UrlEntityDTO, String> configurationParameters;

    private Map<String, String> metadata;

    private List<UrlEntityDTO> orders;

    public CartItemDTO( @NotNull @Valid UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    public CartItemDTO()
    {
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity( Integer quantity )
    {
        this.quantity = quantity;
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

    public Map<UrlEntityDTO, Integer> getBillingItems()
    {
        return billingItems;
    }

    public void setBillingItems( Map<UrlEntityDTO, Integer> billingItems )
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

    public Map<String, String> getMetadata()
    {
        return metadata;
    }

    public void setMetadata( Map<String, String> metadata )
    {
        this.metadata = metadata;
    }

    public List<UrlEntityDTO> getOrders()
    {
        return orders;
    }

    public void setOrders( List<UrlEntityDTO> orders )
    {
        this.orders = orders;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        CartItemDTO that = (CartItemDTO) o;
        return Objects.equals( quantity, that.quantity ) && Objects.equals( productVersion, that.productVersion );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), quantity, productVersion );
    }
}
