package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public abstract class TaxCodeDTO extends NamedEntityDTO
{
    @ApiModelProperty( value = "Validation of tax code for a company", allowableValues = "VALID, NOT_CHECKED, EMPTY, MISMATCH, NOT_FOUND", readOnly = true )
    private String taxValidation;

    @ApiModelProperty( value = "Detailed validation message", readOnly = true )
    private String taxValidationMessage;

    public TaxCodeDTO( String name )
    {
        super( name );
    }

    public TaxCodeDTO()
    {
        super();
    }

    public abstract String getTaxCode();
    public abstract String getTaxCountryCode();
    public abstract String getTaxName();

    public String getTaxValidation()
    {
        return taxValidation;
    }

    public void setTaxValidation( String taxValidation )
    {
        this.taxValidation = taxValidation;
    }

    public String getTaxValidationMessage()
    {
        return taxValidationMessage;
    }

    public void setTaxValidationMessage( String taxValidationMessage )
    {
        this.taxValidationMessage = taxValidationMessage;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof TaxCodeDTO ) ) return false;
        if ( !super.equals( o ) ) return false;
        TaxCodeDTO that = (TaxCodeDTO) o;
        return Objects.equals( taxValidation, that.taxValidation );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), taxValidation );
    }
}
