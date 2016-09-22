package com.opus2.magnum.transcript.view;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.Util;

public class TranscriptView  extends Page {
	
	public void transcriptView01() {
		print();
	}

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
}
