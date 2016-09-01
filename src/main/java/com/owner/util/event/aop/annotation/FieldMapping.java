package com.owner.util.event.aop.annotation;

/**
 * User: Tim
 * Date: 15/3/26
 */
public @interface FieldMapping {
    String key();
    String pathOfValue() default "";
    int paramIndex() default 0;
}
