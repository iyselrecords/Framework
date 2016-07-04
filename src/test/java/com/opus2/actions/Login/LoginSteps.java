package com.opus2.actions.Login;

import com.opus2.pages.LoginPage;
import com.opus2.util.User;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
	LoginPage page = new LoginPage();
	@Step
	public void openLoginPage(){
		page.view();
	}
	@Step
	public void loginAs(User user){
		page.loginAsUser(user);
	}
}
