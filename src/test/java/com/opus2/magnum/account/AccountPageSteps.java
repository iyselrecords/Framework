package com.opus2.magnum.account;

import net.thucydides.core.annotations.Step;

public class AccountPageSteps {
	AccountPage acc;
	
	@Step()
	public String assertDIP(){
		return "TDIP";
	}

	@Step()
	public void account01() {
		acc.account01();
	}
	
	@Step()
	public void account02() {
		acc.account02();
	}
	
	@Step()
	public void account03() {
		acc.account03();
	}
	
	@Step()
	public void account04() {
		acc.account04();
	}
	
	@Step()
	public void account05() {
		acc.account05();
	}
	
	@Step()
	public void account06() {
		acc.account06();
	}
	
	@Step()
	public void account07() {
		acc.account07();
	}

	@Step()
	public void accountPage() {
		acc.accountPage();
	}
}
