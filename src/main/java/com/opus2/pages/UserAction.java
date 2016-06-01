package com.opus2.pages;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.opus2.enums.Pages;
import com.opus2.enums.ToolsOption;
import com.opus2.enums.UserWorkspaceOption;
import com.opus2.util.Constants;
import com.opus2.util.Util;

public class UserAction extends PageObject {
	
	public WebDriver driver = getDriver();
	public WebDriver browser;
	Util util;
	
	
	public void switchToCurrentWindow(int index) {
		util.wait(2);
		Set<String> AllWindowHandles = getDriver().getWindowHandles(); 
		String currentWindow = (String) AllWindowHandles.toArray()[index];
		getDriver().switchTo().window(currentWindow);
	}
		
	public void clickAction(String elementId){
		getDriver().findElement(By.id(elementId)).click();
		util.wait(0.5);
	}	
		
	public void clickAction(String topLevelId, String className, String element, String title){
		util.wait(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
				.findElements(By.className(className)).get(0);
		List<WebElement> buttons = topLevel.findElements(By.tagName(element));
		for(WebElement button : buttons){
			if((button.getAttribute("title").equalsIgnoreCase(title)) || (button.getText().equalsIgnoreCase(title))){
				button.click();
				break;
			}
		}
		util.wait(0.5);
	}
	
	public void clickAction(String topLevelId, String className, String element, int index ){
		util.wait(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
			.findElements(By.className(className)).get(0);
		topLevel.findElements(By.tagName(element))
			.get(index).click();
		util.wait(0.5);
	}
	
	public void clickAction(String topLevelId, String tagName, int index){
		util.wait(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId));
		topLevel.findElements(By.tagName(tagName))
		.get(index).click();
		util.wait(0.5);
	}
	
	public void clickAction(String topLevelId, String className, String elementId){
		util.wait(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
			.findElements(By.className(className)).get(0);
		topLevel.findElement(By.id(elementId)).click();
		util.wait(0.5);
	}

	public void clickAction(String topLevelId, String className){
		util.wait(0.5);
		getDriver().findElement(By.id(topLevelId))
			.findElements(By.className(className)).get(0).click();
		util.wait(0.5);
	}

	public void inputText(String elementId, String keysToSend) {	
		util.wait(0.5);
		WebElement element = getDriver().findElement(By.id(elementId));
		element.findElements(By.tagName("input")).get(0).clear();
		element.findElements(By.tagName("input")).get(0).sendKeys(keysToSend);
		util.wait(0.5);
	}
	public void inputText(String topLevelId, String keysToSend, int i) {
		WebElement element = getDriver().findElement(By.id(topLevelId));
		element.findElements(By.tagName("input")).get(i).clear();
		element.findElements(By.tagName("input")).get(i).sendKeys(keysToSend);
		util.wait(0.5);
	}
	public void inputTextClassName(String className, String keysToSend) {	
		util.wait(0.5);
		WebElement element = getDriver().findElements(By.className(className)).get(0);
		element.findElements(By.tagName("input")).get(0).clear();
		element.findElements(By.tagName("input")).get(0).sendKeys(keysToSend);
		util.wait(0.5);
	}
	public void clearText(String elementId) {	
		util.wait(0.5);
		WebElement element = getDriver().findElement(By.id(elementId));
		element.findElements(By.tagName("input")).get(0).clear();
	}
	public void inputText(String topLevelId, String className, String keysToSend) {	
		util.wait(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
				.findElements(By.className(className)).get(0);
		
		topLevel.findElements(By.tagName("input")).get(0).clear();
		topLevel.findElements(By.tagName("input")).get(0).sendKeys(keysToSend);
		util.wait(0.5);
	}
	public void inputTextArea(String elementId, String keysToSend) {	
		util.wait(0.5);
		WebElement element = getDriver().findElement(By.id(elementId));
		element.findElements(By.tagName("textarea")).get(0).clear();
		element.findElements(By.tagName("textarea")).get(0).sendKeys(keysToSend);
		util.wait(0.5);
	}
	public void clickActionByText(String elementId){
		getDriver().findElement(By.linkText(elementId)).click();
		util.wait(0.5);
	}
	public void closeDialog(String elementId){
		WebElement button = getDriver().findElement(By.id(elementId));
		button.findElements(By.tagName("button")).get(0).click();
	}
	
	public void closeDialog(String elementId, String header){
		WebElement topLevel = getDriver().findElement(By.id(elementId));
		List<WebElement> dialogs = topLevel.findElements(By.className("dialog"));
		
		for(WebElement dialog : dialogs){
			WebElement H2 = dialog.findElement(By.tagName("h2"));
			if(H2.getText().equalsIgnoreCase(header)){
				dialog.findElements(By.tagName("button")).get(0).click();
				break;
			}
		}	
	}
	
	public void closeDialog3(String elementId){
		WebElement button = getDriver().findElement(By.className(elementId));
		button.findElements(By.tagName("button")).get(0).click();
	}
	
	public void goTo(String text) {
			
		if(text.equalsIgnoreCase(Constants.Home)){
			clickAction(Constants.Home);
		}else if(text.equalsIgnoreCase(Constants.Documents)){
			clickAction(Constants.Documents);
		}else if(text.equalsIgnoreCase(Constants.Transcripts)){
			clickAction(Constants.Transcripts);
		}else if(text.equalsIgnoreCase(Constants.Chronology)){
			clickAction(Constants.Chronology);
		}else if(text.equalsIgnoreCase(Constants.Notes)){
			clickAction(Constants.Notes);
		}else if(text.equalsIgnoreCase(Constants.Search)){
			clickAction(Constants.Search);
		}else if(text.equalsIgnoreCase(Constants.Admin)){
			clickAction(Constants.Admin);
		}
	}
	
	public void goTo(Pages page) {
		
		switch(page){
			case Home:
				clickAction("logo");
				break;
			case Documents:
				clickAction("magnumDocuments");
				break;
			case Transcripts:
				clickAction("transcripts");
				break;
			case Chronology:
				clickAction("magnumChronology");
				break;
			case Notes:
				clickAction("magnumNotes");
				break;
			case Search:
				clickAction("search");
				break;
			case Admin:
				clickAction("magnumAdmin");
				break;	
		}
	}
	
	public void find(String parentElementId, String keysToSend){
		WebElement wrap = getDriver().findElement(By.id(parentElementId));
		wrap.findElements(By.tagName("input")).get(0).sendKeys(keysToSend);
	}
	
	public void findSearch(String elem, String doc) {
		WebElement topLevel = getDriver().findElement(By.id(elem));
		WebElement search = topLevel.findElement(By.className("searchComponent"));
		search.findElements(By.tagName("input")).get(0).clear();
		search.findElements(By.tagName("input")).get(0).sendKeys(doc);
		util.wait(1);
		search.findElements(By.tagName("button")).get(0).click();		
	}
	
	public void selectTag(String element) {
		WebElement wrap = getDriver().findElement(By.id(element));
		List<WebElement> rows = wrap.findElements(By.className("treepanelrow"));
		
		for(WebElement row : rows){
			if(row.getAttribute("style").equalsIgnoreCase("padding-left: 1px; display: block;")){
				row.click();
				break;
			}
		}
	}
	
	public void documentsWithoutTags() {
		WebElement wrap = getDriver().findElement(By.id("category-filter"));
		List<WebElement> rows = wrap.findElements(By.className("treepanelrow"));
		
		for(WebElement row : rows){
			WebElement span = row.findElements(By.className("itemText")).get(0);
			if(span.getText().equalsIgnoreCase("Documents without tags")){
				row.findElements(By.tagName("input")).get(0).click();
				return;
			}
		}
	}
	
	public void selectFolder(String file) {
		util.wait(1);
		WebElement wrap = getDriver().findElement(By.id("doc-chooser_doc-chooser"));		
		
		List<WebElement> folders = wrap.findElements(By.tagName("span"));
		for(WebElement folder:folders){
			if(folder.getText().equalsIgnoreCase(file)){
				folder.click();
				break;
			}
		}
	}
	
	public void selectDocOpenWindow(String file) {
		util.wait(5);
		WebElement wrap = getDriver().findElement(By.id("uploader_uploader"));
		WebElement input = wrap.findElements(By.tagName("input")).get(0);

		System.out.println("C:\\Users\\misele\\Desktop\\PN\\docs\\testData\\" + file + ".pdf");
		System.out.println(input.getAttribute("value"));
		
		//input.sendKeys("C:\\Users\\misele\\Desktop\\PN\\docs\\testData\\" + file + ".pdf");
		//input.sendKeys("C:\\Users\\misele\\UD\\" + file + ".pdf");
		util.wait(7);
	}
	
	public void reloadPage() {
		getDriver().navigate().refresh();
	}
	
	public void confirm(String elementId) {
		getDriver().findElement(By.id(elementId)).click();
	}
	
	public void selectOption(String option) {
		util.wait(0.4);
		WebElement sortWrap = getDriver().findElement(By.id("sort-order_sort-order"));

        List<WebElement> tables = sortWrap.findElements(By.tagName("table"));
        for (WebElement table : tables)
        {
            if (table.findElements(By.tagName("td")).get(1).getText().equalsIgnoreCase(option))
            {
                table.findElements(By.tagName("input")).get(0).click();
                break;
            }
        }
	}
	
	public void acceptAlert() {
		 util.wait(0.7);
		 getDriver().switchTo().alert().accept();
	}
	
	public void dismissAlert() {
		 util.wait(0.7);
		 getDriver().switchTo().alert().dismiss();
	}
	
	public  void xSpace(int num)
    {
        WebElement wrap = getDriver().findElement(By.id("reorder"));
        wrap.findElements(By.tagName("input")).get(0).clear();
        wrap.findElements(By.tagName("input")).get(0).sendKeys("7");
   }
	
	public void rotation(String num, int index) {
		WebElement wrap = getDriver().findElement(By.id("DOMadditions"));
		WebElement dropdown = wrap.findElements(By.tagName("select")).get(index);
        Select select = new Select(dropdown);
        
        int page  = Integer.parseInt(num);     
        select.selectByValue(String.valueOf(page -1));
	}
	
	public void rotation(String rotate) {
		WebElement wrap = getDriver().findElement(By.id("DOMadditions"));
		WebElement button = wrap.findElements(By.className(" sideComponent")).get(0).findElements(By.tagName("button")).get(0);
        button.click();
        
        WebElement optionWrap = getDriver().findElement(By.id("view-menu"));
        List<WebElement> options = optionWrap.findElements(By.className("element"));

        for (WebElement option : options)
        {
        	WebElement span = option.findElements(By.tagName("span")).get(0);
            if (span.getText().equalsIgnoreCase(rotate))
            {
                span.click();
                break;
            }
        }
	}
	
	public void confirmAction(String action){
		getDriver().findElement(By.id(action)).click();
		util.wait(1);
	}
	
	public void turnOnWait() {
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	public void turnOffWait() {
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);	
	}
	
	public void setCapabilities(int startIndex, int lastIndex) {
		WebElement topLevel = getDriver().findElement(By.id("settingsmain"))
				.findElements(By.className("floatleft")).get(0);
		
		List<WebElement> lists = topLevel.findElements(By.tagName("tr"));
		for(int i = startIndex; i < lastIndex; i++){
			lists.get(i).findElements(By.tagName("input")).get(0).click();
		}
	}
	
	/*
	 * Select from list and dropdown
	 */
	public void selectDropdown(String topLevelId, String tagName, String option){	
		WebElement sel = getDriver().findElement(By.id(topLevelId))
				.findElements(By.tagName(tagName)).get(0);		
		Select selector = new Select(sel);
		selector.selectByVisibleText(option);
	}	
	public void selectDropdown(String className, String option){		
		WebElement sel = getDriver().findElement(By.className(className));		
		Select selector = new Select(sel);
		selector.selectByVisibleText(option);
	}	
	public void select(String topLevelId, String className, String user) {
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
				.findElements(By.className(className)).get(0);
		List<WebElement> lists = topLevel.findElements(By.tagName("tr"));
		for(WebElement list:lists){
			WebElement span = list.findElements(By.tagName("span")).get(0);
			if(span.getText().equals(user)){
				span.click();
				break;
			}
		}
	}

	public void select(UserWorkspaceOption option, String className) {
		WebElement topLevel = getDriver().findElement(By.className(className))		
			.findElement(By.id("view-menu"));
		
		List<WebElement> options = topLevel.findElements(By.tagName("span"));
		for(WebElement list : options){
			if(list.getText().equals(option.returnOption())){
				list.click();
				break;
			}
		}	
		util.wait(0.5);
	}

	public void select(ToolsOption option, String topLevelId) {
		WebElement topLevel = getDriver().findElement(By.id(topLevelId));
		
		List<WebElement> options = topLevel.findElements(By.tagName("span"));
		for(WebElement list : options){
			if(list.getText().equals(option.returnToolOption())){
				list.click();
				break;
			}
		}	
		util.wait(0.5);
	}
	
	public void dropdownSelect(String topLevelId, String topLevelClassName, String option){	
		getDriver().findElement(By.id(topLevelId)).findElements(By.tagName("button")).get(0).click();
		util.wait(1);
		
		WebElement viewMenu = getDriver().findElements(By.className(topLevelClassName)).get(0)
				.findElement(By.id("view-menu"));
			
			List<WebElement> options = viewMenu.findElements(By.tagName("span"));
			for(WebElement list : options){
				if(list.getText().equals(option)){
					list.click();
					break;
				}
			}	
			util.wait(0.5);
	}	
	
	public void confirmDelete() {
		WebElement wrap = getDriver().findElement(By.id("DOMadditions"));
		wrap.findElements(By.tagName("input")).get(0).sendKeys("p00k!DtLQ");
		util.wait(1);
		
		List<WebElement> buttons =wrap.findElements(By.tagName("button"));
		for(WebElement button : buttons){
			if(button.getText().equalsIgnoreCase("Delete")){
				button.click();
				break;
			}
		}
	}	
	
	public boolean verifyPage(String page, String workspace) {
		
        if(page.equals("Admin")){
        	return getDriver().getTitle().equals("magnum@opus2international.com - Magnum settings " + " - " + workspace);
        }else{
        	return getDriver().getTitle().equals(page + " - "+workspace);
        }
    }
}
