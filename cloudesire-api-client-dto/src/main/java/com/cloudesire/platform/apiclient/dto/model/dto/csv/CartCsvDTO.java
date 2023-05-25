package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.enums.LineType;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.util.Date;

@JsonPropertyOrder( {
        "id", "nomineeId", "nominee", "email", "pec", "sdiCode", "address",
        "fiscalCode", "taxCode", "sku", "plan", "description", "vendor",
        "currency", "linePrice", "lineQuantity", "lineUnit", "lineDescription",
        "lineType", "billingItemIdentifier", "cartQuantity", "sellin", "sellout"
} )
public class CartCsvDTO extends BaseOrderCsvDTO
{
    private String sku;

    private String plan;

    private String description;

    private String vendor;

    private BigDecimal linePrice;

    private BigDecimal lineQuantity = BigDecimal.ONE;

    private String lineUnit;

    private String lineDescription;

    private LineType lineType;

    private String billingItemIdentifier;

    private int cartQuantity = 1;

    private BigDecimal sellin;

    private BigDecimal sellout;

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

    public BigDecimal getLinePrice()
    {
        return linePrice;
    }

    public void setLinePrice( BigDecimal linePrice )
    {
        this.linePrice = linePrice;
    }

    public BigDecimal getLineQuantity()
    {
        return lineQuantity;
    }

    public void setLineQuantity( BigDecimal lineQuantity )
    {
        this.lineQuantity = lineQuantity;
    }

    public String getLineUnit()
    {
        return lineUnit;
    }

    public void setLineUnit( String lineUnit )
    {
        this.lineUnit = lineUnit;
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

    public String getBillingItemIdentifier()
    {
        return billingItemIdentifier;
    }

    public void setBillingItemIdentifier( String billingItemIdentifier )
    {
        this.billingItemIdentifier = billingItemIdentifier;
    }

    public int getCartQuantity()
    {
        return cartQuantity;
    }

    public void setCartQuantity( int cartQuantity )
    {
        this.cartQuantity = cartQuantity;
    }

    public BigDecimal getSellin()
    {
        return sellin;
    }

    public void setSellin( BigDecimal sellin )
    {
        this.sellin = sellin;
    }

    public BigDecimal getSellout()
    {
        return sellout;
    }

    public void setSellout( BigDecimal sellout )
    {
        this.sellout = sellout;
    }

    @JsonIgnore
    @Override
    public OrderType getType()
    {
        return null;
    }

    @JsonIgnore
    @Override
    public Date getDate()
    {
        return null;
    }

    @JsonIgnore
    @Override
    public BigDecimal getVat()
    {
        return null;
    }

    @JsonIgnore
    @Override
    public BigDecimal getTotal()
    {
        return null;
    }
}
