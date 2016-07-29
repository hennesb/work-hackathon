package ie.components.screen.flip;

import org.springframework.stereotype.Component;

@Component("dac")
public class DacRegulationMessage implements RegulationMessage {

	@Override
	public String getRegulatedMessage() {
		return "I am a message for dac";
	}

}
