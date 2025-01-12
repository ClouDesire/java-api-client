package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.liberologico.cloudesire.common.enums.OSType;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class OrderInputDTO extends BaseEntityDTO
{
    @Schema( description = "Which type of order")
    @NotNull
    private OrderType type;

    @Valid
    private UrlEntityDTO cloudProvider;

    @Valid
    private UrlEntityDTO cloudCredential;

    @NotNull
    @Valid
    private UrlEntityDTO productVersion;

    @Valid
    private UrlEntityDTO bandwidthPricing;

    @Valid
    private UrlEntityDTO buyer;

    @Schema( description = "Optional discount coupon")
    private String hashCoupon;

    @Valid
    @Schema( description = "Quantities for eventual billingItems available")
    private Map<UrlEntityDTO, Integer> billingItems;

    @Valid
    @Schema( description = "ConfigurationParameters values")
    private Map<UrlEntityDTO, String> configurationParameters;

    @Schema( description = "Environment variables values")
    private List<ApplicationFileEnvironmentDTO> environment;

    @Schema( description = "An external id of your choice")
    @Pattern( regexp = "[A-Za-z0-9-_]+", message = ErrorKeys.ALPHANUMERIC_UNDERSCORE )
    private String externalReference;

    @Schema( description = "When in reseller mode, specify the reseller username")
    private String reseller;

    private Integer catalogId;

    private OSType operatingSystem;

    @Future
    private Date start;

    public OrderInputDTO( UrlEntityDTO productVersion )
    {
        this.type = OrderType.NORMAL;
        this.productVersion = productVersion;
    }

    public OrderInputDTO()
    {
    }

    public OrderType getType()
    {
        return type;
    }

    public void setType( OrderType type )
    {
        this.type = type;
    }

    public String getHashCoupon()
    {
        return hashCoupon;
    }

    public void setHashCoupon( String hashCoupon )
    {
        this.hashCoupon = hashCoupon;
    }

    public UrlEntityDTO getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( UrlEntityDTO cloudProvider )
    {
        this.cloudProvider = cloudProvider;
    }

    public UrlEntityDTO getCloudCredential()
    {
        return cloudCredential;
    }

    public void setCloudCredential( UrlEntityDTO cloudCredential )
    {
        this.cloudCredential = cloudCredential;
    }

    public UrlEntityDTO getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    @JsonIgnore
    public UrlEntityDTO getConfiguration()
    {
        return getProductVersion();
    }

    public void setConfiguration( UrlEntityDTO configuration )
    {
        this.productVersion = configuration;
    }

    public UrlEntityDTO getBandwidthPricing()
    {
        return bandwidthPricing;
    }

    public void setBandwidthPricing( UrlEntityDTO bandwidthPricing )
    {
        this.bandwidthPricing = bandwidthPricing;
    }

    public UrlEntityDTO getBuyer()
    {
        return buyer;
    }

    public void setBuyer( UrlEntityDTO buyer )
    {
        this.buyer = buyer;
    }

    public Map<String, Integer> getBillingItems()
    {
        if ( this.billingItems == null ) return null;

        Map<String, Integer> currentBillingItems = new HashMap<>();

        for ( Map.Entry<UrlEntityDTO, Integer> entry : this.billingItems.entrySet() )
        {
            currentBillingItems.put( entry.getKey().getUrl(), entry.getValue() );
        }

        return currentBillingItems;
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

    public List<ApplicationFileEnvironmentDTO> getEnvironment()
    {
        return environment;
    }

    public void setEnvironment( List<ApplicationFileEnvironmentDTO> environment )
    {
        this.environment = environment;
    }

    public String getExternalReference()
    {
        return externalReference;
    }

    public void setExternalReference( String externalReference )
    {
        this.externalReference = externalReference;
    }

    public String getReseller()
    {
        return reseller;
    }

    public void setReseller( String reseller )
    {
        this.reseller = reseller;
    }

    public Integer getCatalogId()
    {
        return catalogId;
    }

    public void setCatalogId( Integer catalogId )
    {
        this.catalogId = catalogId;
    }

    public OSType getOperatingSystem()
    {
        return operatingSystem;
    }

    public void setOperatingSystem( OSType operatingSystem )
    {
        this.operatingSystem = operatingSystem;
    }

    public Date getStart()
    {
        return start;
    }

    public void setStart( Date start )
    {
        this.start = start;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof OrderInputDTO ) ) return false;
        if ( !super.equals( o ) ) return false;
        OrderInputDTO that = (OrderInputDTO) o;
        return type == that.type && Objects.equals( cloudProvider, that.cloudProvider ) && Objects
                .equals( productVersion, that.productVersion ) && Objects
                .equals( bandwidthPricing, that.bandwidthPricing ) && Objects.equals( buyer, that.buyer ) && Objects
                .equals( hashCoupon, that.hashCoupon )
                && Objects.equals( reseller, that.reseller );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), type, cloudProvider, productVersion, bandwidthPricing, buyer, hashCoupon,
                reseller );
    }
}
