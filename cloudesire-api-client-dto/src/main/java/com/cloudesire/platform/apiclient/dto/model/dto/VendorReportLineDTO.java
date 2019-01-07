package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

public class VendorReportLineDTO extends ReportLineDTO
{
    @ApiModelProperty( value = "The company who sold this", readOnly = true )
    private UrlEntityDTO company;

    @ApiModelProperty( value = "Income for the vendor", readOnly = true )
    private BigDecimal income;

    /**
     * License component of the total income
     */
    private BigDecimal license;

    @ApiModelProperty( value = "Expenses for the vendor", readOnly = true )
    private BigDecimal expenses;

    /**
     * Infrastructure cost component of the total expenses
     */
    private BigDecimal iaas;

    /**
     * Our fees
     */
    private BigDecimal fees;

    private OrderType type;

    @ApiModelProperty( value = "The invoice generating this", readOnly = true )
    private UrlEntityDTO invoice;

    public UrlEntityDTO getCompany()
    {
        return company;
    }

    public void setCompany( UrlEntityDTO company )
    {
        this.company = company;
    }

    public BigDecimal getIncome()
    {
        return income;
    }

    public void setIncome( BigDecimal income )
    {
        this.income = income;
    }

    public BigDecimal getLicense()
    {
        return license;
    }

    public void setLicense( BigDecimal license )
    {
        this.license = license;
    }

    public BigDecimal getExpenses()
    {
        return expenses;
    }

    public void setExpenses( BigDecimal expenses )
    {
        this.expenses = expenses;
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

    public OrderType getType()
    {
        return type;
    }

    public void setType( OrderType type )
    {
        this.type = type;
    }

    public UrlEntityDTO getInvoice()
    {
        return invoice;
    }

    public void setInvoice( UrlEntityDTO invoice )
    {
        this.invoice = invoice;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        VendorReportLineDTO that = (VendorReportLineDTO) o;
        return Objects.equals( company, that.company ) && Objects.equals( type, that.type ) && Objects
                .equals( invoice, that.invoice );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), company, type, invoice );
    }
}
