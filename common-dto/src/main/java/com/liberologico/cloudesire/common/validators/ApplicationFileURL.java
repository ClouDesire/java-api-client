package com.liberologico.cloudesire.common.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * This is used to validate URL and references to docker images
 */
@Target ( {FIELD} )
@Retention ( RUNTIME )
@Constraint ( validatedBy = ApplicationFileURLValidator.class )
@Documented
public @interface ApplicationFileURL
{
    String message() default "Cannot validate supplied URL";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
