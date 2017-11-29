package com.liberologico.cloudesire.cmw.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.liberologico.cloudesire.cmw.model.dto.DTO;

import java.math.BigDecimal;
import java.util.Date;

@JsonPropertyOrder( { "remoteId", "nominee", "description", "type", "paymentReceived", "currency", "price", "vat" } )
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

    // endregion
}
