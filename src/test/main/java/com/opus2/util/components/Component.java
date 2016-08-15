package com.opus2.util.components;

import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.components.impl.ComponentImpl;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;

@ImplementedBy(ComponentImpl.class)
public interface Component extends WebElementFacade {
	public boolean hasClass(String className);
	ElementLocator getLocator();
	Component refresh();
}
