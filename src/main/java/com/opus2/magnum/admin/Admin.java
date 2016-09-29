package com.opus2.magnum.admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;

public class Admin extends Page {
    private WebElement element = null;
    
    public WebElement sideMenu(String option) {
        List <WebElement> menus = this.getElementByClass("mainmenu")
            .findElements(By.className("menuitem"));
        for(WebElement menu : menus){
            if(menu.getText().equals(option)){
                element = menu;
                break;
            }
        }
        return element;
    }
    
    public void selectMenu() {
        element.click();
    }
}
