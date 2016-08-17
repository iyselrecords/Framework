package com.opus2.magnum.documents.addToMenu;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenAddToMenuDocumentsPage{
	@Steps
	AddToMenuSteps add2Menu;

	@Given("the Add_To_Option is visible in the Right_Click_Menu")
	public void givenTheAdd_ToOptionIsVisible(){
		assertThat(add2Menu.option().isDisplayed()).isTrue();
	}
	
	@When("the user hovers the pointer over the Add_To_Option")
	public void whenTheUserHoversThePointerOverTheAdd_ToOption(){
		add2Menu.mouseOverOption();
	}
	
	@Then("the Add_To_Menu must open")
	public void thenTheAdd_To_MenuMustOpen(){
		assertThat(add2Menu.subMenu().equals("block")).isTrue();		
	}
}