package com.opus2.enums;

public enum ToolsOption {
	BulkOrganize("Bulk Organize"),
	ExportManager("Export Manager"),
	ImportMetadata("Import Metadata"),
	UploadManager("Upload Manager"),
	VideoExports("Video Exports"),
	ImportCSV("Import CSV"),
	ExportCSV("Export CSV");
	
	private String tool;
	
	private ToolsOption(String tool){
		this.tool = tool;
	}
	
	public String returnToolOption(){
		return tool;
	}
}
