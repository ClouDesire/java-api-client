package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonPropertyOrder( { "invoiceId", "product", "customer", "email", "purchased", "license", "iaas", "fees", "charge", "earnings" } )
public class VendorProceedsCsvDTO extends ProceedsCsvDTO
{
    private String customer;

    private String email;

    private BigDecimal license;

    private BigDecimal iaas;

    private BigDecimal fees;

    private BigDecimal charge;

    private BigDecimal earnings;

    public String getCustomer()
    {
        return customer;
    }

    public void setCustomer( String customer )
    {
        this.customer = customer;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
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
}
