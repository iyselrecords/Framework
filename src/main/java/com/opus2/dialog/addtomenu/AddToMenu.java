package com.opus2.dialog.addtomenu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class AddToMenu extends Page {
	private RightClickMenu option;
	private Dialog dialog;
	
	private static final String ADD_TO = "Add to...";
	private static final String SUBMENU = "submenu";
	

	public WebElement hasOption() {
		return option.hasOption(ADD_TO);
	}
	
	public void mouseOverOption() {
		option.mouseOverOption(hasOption());
	}
	
	public WebElement subMenu() {
		return dialog.hasDialog(SUBMENU);
	}	
}
