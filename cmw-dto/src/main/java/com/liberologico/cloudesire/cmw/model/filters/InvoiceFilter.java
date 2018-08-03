package com.liberologico.cloudesire.cmw.model.filters;

import com.liberologico.cloudesire.cmw.model.dto.PageRequestDTO;
import com.liberologico.cloudesire.cmw.model.dto.UrlEntityDTO;
import com.liberologico.cloudesire.cmw.model.enums.InvoiceStatus;
import com.liberologico.cloudesire.cmw.model.enums.OrderType;
import io.swagger.annotations.ApiModelProperty;

public final class InvoiceFilter extends PageRequestDTO
{
    /**
     * @deprecated by {@link #status}
     */
    @ApiModelProperty( hidden = true )
    @Deprecated
    private Boolean paid;

    @ApiModelProperty( "Filter by nominee" )
    private Boolean nominee;

    private UrlEntityDTO company;

    @ApiModelProperty( "Retrieve self-billed Invoices only" )
    private Boolean selfBilled;

    @ApiModelProperty( "Filter by Order type" )
    private OrderType type;

    @ApiModelProperty( "Retrieve expired Invoices only" )
    private Boolean expired;

    @ApiModelProperty( "Filter by Invoice status" )
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

    public OrderType getType()
    {
        return type;
    }

    public void setType( OrderType type )
    {
        this.type = type;
    }

    /**
     * @deprecated by {@link #setType(OrderType)}
     */
    @Deprecated
    public void setType( String type )
    {
        this.type = OrderType.valueOf( type );
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
