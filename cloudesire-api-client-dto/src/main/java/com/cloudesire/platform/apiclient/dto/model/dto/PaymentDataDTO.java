package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.constraints.NotEmpty;

public abstract class PaymentDataDTO extends DTO
{
    @NotEmpty
    private String label = "Default";

    public String getLabel()
    {
        return label;
    }

    public void setLabel( String label )
    {
        this.label = label;
    }
}
