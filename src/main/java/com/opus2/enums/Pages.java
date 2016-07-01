package com.opus2.enums;

public enum Pages {
	Home("Home"),
	Documents("Documents"),
	Transcripts("Transcripts"),
	Chronology("Chronology"),
	Notes("Notes"),
	Search("Search"),
	Admin("Admin"),
	LoginSecond("Login Second"),
	MonitoringUserActivity("Monitoring User Activity");

	private String page;
	private Pages(String page){
		this.page=page;
	}
	
	public String returnPage(){
		return page;
	}
}
