package com.opus2.magnum.chronology.tools;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.enums.Tool;
import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.Tools;

public class ChronologyTools extends Page {
    public static final String TOOLS_BUTTON = "docscontrols_Tools";
    private static final String CHRON_TOOLS = "chron-tools";
    public static final String DELETE_ALL = "Delete All";
    public static final String LINK_ENTRIES_TO_SOURCE = "Link Entries to Sources";
    public static final String EXPORT_AS_PDF = "Export as PDF";
    public static final String EXPORT_AS_PDF_WITH_DOC = "Export as PDF\n(with Documents)";
    public static final String EXPORT_AS_CSV = "Export as CSV";
    public static final String EXPORT_AS_DOCX = "Export as DOCX";
    private static final String CREATE_LINK = "Create Links";
    
    private Tools tool;
    private Dialog dialog;
	
	public void button() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(TOOLS_BUTTON));
		this.getElement(TOOLS_BUTTON).click();
	}

	public String dropdown() {
		return this.getElement(CHRON_TOOLS).getCssValue("display");
	}

	public void selectOption(String option) {
		if( option != DELETE_ALL || 
            option != LINK_ENTRIES_TO_SOURCE || 
            option != EXPORT_AS_CSV )
		{
          tool.getOption(Tool.CHRONOLOGY, option);
        }else{
            tool.getOption(Tool.CHRONOLOGY, option);
            this.switchToCurrentWindow();
            Util.pause(3);
        }
	}

	public String dialog() {
      return dialog.dialog(LINK_ENTRIES_TO_SOURCE).getCssValue("display");
    }
  
    public void createLink() {
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("dialog"));
        dialog.button(CREATE_LINK).click();
    }
    
    public void showThumbnails(){
        thumbnails().click();
        Util.pause(7);
    }
    
    private WebElement thumbnails() {
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.name("Show Thumbnails"));
        return Util.getDriver().findElements(By.name("Show Thumbnails")).get(0);
    }

    public void pan() {
        List <WebElement> t = Util.getDriver().findElements(By.className("thumb"));
        
        for(WebElement a : t){
          if(a.isDisplayed()){
              System.out.println("display:" + t.size());
          }else if(!a.isDisplayed()){
              System.out.println("notDisplay:" + t.size());
          }
        }
    }
}
