package com.opus2.magnum.adminuser.settings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Dropdown;

public class SettingsOptions extends Page {
	private static final String SETTINGS_BUTTON = "maindiv_Settings";
	private static final String DISABLE_ACCOUNT = "Disable Account";
	private static final String ENABLE_ACCOUNT = "Enable Account";
	private static final String DELETE_ACCOUNT = "Delete Account";
	private static final String ENABLE_2FA = "Enable 2FA";
	private static final String DISABLE_2FA = "Disable 2FA";
	private static final String ENABLE_MEMORABLE_WORD = "Enable Memorable Word";
	private static final String DISABLE_MEMORABLE_WORD = "Disable Memorable Word";
	private static final String AUTHENTICATE_WITH_MAGNUM = "Authenticate with Magnum";
	private static final String AUTHENTICATE_WITH_LDAP = "Authenticate with LDAP";
	private static final String CONFIRM_ALERT = "confirm";
	public static final String MAGNUM = "Magnum";
	public static final String LDAP = "LDAP";
	
	
	private Dropdown option;
	
	public WebElement settingsDropdownButton() {
		return this.getElement(SETTINGS_BUTTON);
	}

	public void openDropdown() {
		settingsDropdownButton().click();
	}

	public String settingsDropdown() {
		return option.dropdownPanel(1).getCssValue("display");
	}

	public void disableAccount() {
		option.getOption(1, DISABLE_ACCOUNT).click();
	}

	public void enableAccount() {
		option.getOption(1, ENABLE_ACCOUNT).click();
	}
	
	public void deleteAccount() {
		option.getOption(1, DELETE_ACCOUNT).click();
	}
	
	public void enable2FA() {
		option.getOption(1, ENABLE_2FA).click();
	}
	
	public void disable2FA() {
		option.getOption(1, DISABLE_2FA).click();
	}
	
	public void enableMemorableWord() {
		option.getOption(1, ENABLE_MEMORABLE_WORD).click();
	}
	
	public void disableMemorableWord() {
		option.getOption(1, DISABLE_MEMORABLE_WORD).click();
	}
	
	public void authenticateWithMagnum() {
		option.getOption(1, AUTHENTICATE_WITH_MAGNUM).click();
	}
	
	public void authenticateWithLDAP() {
		option.getOption(1, AUTHENTICATE_WITH_LDAP).click();
	}

	public String confirmAlert() {
		return this.getElementByClass(CONFIRM_ALERT)
			.getCssValue("display");
	}
	
	public String authentication() {
		WebElement auth = null;		
		WebElement a = this.getElementByClass("mainitems")
			.findElements(By.className("users")).get(0);
		
		List <WebElement> rows = a.findElements(By.tagName("tbody")).get(0)
			.findElements(By.className("auc3"));
		
		for(WebElement row : rows){
			if(!row.findElements(By.tagName("span")).get(0).getText().isEmpty()){
				auth = row.findElements(By.tagName("span")).get(0);
			}
		}
		return auth.getText();
	}
	
}
