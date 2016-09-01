package com.owner.admin.cfg;

import com.owner.AbstractAnnotationServletInitializer;
/**
 * Created with PMS
 * User : Tim.Yao
 * Date : 2016/8/16.
 */
public class DispatcherServletInitializer extends AbstractAnnotationServletInitializer{

    @Override
    protected String getServletName(){
        return Constants.SERVLET_NAME;
    }

    @Override
    protected String[] getServletMappings(){
        return new String[]{String.format("/%s/*", Constants.SERVLET_NAME)};
    }

    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class<?>[]{MvcConfig.class};
    }

}