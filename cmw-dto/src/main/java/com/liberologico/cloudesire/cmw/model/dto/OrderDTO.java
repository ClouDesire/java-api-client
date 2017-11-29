package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.liberologico.cloudesire.cmw.model.enums.OrderType;
import com.liberologico.cloudesire.cmw.model.serializer.PriceSerializer;
import com.liberologico.cloudesire.common.enums.dto.ActionUrlDTO;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * This is the output DTO for order
 *
 * @see OrderInputDTO the input DTO
 */
public class OrderDTO extends BaseEntityDTO
{
    @Valid
    private UrlEntityDTO buyer;

    @Valid
    private UrlEntityDTO creator;

    @JsonInclude ( Include.NON_NULL )
    private ActionUrlDTO approve;

    @NotNull
    private BudgetDTO budget;

    @NotNull
    private OrderType type;

    @Valid
    private UrlEntityDTO subscription;

    private Date date;

    private Date endOfPeriod;

    private String currency;

    private String externalReference;

    @Valid
    private UrlEntityDTO productVersion;

    private String reseller;

    public ActionUrlDTO getApprove()
    {
        return approve;
    }

    public void setApprove( ActionUrlDTO approve )
    {
        this.approve = approve;
    }

    public BudgetDTO getBudget()
    {
        return budget;
    }

    public void setBudget( BudgetDTO budget )
    {
        this.budget = budget;
    }

    public UrlEntityDTO getBuyer()
    {
        return buyer;
    }

    public void setBuyer( UrlEntityDTO buyer )
    {
        this.buyer = buyer;
    }

    public UrlEntityDTO getCreator()
    {
        return creator;
    }

    public void setCreator( UrlEntityDTO creator )
    {
        this.creator = creator;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency( String currency )
    {
        this.currency = currency;
    }

    public UrlEntityDTO getSubscription()
    {
        return subscription;
    }

    public void setSubscription( UrlEntityDTO subscription )
    {
        this.subscription = subscription;
    }

    @JsonSerialize ( using = PriceSerializer.class )
    @JsonProperty
    public BigDecimal getTotalPrice()
    {
        if ( budget == null ) return BigDecimal.ZERO;
        return budget.getTotalPrice();
    }

    public void setTotalPrice( BigDecimal price )
    {
    }

    public OrderType getType()
    {
        return type;
    }

    public void setType( OrderType type )
    {
        this.type = type;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate( Date startDate )
    {
        this.date = startDate;
    }

    public String getExternalReference()
    {
        return externalReference;
    }

    public void setExternalReference( String externalReference )
    {
        this.externalReference = externalReference;
    }

    public Date getEndOfPeriod()
    {
        return endOfPeriod;
    }

    public void setEndOfPeriod( Date endOfPeriod )
    {
        this.endOfPeriod = endOfPeriod;
    }

    public UrlEntityDTO getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    public String getReseller()
    {
        return reseller;
    }

    public void setReseller( String reseller )
    {
        this.reseller = reseller;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        OrderDTO orderDTO = (OrderDTO) o;

        if ( approve != null ? !approve.equals( orderDTO.approve ) : orderDTO.approve != null ) return false;
        if ( budget != null ? !budget.equals( orderDTO.budget ) : orderDTO.budget != null ) return false;
        if ( buyer != null ? !buyer.equals( orderDTO.buyer ) : orderDTO.buyer != null ) return false;
        if ( currency != null ? !currency.equals( orderDTO.currency ) : orderDTO.currency != null ) return false;
        if ( date != null ? !date.equals( orderDTO.date ) : orderDTO.date != null ) return false;
        if ( subscription != null ? !subscription.equals( orderDTO.subscription ) : orderDTO.subscription != null )
            return false;
        if ( type != orderDTO.type ) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = buyer != null ? buyer.hashCode() : 0;
        result = 31 * result + ( approve != null ? approve.hashCode() : 0 );
        result = 31 * result + ( budget != null ? budget.hashCode() : 0 );
        result = 31 * result + ( type != null ? type.hashCode() : 0 );
        result = 31 * result + ( subscription != null ? subscription.hashCode() : 0 );
        result = 31 * result + ( date != null ? date.hashCode() : 0 );
        result = 31 * result + ( currency != null ? currency.hashCode() : 0 );
        return result;
    }
}
