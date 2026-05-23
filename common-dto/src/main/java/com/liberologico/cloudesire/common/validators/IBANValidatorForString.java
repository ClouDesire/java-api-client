package com.liberologico.cloudesire.common.validators;

import de.speedbanking.iban.Iban;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IBANValidatorForString implements ConstraintValidator<IBAN, String>
{
    @Override
    public void initialize( IBAN constraintAnnotation )
    {
        // not required
    }

    @Override
    public boolean isValid( String iban, ConstraintValidatorContext context )
    {
        return iban == null || Iban.isValid(iban);
    }
}
