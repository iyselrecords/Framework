package com.opus2.pages.login;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.opus2.core.Configuration;
import com.opus2.util.Page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;

public class MemorableWordPage extends Page {
  @FindBy(id="formMemWord")
  WebElement form;
  @FindBy(id="submitbtn")
  WebElement submitBtn;


  @Override
  public Page view() {
    if(!this.getDriver().getCurrentUrl().startsWith(Configuration.memorableWordUrl)){
      this.openAt(Configuration.memorableWordUrl);
    }
    return this;
  }
  public int getMemorableWordIndexAt(int index){
    List <WebElement> characters = form.findElements(By.tagName("tr"));
    int length = characters.size();
    for (int i = 0; i < length; i++)
    {
      if (i == index){
        String label = characters.get(i).findElements(By.className("white")).get(0).getText();
        return Integer.parseInt(label.substring(6, 7))-1;
      }
    }
    return -1;
  }
  public void fillMemorableWordAt(int index , String character){
    WebElement input = form.findElement(By.id("eid"+(index+1)));
    input.sendKeys(character);
  }

  public void submitForm() {
    submitBtn.click();
  }

}
