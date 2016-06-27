package com.opus2.enums;

public enum UserActivity {
	_30days("30 days"),
	_7days("7 days"),
	_24hours("24 hours"),
	_3hours("3 hours"),
	_30mins("30 mins");
	
	private String activity;
	
	private UserActivity(String act){
		this.activity = act;
	}
	
	public String returnActivity(){
		return activity;
	}
	
}
