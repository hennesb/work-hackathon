package ie.components.home.controllers;
 
import org.ff4j.core.Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ie.components.data.access.DataAccessLayer;
import ie.data.access.row.mappers.FeatureRowMapper;
 
@Controller
@RequestMapping("/")
public class HomeController {
	
	private static final String SQL = "select * from ff4j_features where feat_uid = ?";
	
	@Autowired
	private DataAccessLayer dao;
	
 
    public void setDao(DataAccessLayer dao) {
		this.dao = dao;
	}


	@RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", getFeatureName());
        return "homePage";
    }
	
	private String getFeatureName(){
	    Feature feature = dao.getJdbcTemplate().queryForObject(SQL, new FeatureRowMapper(), new Object[]{"1a"})	;
	    return feature.getDescription();
	}

 
}