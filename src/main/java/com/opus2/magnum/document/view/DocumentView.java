package com.opus2.magnum.document.view;

import java.util.Calendar;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opus2.magnum.chronology.newentry.ChronologyNewEntry;
import com.opus2.util.Page;
import com.opus2.util.TestData;
import com.opus2.util.Util;
import com.opus2.util.components.Annotation;
import com.opus2.util.components.Dropdown;

public class DocumentView extends Page {
    private static final String ENTRY_TYPES = TestData.CHRONOLOGY_.getProperty("entryType");
    private static final String ENTRY_STATUS = TestData.CHRONOLOGY_.getProperty("entryStatus");
    private static final String ENTRY_DATEOPTION = TestData.CHRONOLOGY_.getProperty("entryDateOption");
    private static final String ENTRY_TIMEZONE = TestData.CHRONOLOGY_.getProperty("entryTimezone");
    public static final String NEW_ENTRY = TestData.CHRONOLOGY_.getProperty("entryDescription");
    public static final String NEW_NOTE = TestData.DOCUMENTSVIEW_.getProperty("newEntryNote");
    private static final String SAVE_NOTE = "annotation-editor_Save";
    private static final String CANCEL_NOTE = "annotation-editor_Cancel";
    private static final String HIDE_NOTE = "glyphicons-remove-2";
    private static final String CLIPBOARD = "notepad-clipboard-button";
    private static final String ADD_RECIPIENT = "glyphicons-user-add";
    private static final String SELECT_TAG = "icon-tagging";
    private static String NOTE = null;
    
    private Actions action = new Actions(Util.getDriver());
    private ChronologyNewEntry entry = new ChronologyNewEntry();
    private Annotation note;
    private Dropdown option;
    private WebElement element = null;

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
        NOTE = TestData.DOCUMENTSVIEW_.getProperty(note);
        getTextArea().sendKeys(NOTE);
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
        /*
        List<WebElement> notes = Util.getDriver().findElements(By.className("note"));
        for(WebElement note : notes){
            if(note.findElements(By.className("notepara")).get(0).getText().equals(NOTE)){
                note.findElements(By.className("chroniconlink")).get(0).click();
                break;
            }
        }
        */

        Util.pause(3);
    }
    
    //Created Note
    public void noteBuild() {
        highlightText();
        addNote("Test");
        getEditButton();
        getReplyButton();
        hideNote();
        getDeleteButton();
    }
    ////////////////////////////////////////
    public WebElement getNote() {      
        List<WebElement> notes = Util.getDriver().findElements(By.className("note"));
        for(WebElement note : notes){
            if(note.findElements(By.className("notepara")).get(0).getText().equals(NEW_NOTE)){            
                element = note;  
                break;
            }
        }
        return element;
    }
    public WebElement getEditButton(){
        return getNote().findElement(By.linkText("Edit"));
    } 
    public WebElement getReplyButton(){
        return getNote().findElement(By.linkText("Reply"));
    }
    public WebElement getDeleteButton(){
        return getNote().findElement(By.linkText("Delete"));
    }
    public void hideNote() {
        getNote().findElements(By.className(HIDE_NOTE)).get(0).click();
    }
    public WebElement getChroniconLink(){
        return getNote().findElements(By.className("chroniconlink")).get(0);
    }
    
    
    //Annotation-dialog
    public void annotationBuild() {
        emailNotification().click();
        selectDropdown("Rob Thomson");
        addAnotherRecipient();
        Util.pause(1);
        removeRecipient();
        //showSelectedTextInClipboard();
        selectedTagForNote();
        Util.pause(5);
    }
    ////////////////////////////////////////
    public WebElement noteDialog(){
        return this.getElement("annotation-editor");
    }   
    public WebElement getTextArea(){
        return noteDialog().findElements(By.tagName("textarea")).get(1);
    }
    public WebElement emailNotification(){
        List <WebElement> lists = noteDialog().findElements(By.tagName("input"));
        return lists.get(lists.size()-1);
    }
    public void selectDropdown(String dropdownOption) {
        getOption(dropdownOption);
    }
    private void getOption(String dropdownOption) {
        Util.getDriver().findElements(By.className("normalIcon")).get(0).click(); 
        List<WebElement> options = noteDialog().findElements(By.className("menu")).get(0)
            .findElements(By.tagName("span"));
        for(WebElement option : options){       
            if(option.getText().equals(dropdownOption)){
                option.click();
                break;
            }
        }
        Util.pause(1);
    }

    public void addAnotherRecipient() {
        noteDialog().findElements(By.className(ADD_RECIPIENT)).get(0).click();
    }
    public void removeRecipient() {
        List <WebElement> lists = noteDialog().findElements(By.className(HIDE_NOTE));
        lists.get(lists.size()-1).click();
    }
    public void selectFromNewRecipient() {
        this.getElement(CANCEL_NOTE).click();
    }
    public void showSelectedTextInClipboard() {
        this.getElement(CLIPBOARD).click();
    }
    public void selectedTagForNote() {
        noteDialog().findElement(By.className(SELECT_TAG)).click();
    }
    public void addNoteAsSourceToChronology() {
        this.getElement(SAVE_NOTE).click();
    }
    public void linkNoteToAnotherDocument() {
        this.getElement(CANCEL_NOTE).click();
    }  
    public void saveNote() {
        this.getElement(SAVE_NOTE).click();
    }
    public void cancelNote() {
        this.getElement(CANCEL_NOTE).click();
        Util.pause(2);
    }
    
    public void createdNote() {
        getNote().click();
        Util.pause(1);
        editNote();
        cancelNote();
        replyNote();
        cancelNote();
        hideNote();
        Util.pause(5);
        deleteNote();
    }
    
    public void editNote() {
        getEditButton().click();
        Util.pause(2);
    }
    public void replyNote() {
        getReplyButton().click();
        Util.pause(2);
    }
    public void deleteNote() {
        getDeleteButton().click();
        Util.pause(5);
        checkAlert();
        Util.pause(2);
    }

    private void getMyAlert() {
        try{
            Util.pause(2);
            Util.getDriver().switchTo().alert().accept();
        }catch(NoAlertPresentException e){
            e.getMessage();
            getMyAlert();
        }
    }

    public void checkAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(Util.getDriver(), 5);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = Util.getDriver().switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            checkAlert();
        }
    }
    
    public String noteIsCreated() {
         Util.pause(2);
         return getNote().findElement(By.xpath("..")).getCssValue("display");
    }
}
