package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "planIdentifier", "extraIdentifier", "extraStart", "extraEnd", "price", "vendorPrice", "setup", "vendorSetup"
} )
public class CatalogEntryCsvDTO extends DTO
{
    private String planIdentifier;

    private String extraIdentifier;

    private Integer extraStart;

    private Integer extraEnd;

    private BigDecimal price;

    private BigDecimal vendorPrice;

    private BigDecimal setup;

    private BigDecimal vendorSetup;

    // region Getters & Setters
    public String getPlanIdentifier()
    {
        return planIdentifier;
    }

    public void setPlanIdentifier( String planIdentifier )
    {
        this.planIdentifier = planIdentifier;
    }

    public String getExtraIdentifier()
    {
        return extraIdentifier;
    }

    public void setExtraIdentifier( String extraIdentifier )
    {
        this.extraIdentifier = extraIdentifier;
    }

    public Integer getExtraStart()
    {
        return extraStart;
    }

    public void setExtraStart( Integer extraStart )
    {
        this.extraStart = extraStart;
    }

    public Integer getExtraEnd()
    {
        return extraEnd;
    }

    public void setExtraEnd( Integer extraEnd )
    {
        this.extraEnd = extraEnd;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
    }

    public BigDecimal getVendorPrice()
    {
        return vendorPrice;
    }

    public void setVendorPrice( BigDecimal vendorPrice )
    {
        this.vendorPrice = vendorPrice;
    }

    public BigDecimal getSetup()
    {
        return setup;
    }

    public void setSetup( BigDecimal setup )
    {
        this.setup = setup;
    }

    public BigDecimal getVendorSetup()
    {
        return vendorSetup;
    }

    public void setVendorSetup( BigDecimal vendorSetup )
    {
        this.vendorSetup = vendorSetup;
    }
    // endregion
}
