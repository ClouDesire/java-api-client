package com.liberologico.cloudesire.common.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegExpValidator implements ConstraintValidator<RegExp, String>
{
    @Override
    public void initialize( RegExp constraint )
    {
        // Implementation not needed
    }

    public boolean isValid( String regex, ConstraintValidatorContext context )
    {
        if ( regex == null || regex.isEmpty() ) return true;

        try
        {
            Pattern.compile( regex );
        }
        catch ( PatternSyntaxException e )
        {
            return false;
        }

        return true;
    }
}
