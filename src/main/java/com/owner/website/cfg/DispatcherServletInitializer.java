package com.owner.website.cfg;

import com.owner.AbstractAnnotationServletInitializer;
import com.owner.ApplicationConfig;
import com.owner.core.cfg.MyBatisConfig;

public class DispatcherServletInitializer extends AbstractAnnotationServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses(){
        return new Class<?>[]{ApplicationConfig.class, MyBatisConfig.class};
    }
    @Override
    protected String getServletName(){
        return Constants.SERVLET_NAME;
    }

    @Override
    protected String[] getServletMappings(){
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class<?>[]{MvcConfig.class};
    }

}