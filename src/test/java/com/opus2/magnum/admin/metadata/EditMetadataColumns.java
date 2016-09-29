package com.opus2.magnum.admin.metadata;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class EditMetadataColumns {
    @Steps
    AdminMetadataSteps user;
    private String Column;
    
    @Given("$column column is visible on MataData_Columns Section")
    public void givenExhibitColumnIsVisibleOnMetadataColumnsSection(String column){
        Column = column;
        assertThat(user.assertDIP().equals("TDIP")).isTrue();
    }
    
    @When("user clicks Edit to open Custom_Fields_Dialog")
    public void whenUserClicksEditToOpenCustomFieldsDialog(){
        user.editColumn(Column);
    }
    
    @When("check Show_In_Chronology_Preview checkout")
    public void andCheckShowInChronologyPreviewCheckout(){
        user.checkChronologyToPreview();
    }
    
    @When("apply settings")
    public void andApplySettings(){
        user.apply();
    }
    
    @Then("$column Metadata is selected")
    public void thenExhibitMetadataIsSelected(String column){
        assertThat(user.assertDIP().equals("TDIP")).isTrue();     
    }
}
