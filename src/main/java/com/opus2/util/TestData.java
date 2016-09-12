package com.opus2.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestData {
	private static final String TEST_DATA =  "/data/pages.properties";
	public static Properties DOCUMENTS_;
	public static Properties TRANSCRIPTS_;
	public static Properties CHRONOLOGY_;
	public static Properties NOTES_;
	public static Properties SEARCH_;
	public static Properties ADMIN_;
	public static Properties DOCUMENTSVIEW_;
	public static Properties TRANSCRIPTSVIEW_;
	
	public void load(){
		Properties file = null;	
		try{
			file =  new Properties();
			file.load(this.getClass().getResourceAsStream(TEST_DATA));
			String [] pages =  file.getProperty("pages").split(",");
			getData(pages);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void getData(String[] pages) throws IOException {
		for(String page : pages){
			if(page.endsWith("documents")){
				DOCUMENTS_ = new Properties();
				DOCUMENTS_.load(this.getClass().getResourceAsStream("/data/" + page + ".properties"));
			}else if(page.endsWith("transcripts")){
				TRANSCRIPTS_ = new Properties();
				TRANSCRIPTS_.load(this.getClass().getResourceAsStream("/data/" + page + ".properties"));
			}else if(page.endsWith("chronology")){
				CHRONOLOGY_ = new Properties();
				CHRONOLOGY_.load(this.getClass().getResourceAsStream("/data/" + page + ".properties"));
			}else if(page.endsWith("notes")){
				NOTES_ = new Properties();
				NOTES_.load(this.getClass().getResourceAsStream("/data/" + page + ".properties"));
			}else if(page.endsWith("search")){
				SEARCH_ = new Properties();
				SEARCH_.load(this.getClass().getResourceAsStream("/data/" + page + ".properties"));
			}else if(page.endsWith("admin")){
				ADMIN_ = new Properties();
				ADMIN_.load(this.getClass().getResourceAsStream("/data/" + page + ".properties"));
			}else if(page.endsWith("documentsview")){
				DOCUMENTSVIEW_ = new Properties();
				DOCUMENTSVIEW_.load(this.getClass().getResourceAsStream("/data/" + page + ".properties"));
			}else if(page.endsWith("transcriptsview")){
				TRANSCRIPTSVIEW_ = new Properties();
				TRANSCRIPTSVIEW_.load(this.getClass().getResourceAsStream("/data/" + page + ".properties"));
			}
		}
	}
}
