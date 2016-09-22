package com.opus2.magnum.transcript;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;

public class TranscriptSteps {
	Transcript user;
	
	@Step()
	public String assertDIP(){
		return "TDIP";
	}
		
	@Step()
    public void next(){
        user.next();
    }
	
	@Step()
    public void previous(){
        user.previous();
    }
	
	@Step()
    public void dropdownPage(String pageNum){
        user.dropdownPage(pageNum);
    }
    
    @Step()
    public void findTranscript(String transcript) {
        user.findTranscript(transcript);
    }
    
    @Step()
    public String getTranscript(){
        return user.getTranscript();
    }
    
    @Step()
    public void transcriptDIP(String trans){
        user.findTranscript(trans);
    }

    @Step()
    public void transcript01(){
        
    }
}
