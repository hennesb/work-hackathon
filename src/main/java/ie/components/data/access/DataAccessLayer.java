package ie.components.data.access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ie.api.data.access.DataStore;

@Component
public class DataAccessLayer {
	
	@Autowired
	private DataStore dataStore;

	public void setDataStore(DataStore dataStore) {
		this.dataStore = dataStore;
	}

	public DataStore getDataStore() {
		return dataStore;
	}

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataStore.dataSource());
	}
	
	

}
