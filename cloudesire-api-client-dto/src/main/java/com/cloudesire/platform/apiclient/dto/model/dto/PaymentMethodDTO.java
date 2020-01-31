package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Map;
import java.util.Objects;

@ApiModel( "Payment method for a customer" )
public class PaymentMethodDTO extends BaseEntityDTO
{
    public static final String STRIPE_PAYMENT_METHOD = "paymentMethodId";
    public static final String STRIPE_TOKEN = "stripeToken";

    @ApiModelProperty( "Descriptive label for the payment method" )
    @NotEmpty
    private String label;

    @ApiModelProperty( "Whether the payment method is the default one" )
    private Boolean defaultMethod;

    @ApiModelProperty( "Payment method creation payload" )
    @Size( max = 1, message = "size must be at most 1" )
    private Map<String, String> payload;

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

    public Map<String, String> getPayload()
    {
        return payload;
    }

    public void setPayload( Map<String, String> payload )
    {
        this.payload = payload;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        PaymentMethodDTO that = (PaymentMethodDTO) o;
        return Objects.equals( label, that.label ) && Objects.equals( defaultMethod, that.defaultMethod );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), label, defaultMethod );
    }
}
