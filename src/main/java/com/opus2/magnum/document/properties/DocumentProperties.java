package com.opus2.magnum.document.properties;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.Dropdown;
import com.opus2.util.components.RightClickMenu;

public class DocumentProperties extends Page {
    private static final String PROPERTIES_DIALOG = "Properties";
    private static final String PROPERTIES_APPLY = "properties_Apply";
    
    private RightClickMenu menu;
    private Dialog dialog;
    private Dropdown option;
      
    
    public WebElement option(String menuOption) {  
        return menu.hasOption(menuOption);
    }
  
    public void propertiesOption() {
        option(PROPERTIES_DIALOG).click();
    }
  
    public String dialog() {
        return dialog.hasDialog("properties");
    }
    
    public void dropdown(String optionName) {
        dialog.dropdown(PROPERTIES_DIALOG, 1, optionName);
    }
    
    public void exhibit(String value) {
        WebElement input = dialog.dialog(PROPERTIES_DIALOG)
            .findElements(By.className("tx_input")).get(1);
        input.clear();
        input.sendKeys(value);
    }
    
    public void deponent(String value) {
        WebElement input = dialog.dialog(PROPERTIES_DIALOG)
            .findElements(By.className("tx_input")).get(2);
        input.clear();
        input.sendKeys(value);
    }
    
    public void apply() {
        this.getElement(PROPERTIES_APPLY).click();
        Util.pause(2);
    }
}
