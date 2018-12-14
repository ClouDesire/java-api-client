package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( { "product", "buyer", "invoice", "purchased", "license", "iaas", "fees", "charge", "earnings" } )
public class VendorProceedsCsvDTO extends ProceedsCsvDTO
{
    private String invoice;

    private BigDecimal license;

    private BigDecimal iaas;

    private BigDecimal fees;

    private BigDecimal charge;

    private BigDecimal earnings;

    // region Auto-generated codess

    public String getInvoice()
    {
        return invoice;
    }

    public void setInvoice( String invoice )
    {
        this.invoice = invoice;
    }

    public BigDecimal getLicense()
    {
        return license;
    }

    public void setLicense( BigDecimal license )
    {
        this.license = license;
    }

    public BigDecimal getIaas()
    {
        return iaas;
    }

    public void setIaas( BigDecimal iaas )
    {
        this.iaas = iaas;
    }

    public BigDecimal getFees()
    {
        return fees;
    }

    public void setFees( BigDecimal fees )
    {
        this.fees = fees;
    }

    public BigDecimal getCharge()
    {
        return charge;
    }

    public void setCharge( BigDecimal charge )
    {
        this.charge = charge;
    }

    public BigDecimal getEarnings()
    {
        return earnings;
    }

    public void setEarnings( BigDecimal earnings )
    {
        this.earnings = earnings;
    }

    // endregion
}
