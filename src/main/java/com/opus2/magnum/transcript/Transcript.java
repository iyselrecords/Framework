package com.opus2.magnum.transcript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.Util;

public class Transcript extends Page {
		
	public void next() {
        WebElement button = this.getElementByClass("next-btn-div")
            .findElements(By.tagName("button")).get(0);
        button.click();
        Util.pause(1);
        button.click();
    }
	
	public void dropdownPage(String pageNum) {
        WebElement button = this.getElementByClass("component");
        button.click();
        
        Util.pause(3);
        
        List <WebElement> lists = this.getElementByClass("menu").findElements(By.tagName("div")).get(0)
            .findElements(By.tagName("div"));
        for (WebElement option : lists){
            if(option.getText().equals(pageNum)){
                option.click();
                break;
            }
        }
        Util.pause(1);
    }

	public void previous() {
        WebElement button = this.getElement("preview-prev-btn");
        button.click();
        Util.pause(1);
        button.click();
    }

    public void findTranscript(String trans) {
        WebElement input = this.getElement("docctrls")
            .findElements(By.tagName("input")).get(0);
        input.sendKeys(trans);
    }
    
    public String getTranscript(){
        WebElement  result = this.getElementByClass("findhighlight");
        return result.getText();
    }
}
