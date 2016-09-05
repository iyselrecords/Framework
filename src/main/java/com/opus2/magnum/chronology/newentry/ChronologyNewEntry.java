package com.opus2.magnum.chronology.newentry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.opus2.util.Page;
import com.opus2.util.components.Dialog;

public class ChronologyNewEntry extends Page {
  
  public static final String NEW_ENTRY_BUTTON = "docscontrols_NewEntry";
  public static final String CHRONOLOGY_EVENT_DIALOG = "Chronology Event";
  private Dialog dialog;
  
  
  public void newEntry() {
    this.getElement(NEW_ENTRY_BUTTON).click();
  }

  public String dialog() {
    withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("dialog"));
    return dialog.dialog(CHRONOLOGY_EVENT_DIALOG).getCssValue("display");
  }
}