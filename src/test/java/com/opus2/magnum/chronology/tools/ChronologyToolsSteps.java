package com.opus2.magnum.chronology.tools;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Step;

public class ChronologyToolsSteps {
	ChronologyTools tool;
	
	@Step()
	public void button() {
		tool.button();
	}

	@Step()
	public String dropdown() {
		return tool.dropdown();
	}

	@Step()
	public void selectOption(String option) {
		tool.selectOption(option);
	}

	@Step()
	public void OK() {
	    Util.pause(1);
		tool.OK();
	}
	
	@Step()
	public String assertDIP(){
		return "TDIP";
	}
}
