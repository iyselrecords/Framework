package com.opus2.enums;

public enum TranscriptOptions {
	ExportPDF ("Export PDF"),
	ImportDesignations ("Import Designations"),
	Designations ("Designations"),
	ImportAnnotations ("Import Annotations"),
	ReplaceTranscript ("Replace Transcript"),
	Timecodes ("Timecodes"),
	ExportWithTimestamps ("Export with Timestamps"),
	UploadVideo ("Upload video");
	
	private String option;
	
	private TranscriptOptions(String option){
		this.option = option;
	}
	
	public String returnEnum(){
		return option;
	}
}
