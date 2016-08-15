package com.opus2.magnum.documents.addToMenu;


import org.openqa.selenium.WebElement;
import com.opus2.dialog.addtomenu.AddToMenu;
import net.thucydides.core.annotations.Step;

public class AddToMenuSteps {
	AddToMenu menu;
		
	@Step
	public WebElement option() {
		return menu.hasOption();
	}
	
	@Step
	public void mouseOverOption() {
		menu.mouseOverOption();
	}
	
	@Step
	public WebElement subMenu() {
		return menu.subMenu();
	}
}
