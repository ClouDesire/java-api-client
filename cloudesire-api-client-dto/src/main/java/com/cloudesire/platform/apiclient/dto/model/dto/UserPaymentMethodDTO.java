package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.constraints.NotEmpty;
import java.util.Objects;

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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        UserPaymentMethodDTO that = (UserPaymentMethodDTO) o;
        return Objects.equals( label, that.label ) && Objects.equals( defaultMethod, that.defaultMethod );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), label, defaultMethod );
    }
}
