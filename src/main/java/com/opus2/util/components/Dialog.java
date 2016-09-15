package com.opus2.util.components;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.ImplementedBy;

import com.opus2.util.components.impl.DialogImpl;

@ImplementedBy(DialogImpl.class)
public interface Dialog extends Component {
	String hasDialog(String elementId);
	WebElement xButton(String elementId);
	String notVisible(String elementId);
	WebElement folder(String folder);
	WebElement dialog(String header);
	WebElement hasInput(String dialog);
	WebElement hasTextArea(String dialog);
	String getTitle(String dialogId);
	WebElement button(String button);
	WebElement buttonByTitle(String title);
	void find(String linkDocument);
	void links(String links);
	void find2(String dialog, String linkDocument);
	void input(String dialog, String input);
	void select(String string);
	void selectDocument(String string);
    WebElement itemText(String dialogId, String itemText);
}
