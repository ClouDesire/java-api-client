package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "Perform an operation on an invoice" )
public class InvoicePatchDTO implements DTO
{
    @ApiModelProperty( "Update operation" )
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
        @ApiModelProperty( "Reissue the first invoice of a subscription" )
        REISSUE
    }
}
