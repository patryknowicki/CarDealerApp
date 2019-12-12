package cardealer.log;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import cardealer.log.WebConfig;
import cardealer.log.SecurityConfig;


public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SecurityConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}