package com.opus2.magnum.chronology.tools;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class ExportEntries {
	@Steps
	ChronologyToolsSteps tool;
	
	@When("user open and selects Export_Entries_As_PDF option")
	public void whenUserOpenAndSelectsExportEntriesAsPDFOption(){
		tool.selectOption(ChronologyTools.EXPORT_AS_PDF);
	}
	
	@Then("all Chronology_Entries are display on a PDF_File")
	public void thenAllChronologyEntriesAredisplayOnAPDFFile(){
		assertThat(tool.assertDIP().equals("TDIP")).isTrue();
	}
}
