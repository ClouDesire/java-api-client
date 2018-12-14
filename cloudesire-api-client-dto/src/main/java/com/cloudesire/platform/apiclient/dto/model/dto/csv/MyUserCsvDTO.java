package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.cloudesire.platform.apiclient.dto.model.dto.DTO;

import java.util.Date;

@JsonPropertyOrder( { "fullName", "email", "userRole", "company", "creationDate", "activationDate" } )
public class MyUserCsvDTO extends DTO
{
    private String fullName;

    private String email;

    private String userRole = "ROLE_USER";

    private String company;

    private Date creationDate;

    private Date activationDate;

    // region Auto-generated code

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName( String fullName )
    {
        this.fullName = fullName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getUserRole()
    {
        return userRole;
    }

    public void setUserRole( String userRole )
    {
        this.userRole = userRole;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany( String company )
    {
        this.company = company;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate( Date creationDate )
    {
        this.creationDate = creationDate;
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
