package com.opus2.enums;

public enum ChronologyOption {

	Fact("Fact"),
	Meeting("Meeting"),
	Event("Event"),
	Letter("Letter"),
	Email("Email"),
	NoType("no type"),
	Disputed("Disputed"),
	Undisputed("Undisputed"),
	NotSet("Not set"),
	On("On"),
	Before("Before"),
	After("After"),
	Range("Range"),	
	HAST("HAST (-10)"),
	AKST("AKST (-9)"),
	PST("PST (-8)"),
	MST("MST (-7)"),
	CST("CST (-6)"),
	EST("EST (-5)"),
	GMT("GMT (0)"),
	CET("CET (+1)"),
	EET("EET (+2)"),
	FET("FET (+3)"),
	SGT("SGT (+8)"),
	HKT("HKT (+9)"), 
	CustomType("CustomType");
		
	private String option;
	
	private ChronologyOption(String option){
		this.option = option;
	}
	
	public String returnOption(){
		return option;
	}
}
