package com.opus2.magnum.document.view;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.opus2.magnum.chronology.newentry.ChronologyNewEntry;
import com.opus2.util.Page;
import com.opus2.util.TestData;
import com.opus2.util.Util;
import com.opus2.util.components.Annotation;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.Dropdown;

public class DocumentView extends Page {
    private static final String ENTRY_TYPES = TestData.CHRONOLOGY_.getProperty("entryType");
    private static final String ENTRY_STATUS = TestData.CHRONOLOGY_.getProperty("entryStatus");
    private static final String ENTRY_DATEOPTION = TestData.CHRONOLOGY_.getProperty("entryDateOption");
    private static final String ENTRY_TIMEZONE = TestData.CHRONOLOGY_.getProperty("entryTimezone");
    public static final String NEW_ENTRY = TestData.CHRONOLOGY_.getProperty("entryDescription");
    private static String NOTE = null;
    
    private Actions action = new Actions(Util.getDriver());
    private ChronologyNewEntry entry = new ChronologyNewEntry();
    private Annotation note;
    private Dropdown option;

    public String viewUrl(){
        return TestData.DOCUMENTSVIEW_.getProperty("documentUrl");
    }
    
    public void highlightText(){
        text(100,200);
    }
    
    public void text(int a, int b){
        WebElement text = this.getElement("tranche")
            .findElements(By.className("pdfpage")).get(0)
                .findElements(By.tagName("img")).get(0);
        
        action.moveToElement(text, a, b).clickAndHold()
            .moveByOffset(20, 20).release().build().perform();
        Util.pause(2);
    }
    public void closeAnnotationDiaog(){
        this.getElement("annotation-editor_Cancel").click();
        Util.pause(2);
    }
    public String dialog() {
        return "block";
    }

    public void addNote(String note) {
        WebElement input = this.getElement("annotation-editor")
            .findElements(By.tagName("textarea")).get(1);
        NOTE = TestData.DOCUMENTSVIEW_.getProperty(note);
        input.sendKeys(NOTE);
        Util.pause(1);
    }
    
    public void add2Chronolgy(){
        note.button("Add as source to chronology").click();
    }

    public void selectChronology(String dropdownOption) {
        Util.getDriver().findElements(By.className("normalIcon")).get(1).click();
        List<WebElement> options = Util.getDriver().findElements(By.className("menu")).get(1)
            .findElements(By.tagName("span"));
        for(WebElement option : options){
            if(option.getText().equals(dropdownOption)){
                option.click();
                break;
            }
        }
        Util.pause(1);
    }

    public void newEntries() {
        option.myOption(2, ENTRY_TYPES);
        option.myOption(3, ENTRY_DATEOPTION);
        entry.inputDate();
        option.myOption(4, ENTRY_STATUS);
        entry.inputTime();
        option.myOption(5, ENTRY_TIMEZONE);
        entry.selectTag();
        entry.description();
        entry.saveEntry();
    }

    public void linkedNote() {
        List<WebElement> notes = Util.getDriver().findElements(By.className("note"));
        for(WebElement note : notes){
            if(note.findElements(By.className("notepara")).get(0).getText().equals(NOTE)){
                note.findElements(By.className("chroniconlink")).get(0).click();
                break;
            }
        }
        Util.pause(3);
    }
}
