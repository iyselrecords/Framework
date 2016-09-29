package com.opus2.magnum.document.properties;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;

public class DocumentPropertiesSteps {
    DocumentProperties doc;
    
    @Step()
    public String assertDIP(){
        return "TDIP";
    }
    
    @Step()
    public WebElement option(String menuOption) {
        return doc.option(menuOption);
    }
    
    @Step()
    public void propertiesOption() {
        doc.propertiesOption();
    }
    
    @Step()
    public String dialog() {
        return doc.dialog();
    }

    @Step()
    public void dropdown(String option) {
        doc.dropdown(option);
    }
    
    @Step()
    public void exhibit(String value) {
        doc.exhibit(value);
    }
    
    @Step()
    public void deponent(String option) {
        doc.deponent(option);
    }
    
    @Step()
    public void apply() {
        doc.apply();
    }
}
