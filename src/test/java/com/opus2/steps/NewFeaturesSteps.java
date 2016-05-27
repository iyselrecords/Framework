package com.opus2.steps;



import org.jbehave.core.annotations.When;

import com.opus2.enums.Pages;
import com.opus2.pages.Transcripts;
import com.opus2.util.Util;

import net.serenitybdd.jbehave.SerenityStories;

public class NewFeaturesSteps extends SerenityStories{
	Transcripts transcript;
	Util util;
	
	@When("I'm designing")
	public void whenImDesigning(){
		util.goTo(Pages.Transcripts);		
	}
	@When("test again")
	public void testAgain(){	
		transcript.select("Day 2");
		util.wait(2);
	}
	@When("test again2")
	public void testAgain2(){	
		transcript.clickPreview("Day 2");
		//util.wait(2);
	}
	@When("test again3")
	public void testAgain3(){	
		util.switchToCurrentWindow(1);
		//util.wait(3);
	}
	@When("test again4")
	public void testAgain4(){	
		util.wait(5);
		util.highlight(1,10);
	}
	
	
	
	
}
