package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.liberologico.cloudesire.common.Regexp;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Objects;

public abstract class MinimalCompanyDTO extends TaxCodeDTO
{
    @Schema( description = "Description of the company, displayed on the marketplace")
    private String companyDescription;

    @Schema( description = "Logo of the company, displayed on the marketplace")
    @Valid
    private UrlEntityDTO logoFile;

    @Schema( description = "Legal address")
    @Valid
    private AddressDTO address;

    @Schema( description = "Tax code")
    @Size( max = 255 )
    private String taxCode;

    @Schema( description = "Auto-generated string uniquely identifying the company")
    @Size( max = 255 )
    private String slug;

    @Schema( description = "Phone number")
    @Size( max = 20 )
    private String phoneNumber;

    @Schema( description = "Email address", required = true )
    @Email( regexp = Regexp.INTERNET_EMAIL )
    @NotNull
    private String emailAddress;

    @Schema( description = "Preferred company language")
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
