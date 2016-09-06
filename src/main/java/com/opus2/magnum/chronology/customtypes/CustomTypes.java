package com.opus2.magnum.chronology.customtypes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Dialog;

public class CustomTypes extends Page {

	private static final String CUSTOM_TYPES_DIALOG = "Custom Types";
	public static final String CUSTOM_TYPE = "TGIF";
	private static final String SAVE_A_CUSTOM_DIALOG = "Save a Custom Type";
	private static final String SAVE_A_CUSTOM_OK = "name-dialog_OK";
	public static final String UPDATE_CUSTOM_TYPES = "ONIM";
	private static final String MY_TYPE = "SearchType";	
	private Dialog dialog;
	
	
	public String dialog() {
		return dialog.dialog(CUSTOM_TYPES_DIALOG).getCssValue("display");
	}
	
	public void newCustomType(){
		dialog.input(SAVE_A_CUSTOM_DIALOG, CUSTOM_TYPE);
	}
	
	public void save(){
		this.getElement(SAVE_A_CUSTOM_OK).click();
		
	}
	
	public void addCustomType() {
		dialog.button("Add").click();
		Util.pause(1);
		dialog.input(SAVE_A_CUSTOM_DIALOG, MY_TYPE);
		this.getElement(SAVE_A_CUSTOM_OK).click();
	}

	public void selectCustomType(String type){
		dialog.select(type);
		Util.pause(1);
	}

	public void rename() {
		dialog.button("Rename").click();
	}
	
	public void update(){
		dialog.input("Rename Custom Type as", UPDATE_CUSTOM_TYPES);
	}

	public void search() {
		Util.pause(2);
		dialog.find2("Custom Types", MY_TYPE);
		selectList(MY_TYPE);
		Util.pause(2);
	}
	public void selectList(String type){
		dialog.select(type);
		Util.pause(1);
		deleteCustomType();
	}

	private void deleteCustomType() {
		dialog.button("Delete").click();
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id("OK"));
		getElement("OK").click();
	}
}
