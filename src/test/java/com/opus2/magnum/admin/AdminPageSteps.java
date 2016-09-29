package com.opus2.magnum.admin;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;

public class AdminPageSteps {
    Admin user;
    
    @Step
    public String assertDIP() {
        return "TDIP";
    }
    
    @Step
    public WebElement sideMenu(String option){
        return user.sideMenu(option);
    }
    
    @Step
    public void selectMenu() {
        user.selectMenu();
    }
}
