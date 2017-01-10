package ie.components.togglz.polymorphic.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class QuoteEnabledScreen implements ScreenSelector {

	@Override
	public String getViewName() {		
		return "quoteEnabled";
	}

}
