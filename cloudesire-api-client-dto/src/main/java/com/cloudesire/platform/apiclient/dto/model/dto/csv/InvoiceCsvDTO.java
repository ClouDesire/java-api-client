package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.cloudesire.platform.apiclient.dto.model.enums.InvoiceStatus;
import com.cloudesire.platform.apiclient.dto.model.enums.LineType;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.util.Date;

@JsonPropertyOrder( {
        "id", "remoteId", "status", "date", "nomineeId", "nominee", "email", "pec", "address", "fiscalCode", "taxCode",
        "sku", "plan", "subscriptionId", "selfBilled", "description", "vendor", "type", "paymentReceived", "currency",
        "total", "vat", "linePrice", "quantity", "unit", "lineDescription", "lineType", "billingItemIdentifier",
        "discount"
} )
public class InvoiceCsvDTO extends DTO
{
    private Integer id;

    private String remoteId;

    private InvoiceStatus status;

    private Date date;

    private Integer nomineeId;

    private String nominee;

    private String email;

    private String pec;

    private String address;

    private String fiscalCode;

    private String taxCode;

    private String sku;

    private String plan;

    private Integer subscriptionId;

    private boolean selfBilled;

    private String description;

    private String vendor;

    private OrderType type;

    private Date paymentReceived;

    private String currency;

    private BigDecimal total;

    private BigDecimal vat;

    private BigDecimal linePrice;

    private BigDecimal quantity = BigDecimal.ONE;

    private String unit;

    private String lineDescription;

    private LineType lineType;

    private String billingItemIdentifier;

    private BigDecimal discount;

    // region Auto-generated code
    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

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

    public Integer getNomineeId()
    {
        return nomineeId;
    }

    public void setNomineeId( Integer nomineeId )
    {
        this.nomineeId = nomineeId;
    }

    public String getNominee()
    {
        return nominee;
    }

    public void setNominee( String nominee )
    {
        this.nominee = nominee;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getPec()
    {
        return pec;
    }

    public void setPec( String pec )
    {
        this.pec = pec;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress( String address )
    {
        this.address = address;
    }

    public String getFiscalCode()
    {
        return fiscalCode;
    }

    public void setFiscalCode( String fiscalCode )
    {
        this.fiscalCode = fiscalCode;
    }

    public String getTaxCode()
    {
        return taxCode;
    }

    public void setTaxCode( String taxCode )
    {
        this.taxCode = taxCode;
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

    public OrderType getType()
    {
        return type;
    }

    public void setType( OrderType type )
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

    public BigDecimal getTotal()
    {
        return total;
    }

    public void setTotal( BigDecimal total )
    {
        this.total = total;
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
