package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

@ApiModel( description = "Billing configuration of the ranges for an extra resource" )
public class BillingItemValueDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO item;

    @ApiModelProperty( "Range start (inclusive)" )
    @Min( 0 )
    @NotNull
    private Integer start;

    @ApiModelProperty( "Range end (exclusive), null is indefinite" )
    @Min( 0 )
    private Integer end;

    @ApiModelProperty( "Price for the range" )
    @DecimalMin( "0" )
    @NotNull
    private BigDecimal price;

    @ApiModelProperty( "Price set by vendor, visible to admin only" )
    @DecimalMin( "0" )
    private BigDecimal vendorPrice;

    @ApiModelProperty( "Setup fee for the first billing of this range" )
    @DecimalMin( "0" )
    private BigDecimal setup;

    @ApiModelProperty( "Setup fee set by vendor, visible to admin only" )
    @DecimalMin( "0" )
    private BigDecimal vendorSetup;

    @DecimalMin( "0" )
    private BigDecimal proportionalSetup;

    @DecimalMin( "0" )
    private BigDecimal vendorProportionalSetup;

    @ApiModelProperty( "Increment amount" )
    @Min( 1 )
    private Integer step;

    @ApiModelProperty( "The tag for the range, for tagged stairstep values" )
    @Size( max = 125, message = INVALID_SIZE )
    private String tag;

    @ApiModelProperty( "The description for the tagged range, supports localization" )
    @Size( max = 8192, message = INVALID_SIZE )
    private String description;

    public BillingItemValueDTO( BillingItemDTO item, Integer start, Integer end, double price )
    {
        this( item.urlEntity(), start, end, price );
    }

    public BillingItemValueDTO( UrlEntityDTO item, Integer start, Integer end, double price )
    {
        this.item = item;
        this.start = start;
        this.end = end;
        this.price = BigDecimal.valueOf( price );
    }

    public void setResoldPrice( BigDecimal sellout )
    {
        if ( sellout != null ) price = sellout;
    }

    public void setResoldSetup( BigDecimal sellout )
    {
        if ( sellout != null ) setup = sellout;
    }

    public static BillingItemValueDTO of( UrlEntityDTO billingItem, int start, int end, BigDecimal price )
    {
        BillingItemValueDTO dto = new BillingItemValueDTO();
        dto.item = billingItem;
        dto.start = start;
        dto.end = end;
        dto.price = price;
        return dto;
    }

    // region Auto-generated code
    public BillingItemValueDTO()
    {
    }

    public UrlEntityDTO getItem()
    {
        return item;
    }

    public BillingItemValueDTO setItem( UrlEntityDTO item )
    {
        this.item = item;
        return this;
    }

    public Integer getStart()
    {
        return start;
    }

    public BillingItemValueDTO setStart( Integer start )
    {
        this.start = start;
        return this;
    }

    public Integer getEnd()
    {
        return end;
    }

    public BillingItemValueDTO setEnd( Integer end )
    {
        this.end = end;
        return this;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public BillingItemValueDTO setPrice( BigDecimal price )
    {
        this.price = price;
        return this;
    }

    public BigDecimal getVendorPrice()
    {
        return vendorPrice;
    }

    public BillingItemValueDTO setVendorPrice( BigDecimal vendorPrice )
    {
        this.vendorPrice = vendorPrice;
        return this;
    }

    public BigDecimal getSetup()
    {
        return setup;
    }

    public BillingItemValueDTO setSetup( BigDecimal setup )
    {
        this.setup = setup;
        return this;
    }

    public BigDecimal getVendorSetup()
    {
        return vendorSetup;
    }

    public BillingItemValueDTO setVendorSetup( BigDecimal vendorSetup )
    {
        this.vendorSetup = vendorSetup;
        return this;
    }

    public BigDecimal getProportionalSetup()
    {
        return proportionalSetup;
    }

    public BillingItemValueDTO setProportionalSetup( BigDecimal proportionalSetup )
    {
        this.proportionalSetup = proportionalSetup;
        return this;
    }

    public BigDecimal getVendorProportionalSetup()
    {
        return vendorProportionalSetup;
    }

    public BillingItemValueDTO setVendorProportionalSetup( BigDecimal vendorProportionalSetup )
    {
        this.vendorProportionalSetup = vendorProportionalSetup;
        return this;
    }

    public Integer getStep()
    {
        return step;
    }

    public BillingItemValueDTO setStep( Integer step )
    {
        this.step = step;
        return this;
    }

    public String getTag()
    {
        return tag;
    }

    public BillingItemValueDTO setTag( String tag )
    {
        this.tag = tag;
        return this;
    }

    public String getDescription()
    {
        return description;
    }

    public BillingItemValueDTO setDescription( String description )
    {
        this.description = description;
        return this;
    }

    @Override
    public String toString()
    {
        return "BillingItemValueDTO{" + "item=" + item + ", start=" + start + ", end=" + end + ", price=" + price
                + ", setup=" + setup + '}';
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        BillingItemValueDTO that = (BillingItemValueDTO) o;
        return Objects.equals( item, that.item ) &&
                Objects.equals( start, that.start ) &&
                Objects.equals( end, that.end ) &&
                price.compareTo( that.price ) == 0 &&
                Objects.equals( setup, that.setup );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( item, start, end, price, setup );
    }
    // endregion
}
