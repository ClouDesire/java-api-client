package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.cloudesire.platform.apiclient.dto.model.dto.DTO;

import java.util.Date;

@JsonPropertyOrder( { "name", "surname", "phone", "email", "geocallId", "creationDate", "active", "activationDate" } )
public class MyUserCsvDTO extends DTO
{
    private String name;

    private String surname;

    private String phone;

    private String email;

    private String geocallId;

    private Date creationDate;

    private Boolean active;

    private Date activationDate;

    // region Auto-generated code
    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname( String surname )
    {
        this.surname = surname;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone( String phone )
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

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
    // endregion
}
