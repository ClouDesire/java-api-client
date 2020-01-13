package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.cloudesire.platform.apiclient.dto.model.dto.DTO;

import java.math.BigDecimal;
import java.util.Date;

@JsonPropertyOrder( {
        "id", "name", "type", "nomineeId", "nominee", "email", "pec", "sdiCode", "address", "fiscalCode", "taxCode",
        "date", "endOfPeriod", "total", "currency", "vat"
} )
public class OrderCsvDTO extends DTO
{
    private Integer id;

    private String name;

    private String type;

    private Integer nomineeId;

    private String nominee;

    private String email;

    private String pec;

    private String sdiCode;

    private String address;

    private String fiscalCode;

    private String taxCode;

    private Date date;

    private Date endOfPeriod;

    private String currency;

    private BigDecimal vat;

    private BigDecimal total;

    // region Auto-generated code
    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
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

    public String getSdiCode()
    {
        return sdiCode;
    }

    public void setSdiCode( String sdiCode )
    {
        this.sdiCode = sdiCode;
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

    public Date getDate()
    {
        return date;
    }

    public void setDate( Date date )
    {
        this.date = date;
    }

    public Date getEndOfPeriod()
    {
        return endOfPeriod;
    }

    public void setEndOfPeriod( Date endOfPeriod )
    {
        this.endOfPeriod = endOfPeriod;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency( String currency )
    {
        this.currency = currency;
    }

    public BigDecimal getVat()
    {
        return vat;
    }

    public void setVat( BigDecimal vat )
    {
        this.vat = vat;
    }

    public BigDecimal getTotal()
    {
        return total;
    }

    public void setTotal( BigDecimal total )
    {
        this.total = total;
    }
    // endregion
}
