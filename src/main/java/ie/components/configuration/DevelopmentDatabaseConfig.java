package ie.components.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import ie.api.data.access.DataStore;

@Configuration
@Profile("development")
public class DevelopmentDatabaseConfig implements DataStore{
	
	@Override
	public DataSource dataSource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase dataSource = builder
			.setType(EmbeddedDatabaseType.HSQL) 
			.generateUniqueName(true)
			.addScript("config/create-db.sql")
			.addScript("config/insert-data.sql")
			.build();
	
		return dataSource;
	}
	
	


}
