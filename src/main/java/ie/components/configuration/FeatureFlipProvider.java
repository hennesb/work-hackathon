package ie.components.configuration;

import org.ff4j.FF4j;
import org.ff4j.store.JdbcFeatureStore;
import org.ff4j.web.FF4JProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ie.components.data.access.DataAccessLayer;


@Component
public class FeatureFlipProvider implements FF4JProvider {
	 
    private FF4j ff4j;
    
	@Autowired
	private DataAccessLayer dao;

    public FeatureFlipProvider() {
       
    }   
    
    private FF4j getFeatureStore(){   
    	JdbcFeatureStore store = new JdbcFeatureStore();
    	store.setDataSource(dao.getDataStore().dataSource());
    	ff4j = new FF4j();  
    	ff4j.setFeatureStore(store);
    	return ff4j;
    }

    
	@Override
	@Bean
    public FF4j getFF4j() {
		ff4j = getFeatureStore();
        return ff4j;
    }

}