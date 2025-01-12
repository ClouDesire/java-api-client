package com.liberologico.cloudesire.common.validators;

import org.iban4j.IbanUtil;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

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
        if ( iban == null )
        {
            return true;

        }
        try
        {
            IbanUtil.validate( iban );
        }
        catch ( Exception e )
        {
            return false;
        }
        return true;
    }
}
