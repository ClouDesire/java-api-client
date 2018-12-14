package com.cloudesire.platform.apiclient.dto.model.dto;

public class PaymentDetailsDTO
{
    private String paymentId;
    private String paymentUrl;

    public PaymentDetailsDTO()
    {
    }

    public PaymentDetailsDTO( String paymentId, String paymentUrl )
    {
        this.paymentId = paymentId;
        this.paymentUrl = paymentUrl;
    }

    public String getPaymentId()
    {
        return paymentId;
    }

    public void setPaymentId( String paymentId )
    {
        this.paymentId = paymentId;
    }

    public String getPaymentUrl()
    {
        return paymentUrl;
    }

    public void setPaymentUrl( String paymentUrl )
    {
        this.paymentUrl = paymentUrl;
    }
}
