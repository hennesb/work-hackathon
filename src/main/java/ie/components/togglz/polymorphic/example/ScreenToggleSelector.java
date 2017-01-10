package ie.components.togglz.polymorphic.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.togglz.spring.proxy.FeatureProxyFactoryBean;

@Component
public class ScreenToggleSelector {
	
	
    @Autowired
    private FeatureProxyFactoryBean proxy;
    
    public ScreenSelector getScreenSelector(){
    	try {
			return (ScreenSelector) proxy.getObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Issue getting proxy " );
		}
    }

}
