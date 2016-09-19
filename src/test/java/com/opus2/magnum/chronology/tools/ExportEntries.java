package com.opus2.magnum.chronology.tools;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class ExportEntries {
	@Steps
	ChronologyToolsSteps tool;
	
	@When("user open and selects Export_Entries_As_PDF option")
	public void whenUserOpenAndSelectsExportEntriesAsPDFOption(){
		tool.selectOption(ChronologyTools.EXPORT_AS_PDF);
	}
	@Then("Chronology_Entries are display on a PDF_File")
	public void thenChronologyEntriesAredisplayOnAPDFFile(){
	    Util.pause(5);
		assertThat(tool.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("user open and selects Export_Entries_As_PDF_With_Documents option")
	public void whenUserOpenAndSelectsExportEntriesAsPDFWithDocumentsOption(){
		tool.selectOption(ChronologyTools.EXPORT_AS_PDF_WITH_DOC);
	}
	@Then("Chronology_Entries are downloaded on a PDF_File with Documents")
	public void thenChronologyEntriesAreDownloadedOnAPDFFileWithDocuments(){
        Util.pause(5);
		assertThat(tool.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("user open and selects Export_Entries_As_CSV option")
	public void whenUserOpenAndSelectsExportEntriesAsCSVOption(){
		tool.selectOption(ChronologyTools.EXPORT_AS_CSV);
	}
	@Then("Chronology_Entries are are downloaded as CSV_File")
	public void thenChronologyEntriesAreDownloadedAsCSVFile(){
        Util.pause(5);
		assertThat(tool.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("user open and selects Export_Entries_As_DOCX option")
	public void whenUserOpenAndSelectsExportEntriesAsDOCXOption(){
		tool.selectOption(ChronologyTools.EXPORT_AS_DOCX);
	}
	@Then("Chronology_Entries are are downloaded as DOCX_File")
	public void thenChronologyEntriesAreDownloadedAsDOCXFile(){
        Util.pause(5);
		assertThat(tool.assertDIP().equals("TDIP")).isTrue();
	}
}
