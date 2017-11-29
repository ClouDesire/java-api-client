package com.liberologico.cloudesire.common.validators;

import com.liberologico.cloudesire.common.DockerConstants;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationFileURLValidator implements ConstraintValidator<ApplicationFileURL, CharSequence>
{
    @Override
    public void initialize( ApplicationFileURL constraintAnnotation )
    {
        // Implementation not needed
    }

    public boolean isValid( CharSequence value, ConstraintValidatorContext constraintValidatorContext )
    {
        if ( value == null || value.length() == 0 ) return true;

        if ( value.toString().startsWith( DockerConstants.SCHEMA ) )
        {
            return value.toString().matches( DockerConstants.VALID );
        }

        try
        {
            URL url = new URL( value.toString() );
            if ( url.getHost() == null || url.getHost().isEmpty() ) return false;
            if ( url.getPath() == null || url.getPath().isEmpty() ) return false;
        }
        catch ( MalformedURLException e )
        {
            return false;
        }

        return true;
    }
}
