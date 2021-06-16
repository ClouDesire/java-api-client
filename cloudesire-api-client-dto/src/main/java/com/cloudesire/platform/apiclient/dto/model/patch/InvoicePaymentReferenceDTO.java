package com.cloudesire.platform.apiclient.dto.model.patch;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InvoicePaymentReferenceDTO implements DTO
{
    @ApiModelProperty( "Invoice payment reference" )
    @NotNull
    @Size( min = 1, max = 255 )
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
