package com.opus2.pages.home.recentdocuments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Dialog;

public class RecentDocuments extends Page {

  private static final String RECENT_DOCUMENT_HEADER = "recent-docs-container";
  private static final String RECENT_DOC_SECTION = "recentDocs";
  private static final String TARGET_DOCUMENT = "RecentTestDoc";
  private static final String TARGET_TRANSCRIPT = "TestTranscript";
  private static final String DOC_PREVIEW = "doc-preview";
  
  private Dialog dialog;
  
  public WebElement recDocSection() {
      return this.getElement(RECENT_DOCUMENT_HEADER);
  }

  public WebElement docHasLoaded() {
      return this.getElement(RECENT_DOC_SECTION);
  }
  
  public WebElement targetDocument(){
      return span(TARGET_DOCUMENT);
  }

  public WebElement targetTranscript() {
      return span(TARGET_TRANSCRIPT);
  }
  
  private WebElement span(String targetDoc) {
      WebElement span = null;
      List <WebElement> spans = Util.getDriver().findElement(By.id(RECENT_DOC_SECTION))
          .findElements(By.tagName("span"));
      for(WebElement elem : spans){
          if(elem.getText().equals(targetDoc)){
              span = elem;
          }
      }
      return span;
  }
  
  public void previewDocument() {
      targetDocument().click();
  }
  
  public void previewTranscript() {
      targetTranscript().click();
  }

  public String previewDialog() {
      withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(DOC_PREVIEW));
      return dialog.hasDialog(DOC_PREVIEW);
  }

  public String previewDialogTitle() {
      withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(DOC_PREVIEW));
      return dialog.getTitle(DOC_PREVIEW);
  }
 }
