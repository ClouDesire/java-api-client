package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "plan", "extra", "planIdentifier", "extraIdentifier", "extraStart", "extraEnd",
        "price", "vendorPrice", "setup", "vendorSetup"
} )
public class CatalogPlanCsvDTO extends DTO
{
    private String plan;

    private String extra;

    private String planIdentifier;

    private String extraIdentifier;

    private Integer extraStart;

    private Integer extraEnd;

    private BigDecimal price;

    private BigDecimal vendorPrice;

    private BigDecimal setup;

    private BigDecimal vendorSetup;

    public CatalogPlanCsvDTO copyVersion()
    {
        return new CatalogPlanCsvDTO( plan, planIdentifier );
    }

    // region Getters & Setters
    private CatalogPlanCsvDTO( String plan, String planIdentifier )
    {
        this.plan = plan;
        this.planIdentifier = planIdentifier;
    }

    public CatalogPlanCsvDTO()
    {
    }

    public String getPlan()
    {
        return plan;
    }

    public void setPlan( String plan )
    {
        this.plan = plan;
    }

    public String getExtra()
    {
        return extra;
    }

    public void setExtra( String extra )
    {
        this.extra = extra;
    }

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

    @Override
    public String toString()
    {
        return '"'
                + plan + "\",\""
                + extra + "\",\""
                + planIdentifier + "\",\""
                + extraIdentifier + "\",\""
                + extraStart + "\",\""
                + extraEnd + "\",\""
                + price + "\",\""
                + vendorPrice + "\",\""
                + setup + "\",\""
                + vendorSetup
                + '"';
    }
    // endregion
}
