package com.opus2.enums;

public enum MetadataOption {
	Left("Left"),
	Right("Right"),
	Hide("Hide"),
	Center("Center");
	
	private String option;
    
    private MetadataOption(String option){
    	this.option = option;
    }
    
    public String returnOption(){
    	return option;
    }
}
