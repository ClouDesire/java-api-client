package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModel;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@ApiModel( "Bank account data of a company" )
public class BankAccountDataDTO implements Serializable
{
    @Size( max = 125 )
    private String iban;

    @Size( max = 125 )
    private String bankName;

    @Size( max = 125 )
    private String agency;

    private BankAccountOwnerDTO owner = BankAccountOwnerDTO.COMPANY;

    @Size( max = 125 )
    private String delegateName;

    @Size( max = 125 )
    private String delegateSurname;

    @Past
    private Date delegateBirthDay;

    @Size( max = 125 )
    private String delegateBirthPlace;

    @Size( max = 125 )
    private String delegateBirthProvince;

    @Size( max = 125 )
    private String delegateGender;

    @Size( max = 125 )
    private String delegateFiscalCode;

    public BankAccountDataDTO( String iban, String bankName, String agency )
    {
        this.iban = iban;
        this.bankName = bankName;
        this.agency = agency;
    }

    public BankAccountDataDTO()
    {
    }

    public String getIban()
    {
        return iban;
    }

    public void setIban( String iban )
    {
        this.iban = iban;
    }

    public String getBankName()
    {
        return bankName;
    }

    public void setBankName( String bankName )
    {
        this.bankName = bankName;
    }

    public String getAgency()
    {
        return agency;
    }

    public void setAgency( String agency )
    {
        this.agency = agency;
    }

    public BankAccountOwnerDTO getOwner()
    {
        return owner;
    }

    public void setOwner( BankAccountOwnerDTO owner )
    {
        this.owner = owner;
    }

    public String getDelegateName()
    {
        return delegateName;
    }

    public void setDelegateName( String delegateName )
    {
        this.delegateName = delegateName;
    }

    public String getDelegateSurname()
    {
        return delegateSurname;
    }

    public void setDelegateSurname( String delegateSurname )
    {
        this.delegateSurname = delegateSurname;
    }

    public Date getDelegateBirthDay()
    {
        return delegateBirthDay;
    }

    public void setDelegateBirthDay( Date delegateBirthDay )
    {
        this.delegateBirthDay = delegateBirthDay;
    }

    public String getDelegateBirthPlace()
    {
        return delegateBirthPlace;
    }

    public void setDelegateBirthPlace( String delegateBirthPlace )
    {
        this.delegateBirthPlace = delegateBirthPlace;
    }

    public String getDelegateBirthProvince()
    {
        return delegateBirthProvince;
    }

    public void setDelegateBirthProvince( String delegateBirthProvince )
    {
        this.delegateBirthProvince = delegateBirthProvince;
    }

    public String getDelegateGender()
    {
        return delegateGender;
    }

    public void setDelegateGender( String delegateGender )
    {
        this.delegateGender = delegateGender;
    }

    public String getDelegateFiscalCode()
    {
        return delegateFiscalCode;
    }

    public void setDelegateFiscalCode( String delegateFiscalCode )
    {
        this.delegateFiscalCode = delegateFiscalCode;
    }

    private enum BankAccountOwnerDTO
    {
        COMPANY,
        DELEGATE
    }

    @Override
    public String toString()
    {
        return "BankAccountDataDTO{" + "iban='" + iban + '\'' + ", bankName='" + bankName + '\'' + ", agency='" + agency
                + '\'' + ", owner=" + owner + ", delegateName='" + delegateName + '\'' + ", delegateSurname='"
                + delegateSurname + '\'' + ", delegateBirthDay=" + delegateBirthDay + ", delegateBirthPlace='"
                + delegateBirthPlace + '\'' + ", delegateBirthProvince='" + delegateBirthProvince + '\''
                + ", delegateGender='" + delegateGender + '\'' + ", delegateFiscalCode='" + delegateFiscalCode + '\''
                + '}';
    }
}
