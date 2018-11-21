package com.liberologico.cloudesire.cmw.annotations;

import com.liberologico.cloudesire.cmw.ApiVersion;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mark an API defined via a Spring Controller method as deprecated since a certain version
 */
@Documented
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Inherited
@Retention( RetentionPolicy.RUNTIME )
public @interface UnsupportedAPI
{
    long sinceVersion() default ApiVersion.V20180101;
}
