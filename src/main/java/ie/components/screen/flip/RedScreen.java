package ie.components.screen.flip;

import org.springframework.stereotype.Component;

@Component("red.screen")
public class RedScreen implements ScreenColor {

	@Override
	public String getScreenColor() {
		return "red";
	}

	@Override
	public String getScreenColorDescription() {
		return "The screen is red";
	}

}
