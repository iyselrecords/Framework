package com.opus2.magnum.admin.metadata;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Dialog;

public class AdminMetadata extends Page {
    private Dialog dialog;
    private int Index;
    private static final String CUSTOM_FIELDS_APPLY = "custom-field_Apply";
    private static final String CUSTOM_FIELDS_DIALOG = "Custom Fields";
    private static final String SHOW_IN_CHRONOLOGY_PREVIEW = "Show in Chronology Preview";
    
    public void edit(String column) {
        List <WebElement> fieldnames = Util.getDriver().findElement(By.className("doccolumns"))
            .findElements(By.tagName("tr")).get(0)
              .findElements(By.className("data"));
        for(WebElement fieldname : fieldnames){
            if(fieldname.findElement(By.tagName("span")).getText().equals(column)){    
                Index = fieldnames.indexOf(fieldname);
            }
        }
        
        System.out.println("myIndex: "+ Index);
        //List <WebElement> editButtons = getDialog().findElement(By.className("dialogSection"))
            //.findElements(By.tagName("tr"));
    }
    
    public WebElement getDialog(){
        return dialog.dialog(CUSTOM_FIELDS_DIALOG);
    }
    
    public void checkChronologyToPreview() {
        List <WebElement> labels = getDialog().findElement(By.className("dialogSection"))
            .findElements(By.tagName("tr"));
        for(WebElement label : labels){
            if(label.findElements(By.tagName("td")).get(0).equals(SHOW_IN_CHRONOLOGY_PREVIEW)){
                label.findElements(By.tagName("input")).get(0).click();
                break;
            }
        }
    }
    
    public void apply() {
        this.getElement(CUSTOM_FIELDS_APPLY).click();
    }
}
