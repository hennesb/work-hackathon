package ie.components.screen.flip;

import org.ff4j.aop.Flip;

public interface PersonalizationImage {
	@Flip(name="rules-engine-feature", alterBean="svg.image")
	public String imageLocation();

}
