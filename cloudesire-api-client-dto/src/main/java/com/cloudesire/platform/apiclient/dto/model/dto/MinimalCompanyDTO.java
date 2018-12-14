package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.liberologico.cloudesire.common.Regexp;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Email;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public abstract class MinimalCompanyDTO extends TaxCodeDTO
{
    @ApiModelProperty( "Description of the company, displayed on the marketplace" )
    private String companyDescription;

    @ApiModelProperty( "Logo of the company, displayed on the marketplace" )
    @Valid
    private UrlEntityDTO logoFile;

    @ApiModelProperty( "Legal address")
    @Valid
    private AddressDTO address;

    @ApiModelProperty( "Address to be used for billing purposes")
    @Valid
    private AddressDTO billingAddress;

    @ApiModelProperty( "Tax code" )
    @Size( max = 255 )
    private String taxCode;

    @ApiModelProperty( hidden = true )
    @Size( max = 255 )
    private String slug;

    @ApiModelProperty( "Phone number" )
    private String phoneNumber;

    @ApiModelProperty( "Email address" )
    @Email( regexp = Regexp.INTERNET_EMAIL )
    @NotNull
    private String emailAddress;

    @ApiModelProperty( "Preferred company language" )
    @Size( min = 2, max = 2 )
    private String language;

    private Boolean enabled;

    public MinimalCompanyDTO( String name, String emailAddress )
    {
        this( name );
        this.emailAddress = emailAddress;
    }

    public MinimalCompanyDTO( String name )
    {
        super( name );
    }

    public MinimalCompanyDTO()
    {
        super();
    }

    @JsonIgnore
    @Override
    public String getTaxCountryCode()
    {
        if ( address == null ) return null;
        return address.getCountryCode();
    }

    @JsonIgnore
    @Override
    public String getTaxName()
    {
        return getName();
    }

    public String getCompanyDescription()
    {
        return companyDescription;
    }

    public void setCompanyDescription( String companyDescription )
    {
        this.companyDescription = companyDescription;
    }

    public UrlEntityDTO getLogoFile()
    {
        return logoFile;
    }

    public void setLogoFile( UrlEntityDTO logoFile )
    {
        this.logoFile = logoFile;
    }

    public String getTaxCode()
    {
        return taxCode;
    }

    public void setTaxCode( String taxCode )
    {
        this.taxCode = taxCode;
    }

    public AddressDTO getAddress()
    {
        return address;
    }

    public void setAddress( AddressDTO address )
    {
        this.address = address;
    }

    public String getSlug()
    {
        return slug;
    }

    public void setSlug( String slug )
    {
        this.slug = slug;
    }

    public AddressDTO getBillingAddress()
    {
        return billingAddress;
    }

    public void setBillingAddress( AddressDTO billingAddress )
    {
        this.billingAddress = billingAddress;
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

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage( String language )
    {
        this.language = language;
    }

    public Boolean getEnabled()
    {
        return enabled;
    }

    public void setEnabled( Boolean enabled )
    {
        this.enabled = enabled;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        return o instanceof MinimalCompanyDTO && super.equals( o );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode() );
    }

    public static class Fields
    {
        public static final String SLUG = "slug";

        private Fields()
        {
        }
    }
}
