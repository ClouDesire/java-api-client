package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;

import java.math.BigDecimal;
import java.util.Date;

public abstract class BaseOrderCsvDTO extends DTO
{
    private Integer id;

    private OrderType type;

    private Integer nomineeId;

    private String nominee;

    private String email;

    private String pec;

    private String sdiCode;

    private String address;

    private String fiscalCode;

    private String taxCode;

    private Date date;

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

    public OrderType getType()
    {
        return type;
    }

    public void setType( OrderType type )
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
