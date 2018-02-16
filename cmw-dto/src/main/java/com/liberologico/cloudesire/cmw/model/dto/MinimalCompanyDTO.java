package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Objects;

public abstract class MinimalCompanyDTO extends TaxCodeDTO
{
    private String companyDescription;

    @Valid
    private UrlEntityDTO logoFile;

    @ApiModelProperty( "Legal address")
    @Valid
    private AddressDTO address;

    @ApiModelProperty( "Address to be used for billing purposes")
    @Valid
    private AddressDTO billingAddress;

    @Size( max = 255 )
    private String taxCode;

    @Size( max = 255 )
    private String slug;

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
}
