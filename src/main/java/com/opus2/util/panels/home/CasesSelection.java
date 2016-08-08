package com.opus2.util.panels.home;

import com.opus2.util.panels.Panel;
import com.opus2.util.panels.impl.CaseSelectionImpl;

import java.util.List;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
@ImplementedBy(CaseSelectionImpl.class)
public interface CasesSelection extends Panel {
  List<WebElement> findCase(String text);

  List<WebElementFacade> getVisibleWorkspaces();

  void selectWorkspace(String wsid);
  
  boolean hasWorkspace(String wsid);
}
