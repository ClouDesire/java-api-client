package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.enums.InvoiceStatus;
import com.cloudesire.platform.apiclient.dto.model.enums.LineType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.util.Date;

@JsonPropertyOrder( {
        "id", "remoteId", "status", "date", "nomineeId", "nominee", "email", "pec", "sdiCode", "address", "fiscalCode",
        "taxCode", "sku", "plan", "subscriptionId", "selfBilled", "description", "vendor", "type", "paymentReceived",
        "currency", "total", "vat", "linePrice", "quantity", "unit", "lineDescription", "lineType",
        "billingItemIdentifier", "discount"
} )
public class InvoiceCsvDTO extends BaseOrderCsvDTO
{
    private String remoteId;

    private InvoiceStatus status;

    private String sku;

    private String plan;

    private Integer subscriptionId;

    private boolean selfBilled;

    private String description;

    private String vendor;

    private Date paymentReceived;

    private BigDecimal linePrice;

    private BigDecimal quantity = BigDecimal.ONE;

    private String unit;

    private String lineDescription;

    private LineType lineType;

    private String billingItemIdentifier;

    private BigDecimal discount;

    // region Auto-generated code
    public String getRemoteId()
    {
        return remoteId;
    }

    public void setRemoteId( String remoteId )
    {
        this.remoteId = remoteId;
    }

    public InvoiceStatus getStatus()
    {
        return status;
    }

    public void setStatus( InvoiceStatus status )
    {
        this.status = status;
    }

    public String getSku()
    {
        return sku;
    }

    public void setSku( String sku )
    {
        this.sku = sku;
    }

    public String getPlan()
    {
        return plan;
    }

    public void setPlan( String plan )
    {
        this.plan = plan;
    }

    public Integer getSubscriptionId()
    {
        return subscriptionId;
    }

    public void setSubscriptionId( Integer subscriptionId )
    {
        this.subscriptionId = subscriptionId;
    }

    public boolean isSelfBilled()
    {
        return selfBilled;
    }

    public void setSelfBilled( boolean selfBilled )
    {
        this.selfBilled = selfBilled;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public String getVendor()
    {
        return vendor;
    }

    public void setVendor( String vendor )
    {
        this.vendor = vendor;
    }

    public Date getPaymentReceived()
    {
        return paymentReceived;
    }

    public void setPaymentReceived( Date paymentReceived )
    {
        this.paymentReceived = paymentReceived;
    }

    public BigDecimal getLinePrice()
    {
        return linePrice;
    }

    public void setLinePrice( BigDecimal linePrice )
    {
        this.linePrice = linePrice;
    }

    public BigDecimal getQuantity()
    {
        return quantity;
    }

    public void setQuantity( BigDecimal quantity )
    {
        this.quantity = quantity;
    }

    public String getUnit()
    {
        return unit;
    }

    public void setUnit( String unit )
    {
        this.unit = unit;
    }

    public String getLineDescription()
    {
        return lineDescription;
    }

    public void setLineDescription( String lineDescription )
    {
        this.lineDescription = lineDescription;
    }

    public LineType getLineType()
    {
        return lineType;
    }

    public void setLineType( LineType lineType )
    {
        this.lineType = lineType;
    }

    public BigDecimal getDiscount()
    {
        return discount;
    }

    public void setDiscount( BigDecimal discount )
    {
        this.discount = discount;
    }

    public String getBillingItemIdentifier()
    {
        return billingItemIdentifier;
    }

    public void setBillingItemIdentifier( String billingItemIdentifier )
    {
        this.billingItemIdentifier = billingItemIdentifier;
    }
    // endregion
}
