package com.opus2.util.components.dialogs;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.WebElement;

import com.opus2.util.components.Component;



public abstract class Dialog extends Component {
	@FindBys({@FindBy(className="dialogHead"),@FindBy(className="dialogClose"),@FindBy(tagName="button")})
	private WebElement xCloseBtn;
	public Dialog(WebElement me) {
		super(me);
	}
	public Dialog closeFromXButton(){
		xCloseBtn.click();
		return this;
	}
	public abstract Dialog closeByDefaultCloseBtn();
}
