package com.opus2.magnum.documents.view;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

public class HighlightTextOnDoucumentView {
    @Steps
    DocumentViewSteps view;
    
    @Given("user is present on Document_View page")
    public void givenTheUserIsOnDocumentViewPage(){
        assertThat(view.viewUrl().equals(Util.getDriver().getCurrentUrl())).isTrue();
    }
    
    @When("user highlight Document_Text for $entry")
    public void whenUserHighlightDocumentText(String entry){
        view.highlightText(entry);
    }
    
    @Then("the Notepad_Annotation_Dialog should be visible")
    public void thenTheNotepad_Annotation_DialogShouldBeVisible(){
        assertThat(view.dialog().equals("block")).isTrue();
    }
}
