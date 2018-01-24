package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.liberologico.cloudesire.cmw.model.enums.InvoiceOperationType;
import com.liberologico.cloudesire.cmw.model.enums.InvoiceStatus;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class InvoiceDTO extends BaseInvoiceDTO
{
    @NotNull
    protected VATPriceDTO total;

    @Valid
    private UrlEntityDTO nominee;

    private boolean selfBilled = false;

    private boolean stampDuty = false;

    @NotNull
    private String type = "NORMAL";

    @NotNull
    private String product = "N/A";

    @NotNull
    private String productVersion = "N/A";

    @JsonInclude ( JsonInclude.Include.NON_EMPTY )
    private String paymentReference;

    @JsonInclude ( JsonInclude.Include.NON_EMPTY )
    private Date paymentReceived;

    @Valid
    private UrlEntityDTO subscription;

    private Set<InvoiceOperationType> availableOperations = EnumSet.noneOf( InvoiceOperationType.class );

    private String remoteId;

    private BigDecimal revenueSharingQuota;

    @NotNull
    private List<OrderLineDTO> entries;

    private Boolean cashed;

    private InvoiceStatus status;

    @Deprecated
    private BigDecimal totalPrice;

    @Deprecated
    private BigDecimal priceExcludingVAT;

    @Deprecated
    private BigDecimal vatSpunOff;

    @JsonIgnore
    public BigDecimal getIncome()
    {
        BigDecimal income = BigDecimal.ZERO;
        for ( OrderLineDTO entry : entries )
        {
            if ( ! entry.getType().isIncome() ) continue;
            income = income.add( entry.getSubtotal() );
        }
        return income;
    }

    public VATPriceDTO getTotal()
    {
        return total;
    }

    public void setTotal( VATPriceDTO total )
    {
        this.total = total;
    }

    public Date getPaymentReceived()
    {
        return paymentReceived;
    }

    public void setPaymentReceived( Date paymentReceived )
    {
        this.paymentReceived = paymentReceived;
    }

    public String getPaymentReference()
    {
        return paymentReference;
    }

    public void setPaymentReference( String paymentReference )
    {
        this.paymentReference = paymentReference;
    }

    public UrlEntityDTO getNominee()
    {
        return nominee;
    }

    public void setNominee( UrlEntityDTO nominee )
    {
        this.nominee = nominee;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public String getProduct()
    {
        return product;
    }

    public void setProduct( String what )
    {
        this.product = what;
    }

    public String getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( String productVersion )
    {
        this.productVersion = productVersion;
    }

    public UrlEntityDTO getSubscription()
    {
        return subscription;
    }

    public void setSubscription( UrlEntityDTO subscription )
    {
        this.subscription = subscription;
    }

    public Set<InvoiceOperationType> getAvailableOperations()
    {
        return availableOperations;
    }

    public void setAvailableOperations( Set<InvoiceOperationType> availableOperations )
    {
        this.availableOperations = availableOperations;
    }

    public boolean isSelfBilled()
    {
        return selfBilled;
    }

    public void setSelfBilled( boolean selfBilled )
    {
        this.selfBilled = selfBilled;
    }

    public boolean isStampDuty()
    {
        return stampDuty;
    }

    public void setStampDuty( boolean stampDuty )
    {
        this.stampDuty = stampDuty;
    }

    @Deprecated
    public String getRemoteInvoiceId()
    {
        return remoteId;
    }

    public String getRemoteId()
    {
        return remoteId;
    }

    public void setRemoteId( String remoteId )
    {
        this.remoteId = remoteId;
    }

    public BigDecimal getRevenueSharingQuota()
    {
        return revenueSharingQuota;
    }

    public void setRevenueSharingQuota( BigDecimal revenueSharingQuota )
    {
        this.revenueSharingQuota = revenueSharingQuota;
    }

    @Deprecated
    public BigDecimal getTotalPrice()
    {
        return totalPrice;
    }

    @Deprecated
    public void setTotalPrice( BigDecimal totalPrice )
    {
        this.totalPrice = totalPrice;
    }

    @Deprecated
    public BigDecimal getPriceExcludingVAT()
    {
        return priceExcludingVAT;
    }

    @Deprecated
    public void setPriceExcludingVAT( BigDecimal priceExcludingVAT )
    {
        this.priceExcludingVAT = priceExcludingVAT;
    }

    @Deprecated
    public BigDecimal getVatSpunOff()
    {
        return vatSpunOff;
    }

    @Deprecated
    public void setVatSpunOff( BigDecimal vatSpunOff )
    {
        this.vatSpunOff = vatSpunOff;
    }

    @Deprecated
    public BigDecimal getVAT()
    {
        return total != null ? total.getVAT() : null;
    }

    public List<OrderLineDTO> getEntries()
    {
        return entries;
    }

    public void setEntries( List<OrderLineDTO> entries )
    {
        this.entries = entries;
    }

    public Boolean isCashed()
    {
        return cashed;
    }

    public void setCashed( Boolean cashed )
    {
        this.cashed = cashed;
    }

    public InvoiceStatus getStatus()
    {
        return status;
    }

    public void setStatus( InvoiceStatus status )
    {
        this.status = status;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof InvoiceDTO ) ) return false;
        if ( !super.equals( o ) ) return false;
        InvoiceDTO that = (InvoiceDTO) o;
        return Objects.equals( total, that.total ) &&
                Objects.equals( paymentReference, that.paymentReference ) &&
                Objects.equals( paymentReceived, that.paymentReceived ) &&
                Objects.equals( remoteId, that.remoteId );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), total, paymentReference, paymentReceived, remoteId );
    }
}
