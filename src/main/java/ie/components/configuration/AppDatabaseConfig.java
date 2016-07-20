package ie.components.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

import ie.api.data.access.DataStore;

@Configuration
@ImportResource("classpath:/config/database-config-live.xml")
@Profile("live")
public class AppDatabaseConfig implements DataStore {
	
	@Autowired
	private DataSource dataSource;

	@Override
	public DataSource dataSource() {
		return dataSource;
	}

}
