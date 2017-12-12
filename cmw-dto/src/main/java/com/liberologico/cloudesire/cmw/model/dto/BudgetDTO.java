package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liberologico.cloudesire.common.MathConfiguration;
import com.liberologico.cloudesire.common.MathUtils;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class BudgetDTO extends BaseEntityDTO
{
    @NotNull
    private String nation = "IT";

    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @NotNull
    @Valid
    private UrlEntityDTO configuration;

    @ApiModelProperty( "Trial duration in days" )
    private Integer trialLength;

    private List<OrderLineDTO> lines = new LinkedList<>();

    private boolean stampDuty = false;

    private String currency;

    @JsonInclude ( JsonInclude.Include.NON_EMPTY )
    private BigDecimal VAT;

    @JsonInclude( JsonInclude.Include.NON_NULL )
    private String couponStatus;

    @ApiModelProperty( "Recurring monthly price" )
    private BigDecimal priceExcludingVAT;

    @ApiModelProperty( "Price for the first month, including potential setup fee" )
    private BigDecimal firstPriceExcludingVAT;

    @ApiModelProperty( "True if this will generate a self-billed invoice" )
    private Boolean selfBilled;

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
