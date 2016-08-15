package com.opus2.magnum.documents.addToMenu;


import org.openqa.selenium.WebElement;
import com.opus2.dialog.addtomenu.AddToMenu;
import net.thucydides.core.annotations.Step;

public class AddToMenuSteps {
	AddToMenu add2Menu;
	
	@Step("option is visible")
	public WebElement option() {
		return add2Menu.hasOption();
	}
	
	@Step("mouse over option")
	public void mouseOverOption() {
		add2Menu.mouseOverOption();
	}
	
	@Step("submenu is visible")
	public WebElement subMenu() {
		return add2Menu.subMenu();
	}
}
