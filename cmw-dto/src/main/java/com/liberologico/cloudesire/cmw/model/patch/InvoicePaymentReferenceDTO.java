package com.liberologico.cloudesire.cmw.model.patch;

import com.liberologico.cloudesire.cmw.model.dto.DTO;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;

public class InvoicePaymentReferenceDTO extends DTO
{
    @ApiModelProperty( "Invoice payment reference" )
    @Size( max = 255 )
    private String reference;

    public InvoicePaymentReferenceDTO( String reference )
    {
        this.reference = reference;
    }

    public InvoicePaymentReferenceDTO()
    {
    }

    public String getReference()
    {
        return reference;
    }

    public void setReference( String reference )
    {
        this.reference = reference;
    }
}
