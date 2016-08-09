package ie.components.screen.flip;

import org.springframework.stereotype.Component;

@Component("jpeg.image")
public class PersonalizationImageAsJpeg implements PersonalizationImage {

	@Override
	public String imageLocation() {		
		return "https://static1.squarespace.com/static/5244bc31e4b0d312c8099ac4/t/558ad556e4b0a7d87c0e7b65/1435161943391/DECISION+EFFECTIVENESS+(DE).jpg?format=1500w";
	}

}
