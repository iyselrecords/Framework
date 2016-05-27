package com.opus2.enums;

public enum CustomFieldType {
	 Text("Text"),
	 ExtendedText("Extended text"),
	 Date("Date"),
	 Number("Number"),
	 Document("Document");
	 
	 private String type;
	 
	 private CustomFieldType(String type){
		 this.type = type;
	 } 
	 
	 public String enumField(){
		 return type;
	 }
}
