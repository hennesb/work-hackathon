package ie.components.togglz.polymorphic.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



public class QuoteDisabledScreen implements ScreenSelector {

	@Override
	public String getViewName() {
		return "quoteDisabled";
	}

}
