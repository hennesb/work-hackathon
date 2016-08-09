package ie.components.screen.flip;

import org.springframework.stereotype.Component;

@Component("svg.image")
public class PersonalizationImageAsSVG implements PersonalizationImage {

	@Override
	public String imageLocation() {
		return "http://www.humanperformancetools.com/wp-content/uploads/2015/07/give_red_blue_pill_choice_800_clr_15013.png";
	}

}
