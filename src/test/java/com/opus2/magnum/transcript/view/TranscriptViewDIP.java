package com.opus2.magnum.transcript.view;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class TranscriptViewDIP {
	@Steps
	TranscriptViewSteps user;
		
	@When("user select and clicks $transcript Transcript")
    public void whenUserSelectAndClicksTranscriptTitle(String transcript){
		user.previewTranscript(transcript);
    }		
	@Then("Transcript is loaded on Preview_Pane")
    public void thenTranscriptIsLoadedOnPreviewPane(){
		assertThat(user.assertDIP().equals("TDIP")).isTrue();
		Util.pause(3);
    }
	
	@Given("Transcript is loaded on Preview_Pane")
    public void givenTranscriptIsLoadedOnPreviewPane(){
		assertThat(user.assertDIP().equals("TDIP")).isTrue();
    }	
	@When("user clicks on Preview_Pane")
    public void whenUserClicksOnPreviewPane(){
		user.viewTranscript();
    }		
	@Then("Transcript opens in a new tab with Detailed_Functionality")
    public void thenTranscriptOpensInANewTabWithDetailedFunctionality(){
		assertThat(user.assertDIP().equals("TDIP")).isTrue();
		Util.pause(3);
    }
	
	@Given("user is present on TranscriptView_Page")
    public void givenUserIsPresentOnTranscriptViewPage(){
		assertThat(user.assertDIP().equals("TDIP")).isTrue();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_01")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_01(){
		user.transcriptView01();
    }		
	@When("user mapping in progess on TRANSCRIPTVIEW_02")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_02(){
		user.transcriptView02();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_03")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_03(){
		user.transcriptView03();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_04")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_04(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_05")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_05(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_06")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_06(){
		user.transcriptView06();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_07")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_07(){
		user.transcriptView07();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_08")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_08(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_09")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_09(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_10")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_10(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_11")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_11(){
		user.transcriptView11();
    }		
	@When("user mapping in progess on TRANSCRIPTVIEW_12")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_12(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_13")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_13(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_14")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_14(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_15")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_15(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_16")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_16(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_17")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_17(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_18")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_18(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_19")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_19(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_20")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_20(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_21")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_21(){
		user.transcriptView01();
    }		
	@When("user mapping in progess on TRANSCRIPTVIEW_22")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_22(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_23")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_23(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_24")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_24(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_25")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_25(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_26")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_26(){
		user.transcriptView01();
    }
	@When("user mapping in progess on TRANSCRIPTVIEW_27")
    public void whenUserMappingInProgessOnTRANSCRIPTVIEW_27(){
		user.transcriptView01();
    }
}
