package com.opus2.magnum.documents.view;

import com.opus2.magnum.document.view.DocumentView;

import net.thucydides.core.annotations.Step;

public class DocumentViewSteps {
    DocumentView view;
    
    @Step()
    public String assertDIP(){
        return "TDIP";
    }
    
    @Step()
    public String viewUrl(){
        return view.viewUrl();
    }
    
    @Step()
    public void highlightText(){
        view.highlightText();
    }
    
    @Step()
    public String dialog() {
        return view.dialog();
    }
    
    @Step()
    public void addNote(String note) {
        view.addNote(note);
    }
    
    @Step()
    public void add2Chronolgy() {
        view.add2Chronolgy();
    }
    
    @Step()
    public void selectChronology(String option) {
        view.selectChronology(option);
    }

    @Step()
    public void newEntries() {
        view.newEntries();
    }

    @Step()
    public void linkedNote() {
        view.linkedNote();
    }
}
