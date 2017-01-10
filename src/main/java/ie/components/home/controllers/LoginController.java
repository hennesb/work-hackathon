package ie.components.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String landing(){
		return "login";
	}

	
	@RequestMapping(method = RequestMethod.POST)
	public String attemptLogin(){
		return "login";
	}
}
