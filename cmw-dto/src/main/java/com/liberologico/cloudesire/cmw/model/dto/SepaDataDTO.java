package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.common.validators.IBAN;
import org.hibernate.validator.constraints.NotEmpty;

public class SepaDataDTO extends PaymentDataDTO
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
