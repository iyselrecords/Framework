package com.opus2.magnum.chronology.exportmanager;

import net.thucydides.core.annotations.Step;

public class ExportManagerSteps {
	ExportManager exp;

	@Step("")
	public void manager() {
		exp.manager();
	}

	public String getCurrentUrl() {
		return exp.getCurrentUrl();
	}
	
}
