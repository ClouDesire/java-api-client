package com.liberologico.cloudesire.common.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Currency;
import java.util.Map;

public class CurrencyMapValidator implements ConstraintValidator<CurrencyMap, Map<String, ?>>
{
    @Override
    public void initialize( CurrencyMap constraintAnnotation )
    {
        // not required
    }

    @Override
    public boolean isValid( Map<String, ?> map, ConstraintValidatorContext context )
    {
        if ( map == null )
        {
            return true;
        }

        try
        {
            for ( String currency : map.keySet() )
            {
                Currency.getInstance( currency );
            }
        }
        catch ( IllegalArgumentException e )
        {
            return false;
        }

        return true;
    }
}
