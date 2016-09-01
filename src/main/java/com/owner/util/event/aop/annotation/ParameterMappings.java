package com.owner.util.event.aop.annotation;

/**
 * User: Tim
 * Date: 15/3/26
 */
public @interface ParameterMappings {
    FieldMapping[] mappings() default {};
}
