package com.cloudesire.platform.apiclient.dto.model.dto;

public abstract class PaymentDataDTO extends DTO
{
    private String label;

    public PaymentDataDTO( String label )
    {
        this.label = label;
    }

    public PaymentDataDTO()
    {
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel( String label )
    {
        this.label = label;
    }
}
