package ie.components.screen.flip;

import org.ff4j.aop.Flip;

@Flip(name="screen-colour-feature", alterBean="green.screen")
public interface ScreenColor {
	
	public String getScreenColor();
	
	public String getScreenColorDescription();

}
