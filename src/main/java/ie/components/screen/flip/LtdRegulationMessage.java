package ie.components.screen.flip;

import org.springframework.stereotype.Component;

@Component("ltd")
public class LtdRegulationMessage implements RegulationMessage {

	@Override
	public String getRegulatedMessage() {
		return "I am a messgae for Ltd";
	}

}
