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
    
    public void transcriptView03() {
        user.transcriptView03();
    }
}
