package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.liberologico.cloudesire.common.enums.OSType;
import com.liberologico.cloudesire.common.enums.dto.ActionUrlDTO;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public abstract class BaseOrderDTO extends BaseEntityDTO
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

    private Date startDate;

    private Date endOfPeriod;

    private String currency;

    private String externalReference;

    @Valid
    private UrlEntityDTO productVersion;

    private OSType operatingSystem;

    private BigDecimal totalPrice;

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

    public BigDecimal getTotalPrice()
    {
        return totalPrice;
    }

    public void setTotalPrice( BigDecimal price )
    {
        this.totalPrice = price;
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

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate( Date startDate )
    {
        this.startDate = startDate;
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

    public OSType getOperatingSystem()
    {
        return operatingSystem;
    }

    public void setOperatingSystem( OSType operatingSystem )
    {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        BaseOrderDTO that = (BaseOrderDTO) o;
        return Objects.equals( buyer, that.buyer ) && type == that.type && Objects
                .equals( subscription, that.subscription ) && Objects.equals( date, that.date ) && Objects
                .equals( externalReference, that.externalReference ) && Objects
                .equals( productVersion, that.productVersion ) && operatingSystem == that.operatingSystem;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), buyer, type, subscription, date, externalReference, productVersion,
                operatingSystem );
    }
}
