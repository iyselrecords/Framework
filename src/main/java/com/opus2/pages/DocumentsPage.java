package com.opus2.pages;

import com.opus2.core.configuration.Configuration;
import com.opus2.util.Page;
import com.opus2.util.Util;

public class DocumentsPage extends Page {

  private String id;
  public DocumentsPage(String id){
    this.id = id;
  }
  @Override
  public Page view() {
    StringBuilder strBuilder = new StringBuilder();
    strBuilder.append(Configuration.documentsUrl);
    strBuilder.append("?");
    strBuilder.append(Util.getWorkspaceUrlToken(this.id));
    this.openAt(strBuilder.toString());
    return this;
  }

}
