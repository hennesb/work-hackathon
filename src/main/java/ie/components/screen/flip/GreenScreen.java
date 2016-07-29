package ie.components.screen.flip;

import org.springframework.stereotype.Component;

@Component("green.screen")
public class GreenScreen implements ScreenColor {

	@Override
	public String getScreenColor() {
		return "green";
	}

}
