package com.opus2.pages;

import com.opus2.core.configuration.Configuration;
import com.opus2.util.Page;

public class AdminUsersPage extends Page {

	public AdminUsersPage() {
		
	}

	@Override
	public Page view() {
		Configuration.getInstance();
    this.openAt(Configuration.adminUsersUrl);
		return this;
	}

}
