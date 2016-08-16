package com.opus2.pages;

import com.opus2.core.Configuration;
import com.opus2.util.Page;

public class AdminUsersPage extends Page {

	@Override
	public Page view() {
		Configuration.getInstance();
    this.openAt(Configuration.adminUsersUrl);
		return this;
	}

}
