package com.opus2.util.components;

import net.serenitybdd.core.annotations.ImplementedBy;

import com.opus2.util.components.impl.LogoutImpl;

@ImplementedBy(LogoutImpl.class)
public interface Logout extends Button{
	void accceptAlert();
}
