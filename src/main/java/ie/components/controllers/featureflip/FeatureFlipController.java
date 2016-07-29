package ie.components.controllers.featureflip;

import org.ff4j.web.FF4JProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ie.components.screen.flip.RegulationMessage;
import ie.components.screen.flip.ScreenColor;


@Controller
public class FeatureFlipController {
	
	@Autowired
	private FF4JProvider flipProvider;
	
	@Autowired
	@Qualifier("red.screen")
	private ScreenColor screenColor;
	
	@Autowired
	@Qualifier("ltd")
	private RegulationMessage messageProducer;
	
	

	@RequestMapping(method = RequestMethod.GET , path="/flip-home")
    public String flipHomePage(ModelMap model) {
        model.addAttribute("featureEnabled", flipProvider.getFF4j().getFeature("conditional-check").isEnable());
        return "homePage";
    }
	
	@RequestMapping(method = RequestMethod.GET, path="/screen-color")
	public String screenColour(Model model){
		String color = screenColor.getScreenColor();
		model.addAttribute("screencolor", color);
		return "screenColorPage";
	}

	
	@RequestMapping(method = RequestMethod.GET, path="/regulation-message")
	public String getRegulationMessage(Model model){
		String message = messageProducer.getRegulatedMessage();
		model.addAttribute("message", message);
		return "regulation";
	}
	
}
