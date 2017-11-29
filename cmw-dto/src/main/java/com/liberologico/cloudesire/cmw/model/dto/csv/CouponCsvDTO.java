package com.liberologico.cloudesire.cmw.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.liberologico.cloudesire.cmw.model.dto.DTO;

import java.math.BigDecimal;
import java.util.Date;

@JsonPropertyOrder( { "applicationName", "type", "reusable", "licenseOnly", "percentage", "newPrice", "days",
        "creationDate", "expirationDate", "plafond", "state", "hash", "code" } )
public class CouponCsvDTO extends DTO
{
    private String applicationName;

    private String type;

    private boolean reusable;

    private boolean licenseOnly = true;

    private String percentage;

    private String newPrice;

    private String days;

    private Date creationDate = new Date();

    private Date expirationDate;

    private BigDecimal plafond;

    private String state;

    private String hash;

    private String code;

    // region Auto-generated code

    public String getApplicationName()
    {
        return applicationName;
    }

    public void setApplicationName( String applicationName )
    {
        this.applicationName = applicationName;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public boolean isReusable()
    {
        return reusable;
    }

    public void setReusable( boolean reusable )
    {
        this.reusable = reusable;
    }

    public boolean isLicenseOnly()
    {
        return licenseOnly;
    }

    public void setLicenseOnly( boolean licenseOnly )
    {
        this.licenseOnly = licenseOnly;
    }

    public String getPercentage()
    {
        return percentage;
    }

    public void setPercentage( String percentage )
    {
        this.percentage = percentage;
    }

    public String getNewPrice()
    {
        return newPrice;
    }

    public void setNewPrice( String newPrice )
    {
        this.newPrice = newPrice;
    }

    public String getDays()
    {
        return days;
    }

    public void setDays( String days )
    {
        this.days = days;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate( Date creationDate )
    {
        this.creationDate = creationDate;
    }

    public Date getExpirationDate()
    {
        return expirationDate;
    }

    public void setExpirationDate( Date expirationDate )
    {
        this.expirationDate = expirationDate;
    }

    public BigDecimal getPlafond()
    {
        return plafond;
    }

    public void setPlafond( BigDecimal plafond )
    {
        this.plafond = plafond;
    }

    public String getState()
    {
        return state;
    }

    public void setState( String state )
    {
        this.state = state;
    }

    public String getHash()
    {
        return hash;
    }

    public void setHash( String hash )
    {
        this.hash = hash;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode( String code )
    {
        this.code = code;
    }

    // endregion
}
