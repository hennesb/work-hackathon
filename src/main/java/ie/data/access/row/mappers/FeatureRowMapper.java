package ie.data.access.row.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ff4j.core.Feature;
import org.springframework.jdbc.core.RowMapper;

public class FeatureRowMapper implements RowMapper<Feature> {

	@Override
	public Feature mapRow(ResultSet set, int arg1) throws SQLException {
		Feature feature = new Feature(set.getString(1));
		feature.setDescription(set.getString(3));
		return feature;
	}

}
