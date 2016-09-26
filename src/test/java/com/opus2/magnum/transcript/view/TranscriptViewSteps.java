package com.opus2.magnum.transcript.view;

import net.thucydides.core.annotations.Step;

public class TranscriptViewSteps {
	TranscriptView user;
	
	@Step()
	public String assertDIP(){
		return "TDIP";
	}
	
	@Step()
	public void transcriptView01(){
		user.zoomIn();
		user.zoomOut();
	}

	@Step()
	public void previewTranscript(String transcript) {
		user.previewTranscript(transcript);
	}
	
	@Step()
	public void viewTranscript() {
		user.viewTranscript();
	}
	
	@Step()
    public void zoomIn() {
        user.zoomIn();
    }
	
	@Step()
    public void zoomOut() {
        user.zoomOut();
    }
	
	@Step()
    public void transcriptView02(){
        user.transcriptView02();
    }
	@Step()
    public void transcriptView03() {
        user.transcriptView03();
    }
	@Step()
    public void transcriptView06() {
        user.transcriptView06();
    }

    public void transcriptView11() {
        user.transcriptView11();
    }

    public void transcriptView07() {
        user.transcriptView07();
    }

    public String currentUrl() {
      
      return null;
    }

    public void highlightText() {
        user.highlightText();
    }

    public void addNote() {
        user.addNote();
    }

    public void selectTag() {
        user.selectTag();
    }
}
