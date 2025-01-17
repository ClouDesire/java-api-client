package com.liberologico.cloudesire.common.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target( { FIELD, PARAMETER } )
@Retention( RUNTIME )
@Constraint( validatedBy = CurrencyMapValidator.class )
@Documented
public @interface CurrencyMap
{
    String message() default "{validator.currencyMap}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
