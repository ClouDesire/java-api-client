package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.Map;

/**
 * @deprecated by {@link StripeTokenDTO}
 */
@Schema( description = "Credit card data" )
@Deprecated
public class CardDataDTO implements PaymentDataDTO
{
    @Schema( description = "Month of expiration", example = "09" )
    @NotEmpty
    @Pattern( regexp = "\\d{2}", message = ErrorKeys.TWO_DIGITS )
    private String expirationMonth;

    @Schema( description = "Year of expiration", example = "2021" )
    @NotEmpty
    @Pattern( regexp = "\\d{2}|\\d{4}", message = ErrorKeys.TWO_OR_FOUR_DIGITS )
    private String expirationYear;

    @Schema( description = "Credit card number")
    @NotEmpty
    @CreditCardNumber
    private String number;

    @Schema( description = "Credit card CVC", example = "321" )
    @NotEmpty
    @Pattern( regexp = "\\d{3}|\\d{4}", message = ErrorKeys.THREE_OR_FOUR_DIGITS )
    private String cvc;

    @Schema( description = "Credit card holder", example = "John Doe" )
    private String holder;

    public CardDataDTO( String expirationMonth, String expirationYear, String number, String cvc )
    {
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.number = number;
        this.cvc = cvc;
    }

    public CardDataDTO()
    {
    }

    public Map<String, String> toMap()
    {
        Map<String, String> map = new HashMap<>();
        map.put( "cardNumber", number );
        map.put( "cardExpirationMonth", expirationMonth );
        map.put( "cardExpirationYear", expirationYear );
        map.put( "cardCVC", cvc );
        return map;
    }

    public String getExpirationMonth()
    {
        return expirationMonth;
    }

    public void setExpirationMonth( String expirationMonth )
    {
        this.expirationMonth = expirationMonth;
    }

    public String getExpirationYear()
    {
        return expirationYear;
    }

    public void setExpirationYear( String expirationYear )
    {
        this.expirationYear = expirationYear;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber( String number )
    {
        this.number = number;
    }

    public String getCvc()
    {
        return cvc;
    }

    public void setCvc( String cvc )
    {
        this.cvc = cvc;
    }

    public String getHolder()
    {
        return holder;
    }

    public void setHolder( String holder )
    {
        this.holder = holder;
    }
}
