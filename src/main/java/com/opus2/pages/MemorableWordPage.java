package com.opus2.pages;

import org.openqa.selenium.WebDriver;

import com.opus2.core.configuration.Configuration;
import com.opus2.util.Page;

public class MemorableWordPage extends Page {

	public MemorableWordPage() {
	
	}

	@Override
	public Page view() {
		this.openAt(Configuration.getInstance().memorableWordUrl);
		return this;
	}

}
