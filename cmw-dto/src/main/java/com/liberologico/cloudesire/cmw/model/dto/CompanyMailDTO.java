package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.common.Regexp;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Email;

import java.io.Serializable;

public class CompanyMailDTO extends TaxCodeDTO implements Serializable
{
    private String phoneNumber;
    private String rea;
    private String ri;
    @ApiModelProperty( value = "Which type of corporate form" )
    private String form;
    private String language = "EN";
    @Email( regexp = Regexp.INTERNET_EMAIL )
    private String emailAddress;
    @Email( regexp = Regexp.INTERNET_EMAIL )
    private String technicalEmailAddress;
    private BankAccountDataDTO bankAccountData;
    private String companyDescription;
    @ApiModelProperty( "Legal address")
    private AddressDTO address;
    @ApiModelProperty( "Address to be used for billing purposes")
    private AddressDTO billingAddress;
    private String companyUrl;
    private String taxCode;
    private String slug;

    @Override
    public String getTaxCountryCode()
    {
        if ( address == null ) return null;
        return address.getCountryCode();
    }

    @Override
    public String getTaxName()
    {
        return getName();
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber( String phoneNumber )
    {
        this.phoneNumber = phoneNumber;
    }

    public String getRea()
    {
        return rea;
    }

    public void setRea( String rea )
    {
        this.rea = rea;
    }

    public String getRi()
    {
        return ri;
    }

    public void setRi( String ri )
    {
        this.ri = ri;
    }

    public String getForm()
    {
        return form;
    }

    public void setForm( String form )
    {
        this.form = form;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage( String language )
    {
        this.language = language;
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

    public BankAccountDataDTO getBankAccountData()
    {
        return bankAccountData;
    }

    public void setBankAccountData( BankAccountDataDTO bankAccountData )
    {
        this.bankAccountData = bankAccountData;
    }

    public String getCompanyDescription()
    {
        return companyDescription;
    }

    public void setCompanyDescription( String companyDescription )
    {
        this.companyDescription = companyDescription;
    }

    public AddressDTO getAddress()
    {
        return address;
    }

    public void setAddress( AddressDTO address )
    {
        this.address = address;
    }

    public AddressDTO getBillingAddress()
    {
        return billingAddress;
    }

    public void setBillingAddress( AddressDTO billingAddress )
    {
        this.billingAddress = billingAddress;
    }

    public String getCompanyUrl()
    {
        return companyUrl;
    }

    public void setCompanyUrl( String companyUrl )
    {
        this.companyUrl = companyUrl;
    }

    @Override
    public String getTaxCode()
    {
        return taxCode;
    }

    public void setTaxCode( String taxCode )
    {
        this.taxCode = taxCode;
    }

    public String getSlug()
    {
        return slug;
    }

    public void setSlug( String slug )
    {
        this.slug = slug;
    }
}
