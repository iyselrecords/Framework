package com.opus2.magnum.account;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class AccountPageDIP {
	@Steps
	AccountPageSteps dip;
	
	@Given("user is present on Account_Page")
    public void givenUserIsPresentOnAccountPage(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();
    }
	
	@When("user mapping in progess on ACCOUNT_01")
    public void whenUserMappingInProgessOnACCOUNT01(){
		dip.account01();
    }
	
	@When("user mapping in progess on ACCOUNT_02")
    public void whenUserMappingInProgessOnACCOUNT02(){
		dip.account02();
    }
	
	@When("user mapping in progess on ACCOUNT_03")
    public void whenUserMappingInProgessOnACCOUNT03(){
		dip.account03();
    }
	
	@When("user mapping in progess on ACCOUNT_04")
    public void whenUserMappingInProgessOnACCOUNT04(){
		dip.account04();
    }
	
	@When("user mapping in progess on ACCOUNT_05")
    public void whenUserMappingInProgessOnACCOUNT05(){
		dip.account05();
    }
	
	@When("user mapping in progess on ACCOUNT_06")
    public void whenUserMappingInProgessOnACCOUNT06(){
		dip.account06();
    }
	
	@When("user mapping in progess on ACCOUNT_07")
    public void whenUserMappingInProgessOnACCOUNT07(){
		dip.account07();

    }

    @Then("action should be verify")
    public void thenActionShouldBeVerify(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue();
    }
}
