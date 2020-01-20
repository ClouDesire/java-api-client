package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.constraints.NotEmpty;

public class UserPaymentMethodDTO extends BaseEntityDTO
{
    @NotEmpty
    private String label;

    private Boolean defaultMethod;

    private String paymentMethodId;

    private String stripeToken;

    public String getLabel()
    {
        return label;
    }

    public void setLabel( String label )
    {
        this.label = label;
    }

    public Boolean getDefaultMethod()
    {
        return defaultMethod;
    }

    public void setDefaultMethod( Boolean defaultMethod )
    {
        this.defaultMethod = defaultMethod;
    }

    public String getPaymentMethodId()
    {
        return paymentMethodId;
    }

    public void setPaymentMethodId( String paymentMethodId )
    {
        this.paymentMethodId = paymentMethodId;
    }

    public String getStripeToken()
    {
        return stripeToken;
    }

    public void setStripeToken( String stripeToken )
    {
        this.stripeToken = stripeToken;
    }
}
