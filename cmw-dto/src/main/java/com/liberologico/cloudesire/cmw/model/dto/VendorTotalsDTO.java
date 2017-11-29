package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

public class VendorTotalsDTO extends DTO
{
    @ApiModelProperty( value = "Total income for the vendor", readOnly = true )
    private BigDecimal income;

    @ApiModelProperty( value = "Total expenses for the vendor", readOnly = true )
    private BigDecimal expenses;

    private String company;

    public VendorTotalsDTO( String company, BigDecimal income, BigDecimal expenses )
    {
        this( income, expenses );
        this.company = company;
    }

    public VendorTotalsDTO( BigDecimal income, BigDecimal expenses )
    {
        this.income = income;
        this.expenses = expenses;
    }

    public VendorTotalsDTO()
    {
    }

    public BigDecimal getIncome()
    {
        return income;
    }

    public void setIncome( BigDecimal income )
    {
        this.income = income;
    }

    public BigDecimal getExpenses()
    {
        return expenses;
    }

    public void setExpenses( BigDecimal expenses )
    {
        this.expenses = expenses;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany( String company )
    {
        this.company = company;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        VendorTotalsDTO that = (VendorTotalsDTO) o;
        return Objects.equals( income, that.income ) && Objects.equals( expenses, that.expenses );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( income, expenses );
    }
}
