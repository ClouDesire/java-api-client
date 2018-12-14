package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudesire.platform.apiclient.dto.model.enums.LineType;
import com.cloudesire.platform.apiclient.dto.model.interfaces.Line;
import com.liberologico.cloudesire.common.MathConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@ApiModel( "A billed unit" )
public class OrderLineDTO implements Line
{
    @NotNull
    @Valid
    private VATPriceDTO price;

    @ApiModelProperty( value = "The quantity", example = "1.0" )
    private BigDecimal quantity = BigDecimal.ONE;

    @ApiModelProperty( "A unit of measurement for the quantity" )
    private String unit;

    @ApiModelProperty( "A description of the service" )
    @Length ( max = 1024 )
    private String description;

    private LineType type;

    @JsonInclude ( Include.NON_NULL )
    @Valid
    private UrlEntityDTO invoice;

    @JsonInclude( Include.NON_NULL )
    @Valid
    private UrlEntityDTO billingItem;

    @ApiModelProperty( "If this is a one-off cost" )
    private boolean setup;

    @ApiModelProperty( value = "Discount percentage if this line is relative to a coupon", example = "20", readOnly = true )
    private BigDecimal discount;

    @ApiModelProperty( value = "Requested billing item maximum quantity", example = "15", readOnly = true )
    private Integer maximum;

    @Deprecated
    @JsonProperty ( value = "totalPrice" )
    @ApiModelProperty( hidden = true )
    public BigDecimal calculateTotalPrice()
    {
        return getSubtotal();
    }

    @Deprecated
    @JsonProperty
    @ApiModelProperty( hidden = true )
    public BigDecimal getPriceExcludingVAT()
    {
        return getSubtotal();
    }

    @ApiModelProperty( readOnly = true )
    public BigDecimal getSubtotal()
    {
        if ( price == null || price.getPrice() == null ) return BigDecimal.ZERO;

        return price.getPrice()
                .multiply( quantity )
                .setScale( MathConfiguration.DEFAULT_PRECISION, MathConfiguration.ROUNDING_MODE );
    }

    @ApiModelProperty( value = "VAT total amount", readOnly = true )
    @JsonProperty( value = "vatSpunOff" )
    public BigDecimal getVATSpunOff()
    {
        if ( price == null || price.getVatSpunOff() == null ) return null;

        return price.getVatSpunOff()
                .multiply( quantity )
                .setScale( MathConfiguration.DEFAULT_PRECISION, MathConfiguration.ROUNDING_MODE );
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public VATPriceDTO getPrice()
    {
        return price;
    }

    public void setPrice( VATPriceDTO price )
    {
        this.price = price;
    }

    public BigDecimal getQuantity()
    {
        return quantity;
    }

    public void setQuantity( BigDecimal quantity )
    {
        this.quantity = quantity.setScale( MathConfiguration.COMPUTATION_PRECISION, MathConfiguration.ROUNDING_MODE );
    }

    /**
     * @return the type
     */
    public LineType getType()
    {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType( LineType type )
    {
        this.type = type;
    }

    public String getUnit()
    {
        return unit;
    }

    public void setUnit( String unit )
    {
        this.unit = unit;
    }

    public void setTotalPrice( BigDecimal price )
    {

    }

    public UrlEntityDTO getInvoice()
    {
        return invoice;
    }

    public void setInvoice( UrlEntityDTO invoice )
    {
        this.invoice = invoice;
    }

    public UrlEntityDTO getBillingItem()
    {
        return billingItem;
    }

    public void setBillingItem( UrlEntityDTO billingItem )
    {
        this.billingItem = billingItem;
    }

    @Override
    public boolean isSetup()
    {
        return setup;
    }

    public void setSetup( boolean setup )
    {
        this.setup = setup;
    }

    public BigDecimal getDiscount()
    {
        return discount;
    }

    public void setDiscount( BigDecimal discount )
    {
        this.discount = discount;
    }

    public Integer getMaximum()
    {
        return maximum;
    }

    public void setMaximum( Integer maximum )
    {
        this.maximum = maximum;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        OrderLineDTO that = (OrderLineDTO) o;
        return Objects.equals( price, that.price ) &&
                Objects.equals( quantity, that.quantity ) &&
                Objects.equals( unit, that.unit ) &&
                Objects.equals( description, that.description ) &&
                Objects.equals( type, that.type );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( price, quantity, unit, description, type );
    }

    @Override
    public String toString()
    {
        return "OrderLineDTO{" + "price=" + price + ", quantity=" + quantity + ", unit='" + unit + '\''
                + ", description='" + description + '\'' + ", type=" + type + ", invoice=" + invoice + ", total="
                + getSubtotal() + '}';
    }
}
