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
	public ModelAndView contentAnalysis(){
		return new ModelAndView("contentAnalysis", "analysis", new PostAnalysis());
		
	}
	
	@RequestMapping(value ={"/app/content-post-analysis"}, method = RequestMethod.POST)
	public String contentPostAnalysis(@ModelAttribute("analysis") PostAnalysis analysis, Model model){
		model.addAttribute("fname", analysis.getFname());
		model.addAttribute("lname", analysis.getLname());
		return "contentPostAnalysis";		
	}
}



















