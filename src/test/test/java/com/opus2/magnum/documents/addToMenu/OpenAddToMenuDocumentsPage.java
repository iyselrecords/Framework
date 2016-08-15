package com.opus2.magnum.documents.addToMenu;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenAddToMenuDocumentsPage{
	@Steps
	AddToMenuSteps a2M;

	@Given("the Add_To_Option is visible in the Right_Click_Menu")
	public void givenTheAdd_ToOptionIsVisible(){
		assertThat(a2M.option().isDisplayed()).isTrue();
	}
	
	@When("the user hovers the pointer over the Add_To_Option")
	public void whenTheUserHoversThePointerOverTheAdd_ToOption(){
		a2M.mouseOverOption();
	}
	
	@Then("the Add_To_Menu must open")
	public void thenTheAdd_To_MenuMustOpen(){
		assertThat(a2M.subMenu().isDisplayed()).isTrue();		
	}
}