package com.opus2.util.panels;

import org.openqa.selenium.By;

import com.opus2.util.panels.impl.PanelImpl;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;
@ImplementedBy(PanelImpl.class)
public interface Panel extends WidgetObject {

  void waitForPageAction();
  
  
}
