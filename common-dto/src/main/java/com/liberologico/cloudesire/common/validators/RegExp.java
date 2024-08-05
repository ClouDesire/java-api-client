package com.liberologico.cloudesire.common.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Asserts that the annotated string is a valid regular expression.
 */
@Target( { FIELD, ANNOTATION_TYPE } )
@Retention( RUNTIME )
@Constraint( validatedBy = RegExpValidator.class )
@Documented
public @interface RegExp
{
    String message() default "Not a valid regular expression";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
