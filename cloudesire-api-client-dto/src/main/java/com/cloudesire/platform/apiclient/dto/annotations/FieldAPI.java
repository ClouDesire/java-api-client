package com.cloudesire.platform.apiclient.dto.annotations;

import com.cloudesire.platform.apiclient.dto.ApiVersion;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Track when the field appeared
 */
@Documented
@Target( { ElementType.FIELD } )
@Inherited
@Retention( RetentionPolicy.RUNTIME )
public @interface FieldAPI
{
    long sinceVersion() default ApiVersion.NO_VERSION;
}
