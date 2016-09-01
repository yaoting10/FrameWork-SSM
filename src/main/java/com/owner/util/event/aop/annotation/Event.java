package com.owner.util.event.aop.annotation;

import com.owner.util.event.EventType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * User: Tim
 * Date: 15/3/19
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Event {
    ParameterMappings parameterMappings() default @ParameterMappings;
    ReturnMappings returnMappings() default @ReturnMappings;
    EventType type();
}
