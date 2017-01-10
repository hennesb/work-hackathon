package ie.components.togglz.configuration;

import java.io.File;
import org.springframework.stereotype.Component;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;
import org.togglz.spring.security.SpringSecurityUserProvider;

import ie.poc.togglz.*;


@Component
public class TogglesConfig implements TogglzConfig {

	public Class<? extends Feature> getFeatureClass() {
		return MyFeatures.class;
	}

	public StateRepository getStateRepository() {
		return new FileBasedStateRepository(new File("/tmp/features.properties"));
	}

    @Override
    public UserProvider getUserProvider() {
    	return logonNoAuth();
    	//return new SpringSecurityUserProvider("ADMIN_AUTHORITY");

    }
    
    
    private UserProvider logonNoAuth(){
    	return new UserProvider() {
        @Override
        public FeatureUser getCurrentUser() {
            return new SimpleFeatureUser("admin", true);
         }
       };  
    }

}
