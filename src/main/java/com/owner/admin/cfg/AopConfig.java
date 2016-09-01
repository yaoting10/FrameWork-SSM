package com.owner.admin.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created with PMS
 * User : Tim.Yao
 * Date : 2016/8/16.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.owner.admin.aop.advice")
public class AopConfig {
}
