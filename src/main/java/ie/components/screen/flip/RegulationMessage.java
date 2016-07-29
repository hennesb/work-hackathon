package ie.components.screen.flip;

import org.ff4j.aop.Flip;
public interface RegulationMessage {
	
	@Flip(name="regulation-message", alterBean="dac")
	public String getRegulatedMessage();

}
