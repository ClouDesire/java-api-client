package com.liberologico.cloudesire.cmw.model.dto;

import org.hibernate.validator.constraints.NotEmpty;

public class SepaDataDTO extends PaymentDataDTO
{
    @NotEmpty
    private String iban;

    public String getIban()
    {
        return iban;
    }

    public void setIban( String iban )
    {
        this.iban = iban;
    }
}
