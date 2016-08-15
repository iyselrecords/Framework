package com.opus2.util.panels;

import com.opus2.util.panels.impl.SearchImpl;

import net.serenitybdd.core.annotations.ImplementedBy;

@ImplementedBy(SearchImpl.class)
public interface Search extends Panel {
  void find(String key);
  void resetSearch();
}
