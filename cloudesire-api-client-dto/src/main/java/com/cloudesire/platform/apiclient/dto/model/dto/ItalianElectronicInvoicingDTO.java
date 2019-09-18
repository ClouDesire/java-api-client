package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.Regexp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Objects;

@ApiModel( description = "Electronic invoicing data for Italian business companies" )
public class ItalianElectronicInvoicingDTO
{
    @ApiModelProperty( "Codice univoco ufficio" )
    @Size( min = 6, max = 7 )
    private String cuu;

    @ApiModelProperty( "Posta elettronica certificata" )
    @Email( regexp = Regexp.INTERNET_EMAIL )
    @Size( min = 7, max = 256 )
    private String pec;

    // region Auto-generated code
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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ItalianElectronicInvoicingDTO that = (ItalianElectronicInvoicingDTO) o;
        return Objects.equals( cuu, that.cuu ) && Objects.equals( pec, that.pec );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( cuu, pec );
    }
    // endregion
}
