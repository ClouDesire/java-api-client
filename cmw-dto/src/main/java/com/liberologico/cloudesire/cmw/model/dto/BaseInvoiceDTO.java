package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

public abstract class BaseInvoiceDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    protected UrlEntityDTO company;

    @NotNull
    protected Date date;

    /**
     * @deprecated by {@code status}
     */
    @Deprecated
    protected boolean paid;

    public Date getDate()
    {
        return date;
    }

    public void setDate( Date date )
    {
        this.date = date;
    }

    public boolean isPaid()
    {
        return paid;
    }

    public void setPaid( boolean paid )
    {
        this.paid = paid;
    }

    public UrlEntityDTO getCompany()
    {
        return company;
    }

    public void setCompany( UrlEntityDTO company )
    {
        this.company = company;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof BaseInvoiceDTO ) ) return false;
        if ( !super.equals( o ) ) return false;
        BaseInvoiceDTO that = (BaseInvoiceDTO) o;
        return paid == that.paid && Objects.equals( company, that.company ) && Objects.equals( date, that.date );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), company, date, paid );
    }
}
