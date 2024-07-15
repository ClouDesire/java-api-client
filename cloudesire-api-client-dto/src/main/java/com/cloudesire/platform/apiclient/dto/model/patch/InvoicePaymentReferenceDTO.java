package com.cloudesire.platform.apiclient.dto.model.patch;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InvoicePaymentReferenceDTO implements DTO
{
    @Schema( description = "Invoice payment reference")
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
