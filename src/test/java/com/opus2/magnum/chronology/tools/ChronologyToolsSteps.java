package com.opus2.magnum.chronology.tools;

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
        tool.OK();
    }

    @Step
    public String dialog() {
        return tool.dialog();       
    }
    
    @Step()
    public void createLink() {
        tool.createLink();
    }
    
    @Step()
    public String assertDIP(){
        return "TDIP";
    }
}
