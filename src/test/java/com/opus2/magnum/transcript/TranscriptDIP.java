package com.opus2.magnum.transcript;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class TranscriptDIP {
	@Steps
	TranscriptSteps user;
	
	@Given("user is present on Transcript_Page")
    public void givenUserIsPresentOnTranscriptPage(){
		assertThat(user.assertDIP().equals("TDIP")).isTrue();
    }
	
	@When("user mapping in progess on TRANSCRIPT_01")
    public void whenUserMappingInProgessOnTRANSCRIPT_01(){
		user.transcript01();
    }		
	@When("user mapping in progess on TRANSCRIPT_02")
    public void whenUserMappingInProgessOnTRANSCRIPT_02(){
		user.transcript01();
    }
	@When("user mapping in progess on TRANSCRIPT_03")
    public void whenUserMappingInProgessOnTRANSCRIPT_03(){
		user.transcript01();
    }
	@When("user mapping in progess on TRANSCRIPT_04")
    public void whenUserMappingInProgessOnTRANSCRIPT_04(){
		user.transcript01();
    }
	@When("user mapping in progess on TRANSCRIPT_05")
    public void whenUserMappingInProgessOnTRANSCRIPT_05(){
		user.transcript01();
    }
	@When("user mapping in progess on TRANSCRIPT_06 $trans")
    public void whenUserMappingInProgessOnTRANSCRIPT_06(String trans){
		user.transcriptDIP(trans);
		assertThat(user.getTranscript().equals(trans.toUpperCase())).isTrue();
    }
	@When("user mapping in progess on TRANSCRIPT_07")
    public void whenUserMappingInProgessOnTRANSCRIPT_07(){
		user.transcript01();
    }
}
