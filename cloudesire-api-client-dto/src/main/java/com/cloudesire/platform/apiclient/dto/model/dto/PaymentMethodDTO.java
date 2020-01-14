package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;

public class PaymentMethodDTO extends PaymentDataDTO
{
    @JsonProperty( "paymentMethodId" )
    @NotEmpty
    private String paymentMethodId;

    public PaymentMethodDTO( String paymentMethodId )
    {
        this.paymentMethodId = paymentMethodId;
    }

    public PaymentMethodDTO()
    {
    }

    public String getPaymentMethodId()
    {
        return paymentMethodId;
    }

    public void setPaymentMethodId( String paymentMethodId )
    {
        this.paymentMethodId = paymentMethodId;
    }
}
