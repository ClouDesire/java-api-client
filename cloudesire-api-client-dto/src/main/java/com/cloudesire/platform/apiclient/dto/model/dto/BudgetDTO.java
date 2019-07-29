package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.IaasBilling;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liberologico.cloudesire.common.MathConfiguration;
import com.liberologico.cloudesire.common.MathUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@ApiModel( description = "Budget estimate" )
public class BudgetDTO extends BaseEntityDTO
{
    @ApiModelProperty( value = "Country code", readOnly = true )
    @NotNull
    private String nation = "IT";

    @ApiModelProperty( value = "URL of the chosen cloud provider", readOnly = true )
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @ApiModelProperty( value = "URL of the chosen product version", readOnly = true )
    @NotNull
    @Valid
    private UrlEntityDTO configuration;

    @ApiModelProperty( value = "Trial duration in days", readOnly = true )
    private Integer trialLength;

    @ApiModelProperty( value = "Billable entries for the estimate", readOnly = true )
    private List<OrderLineDTO> lines = new LinkedList<>();

    @ApiModelProperty( value = "If this invoice is subject to the Italian electronic document tax", readOnly = true )
    private boolean stampDuty = false;

    @ApiModelProperty( value = "Currency of the prices for the estimate", readOnly = true )
    private String currency;

    @ApiModelProperty( value = "Value added tax, in percentage", readOnly = true )
    @JsonInclude ( JsonInclude.Include.NON_EMPTY )
    private BigDecimal VAT;

    @ApiModelProperty( value = "Discount coupon applied on the estimate", readOnly = true )
    @JsonInclude( JsonInclude.Include.NON_NULL )
    private String couponStatus;

    @ApiModelProperty( value = "Recurring monthly price", readOnly = true )
    private BigDecimal priceExcludingVAT;

    @ApiModelProperty( value = "Price for the first month, including potential setup fee", readOnly = true )
    private BigDecimal firstPriceExcludingVAT;

    @ApiModelProperty( value = "True if this will generate a self-billed invoice", readOnly = true )
    private Boolean selfBilled;

    @ApiModelProperty( value = "Number of months of a billing cycle for this order", readOnly = true )
    private Integer billingPeriod;

    @ApiModelProperty( value = "Minimum duration of this order in months", readOnly = true )
    private Integer minimumDuration;

    @ApiModelProperty( value = "Duration of this order in hours", readOnly = true )
    private Integer lifespan;

    private IaasBilling iaasBilling;

    private BudgetVMConfigurationDTO vmConfiguration;

    @JsonProperty
    public BigDecimal getTotalPrice()
    {
        return calculateTotal().setScale( MathConfiguration.DEFAULT_PRECISION, MathConfiguration.ROUNDING_MODE );
    }

    @JsonProperty( value = "vatSpunOff" )
    public BigDecimal getVATSpunOff()
    {
        return getVATSpunOff( priceExcludingVAT );
    }

    private BigDecimal getVATSpunOff( BigDecimal price )
    {
        return MathUtils.percentage( price, VAT, MathConfiguration.DEFAULT_PRECISION );
    }

    public void setTotalPrice( BigDecimal price )
    {
        // this is intentionally left blank
    }

    private BigDecimal calculateTotal()
    {
        if ( firstPriceExcludingVAT != null )
        {
            BigDecimal spunOff = getVATSpunOff( firstPriceExcludingVAT );
            if ( spunOff != null ) return firstPriceExcludingVAT.add( spunOff );

            return firstPriceExcludingVAT;
        }

        return BigDecimal.ZERO;
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

    public List<OrderLineDTO> getLines()
    {
        return lines;
    }

    public void setLines( List<OrderLineDTO> lines )
    {
        this.lines = lines;
    }

    public String getNation()
    {
        return nation;
    }

    public void setNation( String nation )
    {
        this.nation = nation;
    }

    public void addLine( OrderLineDTO line )
    {
        if ( this.lines == null ) this.lines = new LinkedList<>();
        this.lines.add( line );
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
