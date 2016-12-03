package ie.components.home.controllers;
 
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import javax.servlet.http.HttpServletRequest;

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
	
	private static Charset utf8charset = Charset.forName("UTF-8");
	private static Charset win1252charset = Charset.forName("Windows-1252");

	


	
	private static final String SQL = "select * from ff4j_features where feat_uid = ?";
	
	@Autowired
	private DataAccessLayer dao;
	

    public void setDao(DataAccessLayer dao) {
		this.dao = dao;
	}


	@RequestMapping(method = RequestMethod.GET)
    public String sayHello(HttpServletRequest request,ModelMap model) throws UnsupportedEncodingException {
        model.addAttribute("greeting", getFeatureName());
        model.addAttribute("assented","á");
        model.addAttribute("pound", "£");
        model.addAttribute("euro", "€");
        String asUTF8 = new String("á".getBytes(), "UTF-8");
    	String asWin1252 = new String(asUTF8.getBytes(), "Windows-1252");
    	

   
    	ByteBuffer outputBuffer = utf8charset.encode(CharBuffer.wrap(asWin1252.toCharArray()));
    	byte[] outputData = outputBuffer.array();
    	//model.addAttribute("converted",new String(outputData));
        //model.addAttribute("converted",new String(asUTF8.getBytes(), "Windows-1252"));
        model.addAttribute("converted",request.getParameter("x"));
        model.addAttribute("theEncoding" , Charset.defaultCharset());
        return "homePage";
    }
	
	private String getFeatureName(){
	    Feature feature = dao.getJdbcTemplate().queryForObject(SQL, new FeatureRowMapper(), new Object[]{"conditional-check"})	;
	    return feature.getDescription();
	}

 
}