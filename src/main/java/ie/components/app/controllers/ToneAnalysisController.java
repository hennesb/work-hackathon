package ie.components.app.controllers;

/**
 * @author RDuffy
 *
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app/tone-analysis")
public class ToneAnalysisController {

    @RequestMapping(method = RequestMethod.GET)
    public String getToneAnalysisPage(ModelMap model) {
        model.addAttribute("Task1", "Create Controller Class with Get, Post and Head requests");
        return "toneAnalysis";
    }
}

