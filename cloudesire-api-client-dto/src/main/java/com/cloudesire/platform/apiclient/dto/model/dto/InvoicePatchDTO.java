package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "Perform an operation on an invoice" )
public class InvoicePatchDTO implements DTO
{
    @Schema( description = "Update operation")
    private InvoicePatchAction action;

    public InvoicePatchDTO( InvoicePatchAction action )
    {
        this.action = action;
    }

    public InvoicePatchDTO()
    {
    }

    public InvoicePatchAction getAction()
    {
        return action;
    }

    public enum InvoicePatchAction
    {
        @Schema( description = "Reissue the first invoice of a subscription")
        REISSUE,

        @Schema( description = "Mark a CHUNKED custom invoice for completion")
        FINALIZE
    }
}
