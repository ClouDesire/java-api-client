package com.liberologico.cloudesire.common.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target( { METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER } )
@Retention( RUNTIME )
@Constraint( validatedBy = IBANValidatorForString.class )
@Documented
public @interface IBAN
{
    String message() default "{validator.iban}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target( { METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER } )
    @Retention( RUNTIME )
    @Documented
    @interface List
    {
        IBAN[] value();
    }

}
