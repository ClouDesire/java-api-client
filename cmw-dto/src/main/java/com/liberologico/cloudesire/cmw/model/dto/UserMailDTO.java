package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.UserRole;

import java.io.Serializable;

public class UserMailDTO implements Serializable
{
    private String userName;

    private String name;

    private String surname;

    private String email;

    private String phoneNumber;

    private AddressDTO address;

    private AddressDTO homeAddress;

    private UserRole userRole;

    private String language;

    private String billingTaxCode;

    private String billingCompanyName;

    private String fiscalCode;

    private String vendorNotes;

    private String birthday;

    private String birthPlace;

    private String gender;

    private IdentificationDocumentDTO document;

    public String getUserName()
    {
        return userName;
    }

    public void setUserName( String userName )
    {
        this.userName = userName;
    }

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

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber( String phoneNumber )
    {
        this.phoneNumber = phoneNumber;
    }

    public AddressDTO getAddress()
    {
        return address;
    }

    public void setAddress( AddressDTO address )
    {
        this.address = address;
    }

    public AddressDTO getHomeAddress()
    {
        return homeAddress;
    }

    public void setHomeAddress( AddressDTO homeAddress )
    {
        this.homeAddress = homeAddress;
    }

    public UserRole getUserRole()
    {
        return userRole;
    }

    public void setUserRole( UserRole userRole )
    {
        this.userRole = userRole;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage( String language )
    {
        this.language = language;
    }

    public String getBillingTaxCode()
    {
        return billingTaxCode;
    }

    public void setBillingTaxCode( String billingTaxCode )
    {
        this.billingTaxCode = billingTaxCode;
    }

    public String getBillingCompanyName()
    {
        return billingCompanyName;
    }

    public void setBillingCompanyName( String billingCompanyName )
    {
        this.billingCompanyName = billingCompanyName;
    }

    public String getFiscalCode()
    {
        return fiscalCode;
    }

    public void setFiscalCode( String fiscalCode )
    {
        this.fiscalCode = fiscalCode;
    }

    public String getVendorNotes()
    {
        return vendorNotes;
    }

    public void setVendorNotes( String vendorNotes )
    {
        this.vendorNotes = vendorNotes;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public void setBirthday( String birthday )
    {
        this.birthday = birthday;
    }

    public String getBirthPlace()
    {
        return birthPlace;
    }

    public void setBirthPlace( String birthPlace )
    {
        this.birthPlace = birthPlace;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender( String gender )
    {
        this.gender = gender;
    }

    public IdentificationDocumentDTO getDocument()
    {
        return document;
    }

    public void setDocument( IdentificationDocumentDTO document )
    {
        this.document = document;
    }
}
