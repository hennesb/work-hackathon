package ie.components.screen.flip;

import org.ff4j.aop.Flip;

public interface ScreenColor {
	
	@Flip(name="screen-colour-feature", alterBean="green.screen")
	public String getScreenColor();

}
