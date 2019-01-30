package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.BillingItemCostLineDTO;
import com.cloudesire.platform.apiclient.dto.model.enums.InvoiceStatus;
import com.cloudesire.platform.apiclient.dto.model.enums.LineType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.util.Date;

@JsonPropertyOrder( {
        "remoteId", "status", "date", "nominee", "company", "subscriptionId", "selfBilled", "description", "type", "paymentReceived", "currency", "price", "vat",
        "linePrice", "quantity", "unit", "lineDescription", "lineType", "billingItem", "setup", "discount", "maximum"
} )
public class InvoiceCsvDTO extends BillingItemCostLineDTO
{
    private String remoteId;

    private InvoiceStatus status;

    private Date date;

    private String nominee;

    private String company;

    private Integer subscriptionId;

    private boolean selfBilled;

    private String description;

    private String type = "NORMAL";

    private Date paymentReceived;

    private String currency;

    private BigDecimal price;

    private BigDecimal vat;

    private BigDecimal linePrice;

    private BigDecimal quantity = BigDecimal.ONE;

    private String unit;

    private String lineDescription;

    private LineType lineType;

    private boolean setup;

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

    public Date getDate()
    {
        return date;
    }

    public void setDate( Date date )
    {
        this.date = date;
    }

    public String getNominee()
    {
        return nominee;
    }

    public void setNominee( String nominee )
    {
        this.nominee = nominee;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany( String company )
    {
        this.company = company;
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

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public Date getPaymentReceived()
    {
        return paymentReceived;
    }

    public void setPaymentReceived( Date paymentReceived )
    {
        this.paymentReceived = paymentReceived;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency( String currency )
    {
        this.currency = currency;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
    }

    public BigDecimal getVat()
    {
        return vat;
    }

    public void setVat( BigDecimal vat )
    {
        this.vat = vat;
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

    public boolean isSetup()
    {
        return setup;
    }

    public void setSetup( boolean setup )
    {
        this.setup = setup;
    }

    public BigDecimal getDiscount()
    {
        return discount;
    }

    public void setDiscount( BigDecimal discount )
    {
        this.discount = discount;
    }
    // endregion
}
