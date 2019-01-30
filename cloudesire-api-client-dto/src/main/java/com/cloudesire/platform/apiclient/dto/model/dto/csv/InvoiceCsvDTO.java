package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.UrlEntityDTO;
import com.cloudesire.platform.apiclient.dto.model.enums.LineType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.cloudesire.platform.apiclient.dto.model.dto.DTO;

import java.math.BigDecimal;
import java.util.Date;

@JsonPropertyOrder( {
        "remoteId", "nominee", "description", "type", "paymentReceived", "currency", "price", "vat",
        "linePrice", "quantity", "unit", "lineDescription", "lineType", "billingItem", "setup", "discount", "maximum"
} )
public class InvoiceCsvDTO extends DTO
{
    private String remoteId;

    private String nominee;

    private String description;

    private String type = "NORMAL";

    private Date paymentReceived;

    protected String currency;

    protected BigDecimal price;

    private BigDecimal vat;

    private BigDecimal linePrice;

    private BigDecimal quantity = BigDecimal.ONE;

    private String unit;

    private String lineDescription;

    private LineType lineType;

    private UrlEntityDTO billingItem;

    private boolean setup;

    private BigDecimal discount;

    private Integer maximum;

    // region Auto-generated code
    public String getRemoteId()
    {
        return remoteId;
    }

    public void setRemoteId( String remoteId )
    {
        this.remoteId = remoteId;
    }

    public String getNominee()
    {
        return nominee;
    }

    public void setNominee( String nominee )
    {
        this.nominee = nominee;
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

    public UrlEntityDTO getBillingItem()
    {
        return billingItem;
    }

    public void setBillingItem( UrlEntityDTO billingItem )
    {
        this.billingItem = billingItem;
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

    public Integer getMaximum()
    {
        return maximum;
    }

    public void setMaximum( Integer maximum )
    {
        this.maximum = maximum;
    }
    // endregion
}
