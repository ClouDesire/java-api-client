package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.IaasBilling;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Schema( description = "Budget estimate" )
public class BudgetDTO extends BaseEntityDTO
{
    @Schema( description = "Country code")
    @NotNull
    private String nation = "IT";

    @Schema( description = "URL of the chosen cloud provider")
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @Schema( description = "URL of the chosen product version")
    @NotNull
    @Valid
    private UrlEntityDTO configuration;

    @Schema( description = "Trial duration in days")
    private Integer trialLength;

    @Schema( description = "Lines directly billed to the customer")
    private List<OrderLineDTO> upsoldLines;

    @Schema( description = "If this invoice is subject to the Italian electronic document tax")
    private boolean stampDuty = false;

    @Schema( description = "Currency of the prices for the estimate")
    private String currency;

    @Schema( description = "Value added tax, in percentage")
    @JsonInclude ( JsonInclude.Include.NON_EMPTY )
    private BigDecimal VAT;

    @Schema( description = "Discount coupon applied on the estimate")
    private String couponStatus;

    @Schema( description = "Recurring monthly price")
    private BigDecimal priceExcludingVAT;

    @Schema( description = "Price for the first month, including potential setup fee")
    private BigDecimal firstPriceExcludingVAT;

    @Schema( description = "True if this will generate a self-billed invoice")
    private Boolean selfBilled;

    @Schema( description = "Number of months of a billing cycle for this order")
    private Integer billingPeriod;

    @Schema( description = "Minimum duration of this order in months")
    private Integer minimumDuration;

    @Schema( description = "Duration of this order in hours")
    private Integer lifespan;

    private IaasBilling iaasBilling;

    private BudgetVMConfigurationDTO vmConfiguration;

    @Schema( description = "Whether the budget is for a delayed subscription downgrade")
    private Boolean downgrade;

    @Schema( description = "Total price for the budget")
    private BigDecimal totalPrice;

    @Schema( description = "VAT component of the price")
    private BigDecimal vatSpunOff;

    @Schema( description = "Reseller Catalog used to calculate prices for the Budget")
    private UrlEntityDTO resellerCatalog;

    @Schema( description = "Reseller Pricing used to calculate prices for the Budget")
    private UrlEntityDTO resellerPricing;

    private String resellerCatalogName;

    private BudgetPricingDTO pricing;

    public BigDecimal getTotalPrice()
    {
        return totalPrice;
    }

    public BigDecimal getVatSpunOff()
    {
        return vatSpunOff;
    }

    public void setVatSpunOff( BigDecimal vatSpunOff )
    {
        this.vatSpunOff = vatSpunOff;
    }

    public void setTotalPrice( BigDecimal price )
    {
        this.totalPrice = price;
    }

    public BigDecimal getPriceExcludingVAT()
    {
        return priceExcludingVAT;
    }

    public void setPriceExcludingVAT( BigDecimal priceExcludingVAT )
    {
        this.priceExcludingVAT = priceExcludingVAT;
    }

    public BigDecimal getFirstPriceExcludingVAT()
    {
        return firstPriceExcludingVAT;
    }

    public void setFirstPriceExcludingVAT( BigDecimal firstPriceExcludingVAT )
    {
        this.firstPriceExcludingVAT = firstPriceExcludingVAT;
    }

    public UrlEntityDTO getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( UrlEntityDTO cloudProvider )
    {
        this.cloudProvider = cloudProvider;
    }

    public UrlEntityDTO getConfiguration()
    {
        return configuration;
    }

    public void setConfiguration( UrlEntityDTO configuration )
    {
        this.configuration = configuration;
    }

    public Integer getTrialLength()
    {
        return trialLength;
    }

    public void setTrialLength( Integer trialLength )
    {
        this.trialLength = trialLength;
    }

    public List<OrderLineDTO> getUpsoldLines()
    {
        return upsoldLines;
    }

    public void setUpsoldLines( List<OrderLineDTO> upsoldLines )
    {
        this.upsoldLines = upsoldLines;
    }

    public String getNation()
    {
        return nation;
    }

    public void setNation( String nation )
    {
        this.nation = nation;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency( String currency )
    {
        this.currency = currency;
    }

    public boolean getStampDuty()
    {
        return stampDuty;
    }

    public void setStampDuty( boolean stampDuty )
    {
        this.stampDuty = stampDuty;
    }

    public BigDecimal getVAT()
    {
        return VAT;
    }

    public void setVAT( BigDecimal VAT )
    {
        this.VAT = VAT;
    }

    public String getCouponStatus()
    {
        return couponStatus;
    }

    public void setCouponStatus( String couponStatus )
    {
        this.couponStatus = couponStatus;
    }

    public Boolean isSelfBilled()
    {
        return selfBilled;
    }

    public void setSelfBilled( Boolean selfBilled )
    {
        this.selfBilled = selfBilled;
    }

    public Integer getBillingPeriod()
    {
        return billingPeriod;
    }

    public void setBillingPeriod( Integer billingPeriod )
    {
        this.billingPeriod = billingPeriod;
    }

    public Integer getMinimumDuration()
    {
        return minimumDuration;
    }

    public void setMinimumDuration( Integer minimumDuration )
    {
        this.minimumDuration = minimumDuration;
    }

    public Integer getLifespan()
    {
        return lifespan;
    }

    public void setLifespan( Integer lifespan )
    {
        this.lifespan = lifespan;
    }

    public IaasBilling getIaasBilling()
    {
        return iaasBilling;
    }

    public void setIaasBilling( IaasBilling iaasBilling )
    {
        this.iaasBilling = iaasBilling;
    }

    public BudgetVMConfigurationDTO getVmConfiguration()
    {
        return vmConfiguration;
    }

    public void setVmConfiguration( BudgetVMConfigurationDTO vmConfiguration )
    {
        this.vmConfiguration = vmConfiguration;
    }

    public Boolean getDowngrade()
    {
        return downgrade;
    }

    public void setDowngrade( Boolean downgrade )
    {
        this.downgrade = downgrade;
    }

    public UrlEntityDTO getResellerCatalog()
    {
        return resellerCatalog;
    }

    public void setResellerCatalog( UrlEntityDTO resellerCatalog )
    {
        this.resellerCatalog = resellerCatalog;
    }

    public UrlEntityDTO getResellerPricing()
    {
        return resellerPricing;
    }

    public void setResellerPricing( UrlEntityDTO resellerPricing )
    {
        this.resellerPricing = resellerPricing;
    }

    public String getResellerCatalogName()
    {
        return resellerCatalogName;
    }

    public void setResellerCatalogName( String resellerCatalogName )
    {
        this.resellerCatalogName = resellerCatalogName;
    }

    public BudgetPricingDTO getPricing()
    {
        return pricing;
    }

    public void setPricing( BudgetPricingDTO pricing )
    {
        this.pricing = pricing;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        BudgetDTO budgetDTO = (BudgetDTO) o;
        return stampDuty == budgetDTO.stampDuty && Objects.equals( nation, budgetDTO.nation ) && Objects
                .equals( cloudProvider, budgetDTO.cloudProvider ) && Objects
                .equals( configuration, budgetDTO.configuration ) && Objects.equals( currency, budgetDTO.currency );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( nation, cloudProvider, configuration, stampDuty, currency );
    }
}
