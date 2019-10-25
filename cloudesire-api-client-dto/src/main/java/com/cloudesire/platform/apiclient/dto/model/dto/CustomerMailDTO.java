package com.cloudesire.platform.apiclient.dto.model.dto;

import java.io.Serializable;
import java.util.Objects;

public class CustomerMailDTO implements Serializable
{
    private Integer id;

    private String fiscalCode;

    private String taxCode;

    private String companyName;

    private String address;

    private String sdiCode;

    private String pec;

    private String fullName;

    private String phoneNumber;

    private String email;

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
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

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName( String companyName )
    {
        this.companyName = companyName;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress( String address )
    {
        this.address = address;
    }

    public String getSdiCode()
    {
        return sdiCode;
    }

    public void setSdiCode( String sdiCode )
    {
        this.sdiCode = sdiCode;
    }

    public String getPec()
    {
        return pec;
    }

    public void setPec( String pec )
    {
        this.pec = pec;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName( String fullName )
    {
        this.fullName = fullName;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber( String phoneNumber )
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        CustomerMailDTO that = (CustomerMailDTO) o;
        return id.equals( that.id ) && Objects.equals( fiscalCode, that.fiscalCode ) && Objects
                .equals( taxCode, that.taxCode ) && Objects.equals( companyName, that.companyName ) && Objects
                .equals( address, that.address ) && Objects.equals( sdiCode, that.sdiCode ) && Objects
                .equals( pec, that.pec ) && Objects.equals( fullName, that.fullName ) && Objects
                .equals( phoneNumber, that.phoneNumber ) && Objects.equals( email, that.email );
    }

    @Override
    public int hashCode()
    {
        return Objects
                .hash( id, fiscalCode, taxCode, companyName, address, sdiCode, pec, fullName, phoneNumber, email );
    }
}
