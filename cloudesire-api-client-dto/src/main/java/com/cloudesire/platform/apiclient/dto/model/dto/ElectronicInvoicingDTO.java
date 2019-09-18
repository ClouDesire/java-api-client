package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.Regexp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Objects;

@ApiModel( description = "Electronic invoicing data for Italian business companies" )
public class ElectronicInvoicingDTO
{
    @ApiModelProperty( "Codice univoco ufficio" )
    @Size( max = 125 )
    private String cuu;

    @ApiModelProperty( "Posta elettronica certificata" )
    @Email( regexp = Regexp.INTERNET_EMAIL )
    @Size( max = 125 )
    private String pec;

    @ApiModelProperty( "Cassetto fiscale" )
    @Size( max = 125 )
    private String taxBox;

    public ElectronicInvoicingDTO( String cuu, String pec, String taxBox )
    {
        this.cuu = cuu;
        this.pec = pec;
        this.taxBox = taxBox;
    }

    // region Auto-generated code
    public ElectronicInvoicingDTO()
    {
    }

    public String getCuu()
    {
        return cuu;
    }

    public void setCuu( String cuu )
    {
        this.cuu = cuu;
    }

    public String getPec()
    {
        return pec;
    }

    public void setPec( String pec )
    {
        this.pec = pec;
    }

    public String getTaxBox()
    {
        return taxBox;
    }

    public void setTaxBox( String taxBox )
    {
        this.taxBox = taxBox;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ElectronicInvoicingDTO that = (ElectronicInvoicingDTO) o;
        return Objects.equals( cuu, that.cuu ) && Objects.equals( pec, that.pec ) && Objects
                .equals( taxBox, that.taxBox );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( cuu, pec, taxBox );
    }
    // endregion
}
