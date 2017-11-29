package com.liberologico.cloudesire.cmw.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.liberologico.cloudesire.cmw.model.dto.DTO;

@JsonPropertyOrder( { "name", "address", "phoneNumber", "emailAddress", "technicalEmailAddress" } )
public class CompanyCsvDTO extends DTO
{
    private String name;

    private String address;

    private String phoneNumber;

    private String emailAddress;

    private String technicalEmailAddress;

    // region Auto-generated code

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress( String address )
    {
        this.address = address;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber( String phoneNumber )
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress( String emailAddress )
    {
        this.emailAddress = emailAddress;
    }

    public String getTechnicalEmailAddress()
    {
        return technicalEmailAddress;
    }

    public void setTechnicalEmailAddress( String technicalEmailAddress )
    {
        this.technicalEmailAddress = technicalEmailAddress;
    }

    // endregion
}
