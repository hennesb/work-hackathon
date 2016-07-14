/**
 * 
 */
package ie.feature.store;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.ff4j.core.Feature;
import org.ff4j.core.FeatureStore;

/**
 * @author hennesb
 *
 */
public class FileBasedFeatureStore implements FeatureStore {

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#addToGroup(java.lang.String, java.lang.String)
	 */
	@Override
	public void addToGroup(String arg0, String arg1) {
	

	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#clear()
	 */
	@Override
	public void clear() {
	

	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#create(org.ff4j.core.Feature)
	 */
	@Override
	public void create(Feature arg0) {
		

	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#delete(java.lang.String)
	 */
	@Override
	public void delete(String arg0) {
		

	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#disable(java.lang.String)
	 */
	@Override
	public void disable(String arg0) {
	

	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#disableGroup(java.lang.String)
	 */
	@Override
	public void disableGroup(String arg0) {
		

	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#enable(java.lang.String)
	 */
	@Override
	public void enable(String arg0) {
	

	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#enableGroup(java.lang.String)
	 */
	@Override
	public void enableGroup(String arg0) {
	

	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#exist(java.lang.String)
	 */
	@Override
	public boolean exist(String arg0) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#existGroup(java.lang.String)
	 */
	@Override
	public boolean existGroup(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#grantRoleOnFeature(java.lang.String, java.lang.String)
	 */
	@Override
	public void grantRoleOnFeature(String arg0, String arg1) {

	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#importFeatures(java.util.Collection)
	 */
	@Override
	public void importFeatures(Collection<Feature> arg0) {
	

	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#read(java.lang.String)
	 */
	@Override
	public Feature read(String arg0) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#readAll()
	 */
	@Override
	public Map<String, Feature> readAll() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#readAllGroups()
	 */
	@Override
	public Set<String> readAllGroups() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#readGroup(java.lang.String)
	 */
	@Override
	public Map<String, Feature> readGroup(String arg0) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#removeFromGroup(java.lang.String, java.lang.String)
	 */
	@Override
	public void removeFromGroup(String arg0, String arg1) {

	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#removeRoleFromFeature(java.lang.String, java.lang.String)
	 */
	@Override
	public void removeRoleFromFeature(String arg0, String arg1) {

	}

	/* (non-Javadoc)
	 * @see org.ff4j.core.FeatureStore#update(org.ff4j.core.Feature)
	 */
	@Override
	public void update(Feature arg0) {

	}

}
