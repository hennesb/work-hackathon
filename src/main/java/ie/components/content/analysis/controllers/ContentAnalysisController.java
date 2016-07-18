package ie.components.content.analysis.controllers;

import ie.services.PostAnalysis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContentAnalysisController{
	
	@RequestMapping(value = {"/app/content-analysis"}, method = RequestMethod.GET)
	public String contentAnalysis(Model model){
		model.addAttribute("contentAnalysis", new PostAnalysis());
		return "contentAnalysis";
	}
	
	@RequestMapping(value ={"/app/content-analysis"}, method = RequestMethod.POST)
	public String contentPostAnalysis(@ModelAttribute PostAnalysis contentAnalysis, Model model){
		model.addAttribute("contentAnalysis", contentAnalysis);
		return "contentPostAnalysis";		
	}
}



















