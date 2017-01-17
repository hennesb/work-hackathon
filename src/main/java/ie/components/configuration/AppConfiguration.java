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

import static ie.components.configuration.AbstractApplicationResourcesConfig.*;

 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "ie.components, org.ff4j.aop")
public class AppConfiguration extends WebMvcConfigurerAdapter{
	
	
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