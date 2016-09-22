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
		user.transcriptView01();
	}

	@Step()
	public void previewTranscript(String transcript) {
		user.previewTranscript(transcript);
	}
	
	@Step()
	public void viewTranscript() {
		user.viewTranscript();
	}
}
