/**
 * 
 */
package com.opus2.util.components;

import net.serenitybdd.core.annotations.ImplementedBy;

import com.opus2.util.components.impl.TabsImpl;

@ImplementedBy(TabsImpl.class)
public interface Tabs extends Button {
	
}
