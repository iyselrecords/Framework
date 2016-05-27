package com.opus2.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.opus2.enums.ChronologyOption;
import com.opus2.enums.ChronologyType;
import com.opus2.enums.UserActivity;
import com.opus2.enums.UsersCap;

import net.thucydides.core.pages.PageObject;

public class Event extends PageObject{
	public WebDriver driver = getDriver();
	Util util;

	public void selectDocumentType(String documentType) {
		WebElement topLevel = getDriver().findElement(By.id("settingsmain"));
		WebElement grouptype = topLevel.findElements(By.className("settings-group")).get(0).findElements(By.className("doctypes")).get(0);
		List<WebElement> types = grouptype.findElements(By.tagName("tr"));

		
        for (int i = 1; i < types.size(); i++)
        {
        	WebElement type = types.get(i);
        	WebElement typeText = type.findElements(By.tagName("div")).get(0);
        	List<WebElement> buttons = type.findElements(By.className("btn-grp")).get(0).findElements(By.tagName("button"));

            for (WebElement button : buttons)
            {
                if ((typeText.getText().equalsIgnoreCase(documentType)) && (button.getText().equalsIgnoreCase("Edit")))
                {
                    button.click();
                    return;
                }
            }
        }
        
	}

	public void delete(String docType) {	
		WebElement topLevelWrap = getDriver().findElement(By.id("settingsmain"));
		WebElement docTypeTable = topLevelWrap.findElements(By.className("settings-group")).get(0);
		WebElement table = docTypeTable.findElements(By.className("doctypes")).get(0);
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(int i=1; i < rows.size(); i++){
			WebElement row = rows.get(i);
			WebElement div = row.findElements(By.tagName("div")).get(0);
			
			if(div.getText().equalsIgnoreCase(docType)){
				row.findElement(By.className("smallIcon")).click();
				break;
			}
		}
	}
	
	
	public void newDocumentType(){	
		WebElement topLevelWrap = getDriver().findElement(By.id("settingsmain"));
		WebElement docTypeTable = topLevelWrap.findElements(By.className("settings-group")).get(0);
		WebElement button = docTypeTable.findElements(By.className("panel-body")).get(0);
		button.findElements(By.tagName("button")).get(0).click();	
	}
	
	
	public void enterDocumentTypeDetails(String name, String desc){	
		WebElement topLevelWrap = getDriver().findElement(By.id("doc-type_doc-type"));
		
		topLevelWrap.findElements(By.tagName("input")).get(0).clear();
		topLevelWrap.findElements(By.tagName("input")).get(0).sendKeys(name);
		topLevelWrap.findElements(By.tagName("textarea")).get(0).clear();
		topLevelWrap.findElements(By.tagName("textarea")).get(0).sendKeys(desc);
	}

	public void editDocumentType(String docType) {
		WebElement topLevelWrap = getDriver().findElement(By.id("settingsmain"));
		WebElement docTypeTable = topLevelWrap.findElements(By.className("settings-group")).get(0);
		WebElement table = docTypeTable.findElements(By.className("doctypes")).get(0);
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(int i=1; i < rows.size(); i++){
			WebElement row = rows.get(i);
			WebElement div = row.findElements(By.tagName("div")).get(0);
			
			if(div.getText().equalsIgnoreCase(docType)){
				row.findElements(By.tagName("button")).get(0).click();
				break;
			}
		}		
	}
	
	public void addNewMetadataColumn(){
		//button
		
		//details
	}
	public void addNewColumnButton(){	
		WebElement topLevelWrap = getDriver().findElement(By.id("settingsmain"));
		WebElement docTypeTable = topLevelWrap.findElements(By.className("settings-group")).get(1);
		WebElement button = docTypeTable.findElements(By.className("panel-body")).get(0);
		button.findElements(By.tagName("button")).get(0).click();	
	}

	public void customFieldLabel() {	
		WebElement label = getDriver().findElement(By.id("custom-field"));
		label.findElements(By.tagName("input")).get(0).sendKeys("Label_01");
	}

	public void customFieldName() {
		WebElement name = getDriver().findElement(By.id("custom-field"));
		name.findElements(By.tagName("input")).get(1).sendKeys("CFName01");
	}

	public void deleteRole(String newrole) {
		WebElement topLevel = getDriver().findElement(By.id("settingsmain"));
		WebElement header = topLevel.findElements(By.className("panel-header")).get(0);
		List<WebElement> lists = header.findElements(By.tagName("td"));
				
		int roleIndex = 0; 
		for(int i=0; i < lists.size(); i++){
			if(lists.get(i).getText().equals(newrole)){
				roleIndex = i;
				break;
			}
		}
		
		WebElement row = topLevel.findElements(By.className("floatleft")).get(0)
				.findElements(By.tagName("tr")).get(24);	
		row.findElements(By.tagName("td")).get(roleIndex)
			.findElements(By.tagName("button")).get(1).click();	
	}

	public void editNewRole(String newrole) {
		WebElement topLevel = getDriver().findElement(By.id("settingsmain"));
		WebElement header = topLevel.findElements(By.className("panel-header")).get(0);
		List<WebElement> lists = header.findElements(By.tagName("td"));
		
		int roleIndex = 0;
		for(int i=0; i < lists.size(); i++){
			if(lists.get(i).getText().equals(newrole)){
				roleIndex = i;
				break;
			}
		}
		
		WebElement editRow = topLevel.findElements(By.className("floatleft")).get(0)
				.findElements(By.tagName("tr")).get(24);
		List<WebElement> rows = editRow.findElements(By.className("btn-grp"));
		for(int c=0; c < rows.size(); c++){
			if(rows.indexOf(rows.get(c)) == (roleIndex - 2)){
				rows.get(c).findElements(By.tagName("button")).get(0).click();
			}
		}
	}

	public void selectUser(UsersCap edit, String email) {
		List<WebElement> lists = getDriver().findElements(By.className("panel-body"));
		
		for(int i=0; i <= lists.size(); i++){
			if(i == (lists.size() - 1)){
				List<WebElement> rows = lists.get(i).findElements(By.tagName("tr"));
				for(WebElement row : rows){
					if(row.findElements(By.tagName("td")).get(2).getText().equalsIgnoreCase(email)){
						row.findElements(By.tagName("input")).get(0).click();
						util.wait(1);
						userSelect(edit);
						return;
					}
				}
			}
		}		
	}

	private void userSelect(UsersCap edit) {
		WebElement topLevel = getDriver().findElement(By.id("rightClickMenu"));
		List<WebElement> lists = topLevel.findElements(By.className("element"));
		
		for(WebElement list: lists){
			if(list.findElement(By.tagName("span")).getText().equalsIgnoreCase(edit.userFuntion())){
				list.findElement(By.tagName("span")).click();
				break;
			}
		}
	}

	public void navigateTo(String url) {
		getDriver().navigate().to(url);
		util.wait(2);
	}

	public void logout() {
		util.wait(2);
		getDriver().findElement(By.id("log-out")).click();
		util.wait(1);
		util.acceptAlert();
		util.wait(2);
	}

	public void userActivity(UserActivity userActivity) {
        getDriver().findElement(By.linkText(userActivity.returnActivity())).click();
	}

	public void selectLastEntry() {
		WebElement topLevel = getDriver().findElement(By.id("docsdiv"))
				.findElements(By.className("foldercontents")).get(0);
		List<WebElement> lists = topLevel.findElements(By.className("rightTable"));
		
		for(int i = 1; i < lists.size(); i++){
			if(i == (lists.size()-1)){
				lists.get(i).click();
				break;
			}
		}
	}

	public void selectType(ChronologyType type) {
		WebElement topLevel = getDriver().findElement(By.id("type-menu"));
		List<WebElement> lists = topLevel.findElements(By.className("element"));
		
		for(WebElement list:lists){
			WebElement span = list.findElements(By.tagName("span")).get(0);
			if(span.getText().equalsIgnoreCase(type.toString())){
				span.click();
				break;
			}
		}
		util.wait(1);
	}

	public void selectType(ChronologyOption type) {
		//WebElement topLevel = getDriver().findElement(By.id("previewtd"));
		WebElement topLevel = getDriver().findElement(By.id("type-menu"));
		
		List<WebElement> lists = topLevel.findElements(By.className("element"));
		
		for(WebElement list:lists){
			WebElement span = list.findElements(By.tagName("span")).get(0);
			if(span.getText().equalsIgnoreCase(type.toString())){
				span.click();
				break;
			}
		}
		util.wait(1);
	}
}
