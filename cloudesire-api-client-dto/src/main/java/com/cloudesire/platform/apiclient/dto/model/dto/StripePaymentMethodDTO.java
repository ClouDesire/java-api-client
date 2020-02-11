package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;

public class StripePaymentMethodDTO extends PaymentDataDTO
{
    @JsonProperty( "paymentMethodId" )
    @NotEmpty
    private String paymentMethodId;

    public StripePaymentMethodDTO( String paymentMethodId )
    {
        this.paymentMethodId = paymentMethodId;
    }

    public StripePaymentMethodDTO()
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
