package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.validators.IBAN;

import javax.validation.constraints.NotEmpty;

/**
 * @deprecated by {@link StripeTokenDTO}
 */
@Deprecated
public class SepaDataDTO implements PaymentDataDTO
{
    @IBAN
    @NotEmpty
    private String iban;

    public SepaDataDTO( String iban )
    {
        this.iban = iban;
    }

    public SepaDataDTO()
    {
    }

    public String getIban()
    {
        return iban;
    }

    public void setIban( String iban )
    {
        this.iban = iban;
    }
}
