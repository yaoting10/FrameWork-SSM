package com.owner.admin.cfg;

import com.owner.AbstractMvcConfig;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ViewResolver;


import static org.springframework.context.annotation.ComponentScan.Filter;
/**
 * Created with PMS
 * User : Tim.Yao
 * Date : 2016/8/16.
 */
@Configuration
@ComponentScan(basePackages = "com.owner.admin", includeFilters = @Filter(Controller.class), useDefaultFilters = false)
public class MvcConfig extends AbstractMvcConfig{

    @Override
    protected String resourceContext(){
        return Constants.SERVLET_NAME;
    }

    @Bean(name = Constants.SERVLET_NAME + "ViewResolver")
    public ViewResolver jspResolver(){
        return super.jpaResolver();
    }

    @Bean
    public MessageSource messageSource(){
        return super.messageSource();
    }

}
