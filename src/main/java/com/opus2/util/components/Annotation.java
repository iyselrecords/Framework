package com.opus2.util.components;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.ImplementedBy;

import com.opus2.util.components.impl.AnnotationImpl;

@ImplementedBy(AnnotationImpl.class)
public interface Annotation extends Component {
	void addTag(String tag);
	WebElement note(String note);
}
