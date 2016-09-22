package com.opus2.magnum.transcript.view;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;

public class TranscriptView  extends Page {
	private static final String ZOOM_IN = "Make the transcript text larger";
    private static final String ZOOM_OUT = "Make the transcript text smaller";
    private Button button;
	
	

	private void print() {
		System.out.println("Transcript_View Mapped");
	}

	public void previewTranscript(String transcript) {
		getTranscript(transcript).click();
	}

	private WebElement getTranscript(String transcript) {
		WebElement element = null;
		List <WebElement> trans = Util.getDriver().findElements(By.className("indexdochead"));
		for (WebElement tran : trans){
			if(tran.getText().equals(transcript.toUpperCase())){
				element = tran;
			}
		}		
		return element;
	}

	public void viewTranscript() {
		this.getElementByClass("previewNotes").click();
		this.switchToCurrentWindow();
		Util.pause(3);
	}
	
	public void zoomIn(){
	    WebElement button = this.getElementByClass("zoom")
	        .findElements(By.tagName("button")).get(0);
	    button.click();
        Util.pause(2);
        button.click();
	}
	
	public void zoomOut(){
  	    WebElement button = this.getElementByClass("zoom")
            .findElements(By.tagName("button")).get(1);
        button.click();
        Util.pause(2);
        button.click();
    }
	
	public void transcriptView02() {
        print();
        getleftToolbarDivButton("Show the transcripts list").click();
        Util.pause(2);
        
        List <WebElement> options = Util.getDriver().findElements(By.className("doctitle"));
        for (WebElement option : options){
            System.out.println("Transcript: " + option.getText());
        }    
        getleftToolbarDivButton("Show the transcripts list").click();
    }

    public WebElement getleftToolbarDivButton(String string) {
        WebElement element = null;
        List <WebElement> buttons = Util.getDriver().findElement(By.id("leftToolbarDiv"))
            .findElements(By.tagName("button"));
        
        for (WebElement button : buttons){
            if(button.getAttribute("title").equals(string)){
                element = button;
            }
        }
        return element;
    }

    public void transcriptView03() {
        WebElement button = this.getElementByClass("search-left");
        button.click();
        Util.pause(2);
        button.click();
    }
}
