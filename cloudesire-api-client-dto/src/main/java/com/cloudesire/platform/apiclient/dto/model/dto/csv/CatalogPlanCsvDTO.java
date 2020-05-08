package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( {
        "plan", "extra", "planIdentifier", "extraIdentifier", "extraStart", "extraEnd",
        "price", "vendorPrice", "setup", "vendorSetup"
} )
public class CatalogPlanCsvDTO extends CatalogCsvDTO
{
    private BigDecimal price;

    private BigDecimal vendorPrice;

    private BigDecimal setup;

    private BigDecimal vendorSetup;

    @Override
    public CatalogPlanCsvDTO copyVersion()
    {
        return new CatalogPlanCsvDTO( plan, planIdentifier );
    }

    // region Getters & Setters
    private CatalogPlanCsvDTO( String plan, String planIdentifier )
    {
        super( plan, planIdentifier );
    }

    public CatalogPlanCsvDTO()
    {
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
        return super.toString() + ",\""
                + price + "\",\""
                + vendorPrice + "\",\""
                + setup + "\",\""
                + vendorSetup
                + '"';
    }
    // endregion
}
