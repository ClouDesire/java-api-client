package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public class BillingItemValueDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO item;

    @Min( 0 )
    @NotNull
    private Integer start;

    @Min( 1 )
    private Integer end;

    @DecimalMin( "0" )
    @NotNull
    private BigDecimal price;

    @DecimalMin( "0" )
    private BigDecimal vendorPrice;

    @DecimalMin( "0" )
    private BigDecimal setup;

    @DecimalMin( "0" )
    private BigDecimal vendorSetup;

    @DecimalMin( "0" )
    private BigDecimal recurring;

    @DecimalMin( "0" )
    private BigDecimal vendorRecurring;

    public BillingItemValueDTO( BillingItemDTO item, Integer start, Integer end, double price )
    {
        this.item = new UrlEntityDTO( item );
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

    public void setResoldRecurring( BigDecimal sellout )
    {
        if ( sellout != null ) recurring = sellout;
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

    public BigDecimal getRecurring()
    {
        return recurring;
    }

    public BillingItemValueDTO setRecurring( BigDecimal recurring )
    {
        this.recurring = recurring;
        return this;
    }

    public BigDecimal getVendorRecurring()
    {
        return vendorRecurring;
    }

    public BillingItemValueDTO setVendorRecurring( BigDecimal vendorRecurring )
    {
        this.vendorRecurring = vendorRecurring;
        return this;
    }

    @Override
    public String toString()
    {
        return "BillingItemValueDTO{" + "item=" + item + ", start=" + start + ", end=" + end + ", price=" + price
                + ", setup=" + setup + ", recurring=" + recurring + '}';
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
                Objects.equals( setup, that.setup ) &&
                Objects.equals( recurring, that.recurring );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( item, start, end, price, setup, recurring );
    }
    // endregion
}
