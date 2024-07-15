package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Map;
import java.util.Objects;

@Schema( description = "Payment method for a customer" )
public class PaymentMethodDTO extends BaseEntityDTO
{
    public static final String STRIPE_PAYMENT_METHOD = "paymentMethodId";
    public static final String STRIPE_TOKEN = "stripeToken";

    @Schema( description = "Descriptive label for the payment method")
    @NotEmpty
    private String label;

    @Schema( description = "Whether the payment method is the default one")
    private Boolean defaultMethod;

    @Schema( description = "Last 4 digits of the card", accessMode = Schema.AccessMode.READ_ONLY )
    private String last4;

    @Schema( description = "Expiration month of the card", accessMode = Schema.AccessMode.READ_ONLY )
    private Integer expMonth;

    @Schema( description = "Expiration year of the card", accessMode = Schema.AccessMode.READ_ONLY )
    private Integer expYear;

    @Schema( description = "Payment method creation payload")
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

    public String getLast4()
    {
        return last4;
    }

    public void setLast4( String last4 )
    {
        this.last4 = last4;
    }

    public Integer getExpMonth()
    {
        return expMonth;
    }

    public void setExpMonth( Integer expMonth )
    {
        this.expMonth = expMonth;
    }

    public Integer getExpYear()
    {
        return expYear;
    }

    public void setExpYear( Integer expYear )
    {
        this.expYear = expYear;
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
