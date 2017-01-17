package ie.components.configuration;
 
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.togglz.spring.proxy.FeatureProxyFactoryBean;

import ie.components.togglz.polymorphic.example.QuoteDisabledScreen;
import ie.components.togglz.polymorphic.example.QuoteEnabledScreen;

 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "ie.components, org.ff4j.aop")
public class AppConfiguration extends WebMvcConfigurerAdapter{
	
	
	private static final String IMAGE_URI_PATH = "/images/**";
	private static final String SCRIPTS_URI_PATH = "/scripts/**";
	private static final String IMAGE_RESOURCES = "/resources/images/";
	private static final String SCRIPTS_RESOURCES = "/resources/scripts/";
	private static final int CACHE_EXPIRED_AFTER = 3000000;
	
	
	
	
	
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
 
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler(IMAGE_URI_PATH).addResourceLocations(IMAGE_RESOURCES).setCachePeriod(CACHE_EXPIRED_AFTER);
        registry.addResourceHandler(SCRIPTS_URI_PATH).addResourceLocations(SCRIPTS_RESOURCES).setCachePeriod(CACHE_EXPIRED_AFTER);
    }
    
    
    @Bean
	public FeatureProxyFactoryBean getScreenSelector() throws Exception{
		FeatureProxyFactoryBean bean = new FeatureProxyFactoryBean();
		bean.setFeature("FEATURE_ONE");
	    bean.setActive(new QuoteEnabledScreen());
	    bean.setInactive(new QuoteDisabledScreen());	
		return bean;
		
	}
}