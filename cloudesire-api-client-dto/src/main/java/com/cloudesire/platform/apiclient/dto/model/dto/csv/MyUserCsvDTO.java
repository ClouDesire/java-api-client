package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.util.Date;

@JsonPropertyOrder( { "name", "surname", "phone", "email", "pec", "geocallId", "creationDate", "active", "activationDate" } )
public class MyUserCsvDTO extends BaseUserCsvDTO
{
    private String geocallId;

    private Date creationDate;

    private Boolean active;

    private Date activationDate;

    @JsonUnwrapped( prefix = "company." )
    private Company company;

    // region Auto-generated code
    public String getGeocallId()
    {
        return geocallId;
    }

    public void setGeocallId( String geocallId )
    {
        this.geocallId = geocallId;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate( Date creationDate )
    {
        this.creationDate = creationDate;
    }

    public Boolean getActive()
    {
        return active;
    }

    public void setActive( Boolean active )
    {
        this.active = active;
    }

    public Date getActivationDate()
    {
        return activationDate;
    }

    public void setActivationDate( Date activationDate )
    {
        this.activationDate = activationDate;
    }

    public Company getCompany()
    {
        return company;
    }

    public void setCompany( Company company )
    {
        this.company = company;
    }
    // endregion

    @JsonPropertyOrder( {
            "name", "vat", "country", "address", "city", "state", "zip", "geocallId", "sdiCode", "pec",
            "delayedPayment", "type"
    } )
    public static class Company extends BaseCompany
    {
    }
}
