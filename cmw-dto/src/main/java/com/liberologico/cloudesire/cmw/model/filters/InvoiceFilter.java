package com.liberologico.cloudesire.cmw.model.filters;

import com.liberologico.cloudesire.cmw.model.dto.PageRequestDTO;
import com.liberologico.cloudesire.cmw.model.dto.UrlEntityDTO;
import com.liberologico.cloudesire.cmw.model.enums.InvoiceStatus;

public final class InvoiceFilter extends PageRequestDTO
{
    @Deprecated
    private Boolean paid;

    private Boolean nominee;

    private UrlEntityDTO company;

    private Boolean selfBilled;

    private String type;

    private Boolean expired;

    private InvoiceStatus status;

    public Boolean getPaid()
    {
        return paid;
    }

    public void setPaid( Boolean paid )
    {
        this.paid = paid;
    }

    public Boolean getNominee()
    {
        return nominee;
    }

    public void setNominee( Boolean nominee )
    {
        this.nominee = nominee;
    }

    public UrlEntityDTO getCompany()
    {
        return company;
    }

    public void setCompany( UrlEntityDTO company )
    {
        this.company = company;
    }

    public Boolean getSelfBilled()
    {
        return selfBilled;
    }

    public void setSelfBilled( Boolean selfBilled )
    {
        this.selfBilled = selfBilled;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public Boolean getExpired()
    {
        return expired;
    }

    public void setExpired( Boolean expired )
    {
        this.expired = expired;
    }

    public InvoiceStatus getStatus()
    {
        return status;
    }

    public void setStatus( InvoiceStatus status )
    {
        this.status = status;
    }
}
