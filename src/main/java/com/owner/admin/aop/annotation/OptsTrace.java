package com.owner.admin.aop.annotation;

/**
 * Created with PMS
 * User : Tim.Yao
 * Date : 2016/8/16.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OptsTrace {
    String value() default  "";
}