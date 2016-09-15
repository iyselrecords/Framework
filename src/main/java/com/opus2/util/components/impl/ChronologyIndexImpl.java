package com.opus2.util.components.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.TestData;
import com.opus2.util.Util;
import com.opus2.util.components.ChronologyIndex;

public class ChronologyIndexImpl extends ComponentImpl implements ChronologyIndex{
  public static final String NEW_ENTRY = TestData.CHRONOLOGY_.getProperty("entryDescription");
  
  public ChronologyIndexImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
      super(driver, locator, implicitTimeoutInMilliseconds);
  }

  @Override
  public WebElement getIndex() {
    WebElement index = null;
    
    List <WebElement> rows = Util.getDriver().findElement(By.className("chronmain"))
        .findElements(By.tagName("tbody")).get(0)
            .findElements(By.className("factfirst"));
    for(WebElement row : rows){
        List <WebElement> entries = row.findElements(By.className("auc2"));
        for(WebElement entry : entries){
            if(entry.findElement(By.tagName("span")).getText().equals(NEW_ENTRY)){
              index = row;
                break;
            }
        }
        break;
    }
    return index;
  }
}
