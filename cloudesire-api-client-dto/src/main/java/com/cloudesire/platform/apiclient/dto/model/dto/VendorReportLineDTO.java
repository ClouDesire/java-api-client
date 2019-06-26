package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @deprecated by {@link ProceedsReportLineDTO}
 */
@Deprecated
public class VendorReportLineDTO extends ReportLineDTO
{
    private UrlEntityDTO company;

    @ApiModelProperty( value = "Income for the vendor", readOnly = true )
    private BigDecimal income;

    @ApiModelProperty( value = "License component of the total income", readOnly = true )
    private BigDecimal license;

    @ApiModelProperty( value = "Expenses for the vendor", readOnly = true )
    private BigDecimal expenses;

    @ApiModelProperty( value = "Infrastructure cost component of the total expenses", readOnly = true )
    private BigDecimal iaas;

    @ApiModelProperty( value = "Platform fees", readOnly = true )
    private BigDecimal fees;

    private OrderType type;

    private UrlEntityDTO order;

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

    public UrlEntityDTO getOrder()
    {
        return order;
    }

    public void setOrder( UrlEntityDTO order )
    {
        this.order = order;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        VendorReportLineDTO that = (VendorReportLineDTO) o;
        return Objects.equals( company, that.company ) && Objects.equals( income, that.income ) && Objects
                .equals( license, that.license ) && Objects.equals( expenses, that.expenses ) && Objects
                .equals( iaas, that.iaas ) && Objects.equals( fees, that.fees ) && type == that.type && Objects
                .equals( order, that.order );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), company, income, license, expenses, iaas, fees, type, order );
    }
}
