package com.opus2.util.components;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.ImplementedBy;

import com.opus2.util.components.impl.AnnotationImpl;

@ImplementedBy(AnnotationImpl.class)
public interface Annotation extends Component {
    WebElement button(String title);
	void addTag(String tag);
	WebElement note(String note);
	void highlightText(int page, int line);
	void addNote(String note);
	WebElement lineText(int page, int line);
}
