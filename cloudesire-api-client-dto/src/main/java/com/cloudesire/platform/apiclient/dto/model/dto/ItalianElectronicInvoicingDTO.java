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
    @ApiModelProperty( "Codice univoco ufficio/Codice destinatario" )
    @Size( min = 6, max = 7 )
    private String sdiCode;

    @ApiModelProperty( "Posta elettronica certificata" )
    @Email( regexp = Regexp.INTERNET_EMAIL )
    @Size( min = 7, max = 256 )
    private String pec;

    // region Auto-generated code
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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ItalianElectronicInvoicingDTO that = (ItalianElectronicInvoicingDTO) o;
        return Objects.equals( sdiCode, that.sdiCode ) && Objects.equals( pec, that.pec );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( sdiCode, pec );
    }
    // endregion
}
