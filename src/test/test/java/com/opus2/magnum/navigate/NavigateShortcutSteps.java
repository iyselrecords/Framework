package com.opus2.magnum.navigate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Step;

public class NavigateShortcutSteps {
  
  @Step("shorcut image is visible")
  public WebElement thumbnail(String shortcut_Title) {
      WebElement sc = null;
      List <WebElement> lists = Util.getDriver().findElements(By.className("note-shortcut"));
      for(WebElement list:lists){
          if(list.findElements(By.tagName("p")).get(0).getText().equals(shortcut_Title)){
              sc = list.findElements(By.tagName("img")).get(0);
              break;
          }
      }
      return sc;
  }

  @Step
  public void clickShortcut(String sc) {
      thumbnail(sc)
        .click();
  }
}
