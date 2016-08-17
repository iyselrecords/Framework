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
    String dialog(String header);
    WebElement hasInput(String dialog);
    WebElement hasTextArea(String dialog);
    String getTitle(String dialogId);
}
