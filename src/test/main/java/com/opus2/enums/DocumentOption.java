package com.opus2.enums;

public enum DocumentOption {

	Access("Access"),
	AddTo("AddTo"),
	Autolink("Autolink"),
	BulkDocReplace("Bulk doc replace"),
	CreateFolder("Create Folder"),
	ConfigureStamps("Configure Stamps"),
	Copy("Copy"),
	Delete("Delete"),
	DeletePages("Delete Pages"),
    EnableDisableExport("Enable/Disable Export"),
    Export("Export"),
    ExportCSV("Export CSV"),
    FolderColor("Folder Color"),
    ImportCSV("Import CSV"),
    ImportNotes("Import Notes"),
    Insert("Insert"),
    Move("Move"),
    Properties("Properties"),
    RelatedDocuments("Related Documents"),
    Rename("Rename"),
    ReOrder("Reorder"),
    Replace("Replace"),
    ReplaceNative("Replace Native"),
    Rotate("Rotate"),
    SortBy("Sort by"),
    TagFolder("Tag Folder");
    
    private String option;
    
    private DocumentOption(String option){
    	this.option = option;
    }
    
    public String returnOption(){
    	return option;
    }
}       
