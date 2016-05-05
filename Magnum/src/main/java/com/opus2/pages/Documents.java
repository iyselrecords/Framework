package com.opus2.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.opus2.util.Util;

import net.thucydides.core.pages.PageObject;

public class Documents extends PageObject {
	public WebDriver driver = getDriver();
	Util util;
	
	public void uploadDocument() {
		getDriver().findElement(By.id("upload-toggle-button")).click();
		util.wait(2);
	}

	public UploadDialog uploadDialog() {
		return new UploadDialog();
	}

	public void newFolder() {
		getDriver().findElement(By.id("docscontrols_NewFolder")).click();
	}

	public void enterFoldersName(String name) {
		WebElement input = getDriver().findElement(By.id("newFolderDialog_newFolderDialog"));
		input.findElements(By.tagName("input")).get(0).sendKeys(name);
		util.wait(1);
	}
	public void createFolder() {
		getDriver().findElement(By.id("newFolderDialog_CreateFolder")).click();
	}

	public void pageReload() {
		getDriver().navigate().refresh();
		util.wait(2);
	}

	public void goTo() {
		//Util.explicityWait("magnumDocuments");
		getDriver().findElement(By.id("magnumDocuments")).click();
	}

	public void changeDestinationFolder() {
		util.wait(1);
		getDriver().findElement(By.id("newFolderDialog_newFolderDialog_Change")).click();
		util.wait(1);
	}

	public void selectFolder(String folder) {
		WebElement wrap = getDriver().findElement(By.id("doc-chooser"));
		wrap.findElements(By.tagName("input")).get(0).sendKeys(folder);	
	}

	public void selectDestination(String folder) {
		WebElement wrap = getDriver().findElements(By.className("docstree")).get(0);
		List<WebElement> rows = wrap.findElements(By.className("docrow"));
		for(WebElement row : rows){
			List<WebElement> spans = row.findElements(By.tagName("span"));
			for(WebElement span : spans){
				if(span.getText().equalsIgnoreCase(folder)){
					span.click();
					return;
				}
			}
		}
	}

	public void collapseFolder(String folderName) {		
		WebElement wrap = getDriver().findElement(By.id("docsdiv"));
		
		List<WebElement> folders = wrap.findElements(By.className("clearboth"));		
		for(WebElement folder :folders){
			
			List<WebElement> spans = folder.findElements(By.tagName("span"));		
			for(WebElement span :spans){
				if(span.getText().equalsIgnoreCase(folderName)){
					WebElement expand = folder.findElements(By.className("halflings")).get(0);
					expand.click();
					return;
				}
			}
		}
	}

	public void expandFolder(String folderName) {
		WebElement wrap = getDriver().findElement(By.id("docsdiv"));
		
		List<WebElement> folders = wrap.findElements(By.className("clearboth"));		
		for(WebElement folder :folders){
			
			List<WebElement> spans = folder.findElements(By.tagName("span"));		
			for(WebElement span :spans){
				if(span.getText().equalsIgnoreCase(folderName)){
					WebElement expand = folder.findElements(By.className("halflings")).get(0);
					expand.click();
					return;
				}
			}
		}
		
	}

	public void findDocument(String document) {
		WebElement search = getDriver().findElement(By.id("left-button-row")).findElement(By.className("searchComponent"));	
		search.findElements(By.tagName("input")).get(0).clear();
		search.findElements(By.tagName("input")).get(0).sendKeys(document);
		util.wait(1);
		search.findElements(By.tagName("button")).get(0).click();	
	}

	public void clickDocument(String file) {		
		WebElement wrap = getDriver().findElement(By.id("docsdiv"));
		List<WebElement> folders = wrap.findElements(By.className("clearboth"));
		
		for(WebElement folder: folders){
			WebElement table = folder.findElements(By.tagName("table")).get(0);
			
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			for(int i = 1; i < rows.size(); i++){
				WebElement row = rows.get(i);
				WebElement cell = row.findElements(By.className("doctitle")).get(0);
				if(cell.getText().equalsIgnoreCase(file)){
					cell.click();
					return;
				}
			}
		}	
	}

	public void previewPrevious() {
		
		WebElement control = getDriver().findElements(By.className("centre-preview-ctrls")).get(0);
		WebElement previous = control.findElements(By.className("control-nav")).get(0).findElements(By.tagName("button")).get(0);
		previous.click();
		
	}

	public void previewNext() {
		WebElement control = getDriver().findElements(By.className("centre-preview-ctrls")).get(0);
		WebElement next = control.findElements(By.className("control-nav")).get(1).findElements(By.tagName("button")).get(0);
		next.click();
	}

	public void previewSelectedPage(String page) {
		WebElement control = getDriver().findElements(By.className("centre-preview-ctrls")).get(0);
		WebElement dropdown = control.findElements(By.className("page-selector")).get(0);
		dropdown.findElements(By.tagName("button")).get(0).click();
		util.wait(2);
		
		WebElement menu = dropdown.findElement(By.className("menu"));
		List<WebElement> lists = menu.findElements(By.tagName("div"));	
		for(WebElement list: lists){
			if(list.getText().equalsIgnoreCase(page)){
				list.click();
				break;
			}
		}
	}

	public void previewDocumentNewTab() {
		WebElement wrap = getDriver().findElement(By.id("preview-div"));
		wrap.findElements(By.className("previewNotes")).get(0).click();	
	}

	public void rightClick(String file) {
		WebElement wrap = getDriver().findElement(By.id("docsdiv"));
		List<WebElement> folders = wrap.findElements(By.className("clearboth"));
		
		for(WebElement folder: folders){
			List<WebElement> spans = folder.findElements(By.tagName("span"));
			
			for(WebElement span: spans){
				if(span.getText().equalsIgnoreCase(file)){
					Actions action = new Actions(getDriver());
					action.contextClick(span).sendKeys(Keys.ARROW_DOWN).perform();
					util.wait(1);
					return;
				}
			}
		}
	}

	public void selectContextOptions(String option) {
		WebElement menuWrap = getDriver().findElement(By.id("rightClickMenu"));
		List<WebElement> lists = menuWrap.findElements(By.className("element"));
		for(WebElement list : lists){
			if(list.findElements(By.tagName("span")).get(0).getText().equalsIgnoreCase(option)){
				list.click();
				break;
			}
		}		
	}
	public void selectNewNotes(String option){
		
		WebElement dropdown = getDriver().findElement(By.id("new-notes-dd"));
		dropdown.findElements(By.tagName("button")).get(0).click();
		
		WebElement viewMenu = getDriver().findElement(By.id("view-menu"));
		List<WebElement> lists = viewMenu.findElements(By.className("element"));
		for(WebElement list : lists){
			if(list.findElements(By.tagName("span")).get(0).getText().equalsIgnoreCase(option)){
				list.click();
				break;
			}
		}	
	}
	
	public void applyButton(String dialog) {
		getDriver().findElement(By.id("properties_Apply")).click();
		util.wait(1);
	}
	
	public void editDocumentName(String name) {
		WebElement propertyWrap = getDriver().findElement(By.id("properties"));
		WebElement table = propertyWrap.findElements(By.tagName("table")).get(1);
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(WebElement row : rows){
			//if(list.findElements(By.tagName("span")).get(0).getText().equalsIgnoreCase(option)){
				//list.click();
				//break;
			//}
		}		
	}
	

	public void newDocumentName(String newName) {
		WebElement nameWrap = getDriver().findElement(By.id("name-dialog"));
		nameWrap.findElements(By.tagName("input")).get(1).clear();
		nameWrap.findElements(By.tagName("input")).get(1).sendKeys(newName);
		util.wait(1);
		
		getDriver().findElement(By.id("name-dialog.OK")).click();
	}

	public void reOrdering(String action) {
		
		if(action.equalsIgnoreCase("up")){
			reorderDoc("reorderTbl.Up");
		}else if(action.equalsIgnoreCase("up")){
			reorderDoc("reorderTbl.Up");
		}else if(action.equalsIgnoreCase("top")){
			reorderDoc("reorderTbl.Top");
		}else if(action.equalsIgnoreCase("down")){
			reorderDoc("reorderTbl.Down");
		}else if(action.equalsIgnoreCase("bottom")){
			reorderDoc("reorderTbl.Bottom");
		}else if(action.equalsIgnoreCase("move10up")){
			reorderDoc("reorderTbl.Move10Up");
		}else if(action.equalsIgnoreCase("move10down")){
			reorderDoc("reorderTbl.Move10Down");
		}else if(action.equalsIgnoreCase("moveXDistance")){			
			reorderDoc("reorderTbl.XDistance");
		}
	}

	private void reorderDoc(String elementID) {
		getDriver().findElement(By.id(elementID)).click();
		util.wait(1);
	}

	public void applyOrdering() {
		getDriver().findElement(By.id("reorder_ApplyOrdering")).click();		
	}

	public void moveXDistance(String num) {
		WebElement wrap = getDriver().findElement(By.id("reorder"));
		wrap.findElements(By.tagName("input")).get(0).clear();
		wrap.findElements(By.tagName("input")).get(0).sendKeys(num);
	}

	public void rightClickFolder(String directory) {
		WebElement wrap = getDriver().findElement(By.id("docsdiv"));
		List<WebElement> folders = wrap.findElements(By.className("clearboth"));
		
		for(WebElement folder: folders){
			
			List<WebElement> spans = folder.findElements(By.tagName("span"));	
			for(WebElement span: spans){
				if(span.getText().equalsIgnoreCase(directory)){
					Actions action = new Actions(getDriver());
					action.contextClick(span).sendKeys(Keys.ARROW_DOWN).perform();
					return;
				}	
			}			
		}
	}

	public void selectSortOrder(String option) {
		WebElement sortWrap = getDriver().findElement(By.id("sort-order_sort-order"));
		
		List<WebElement> tables = sortWrap.findElements(By.tagName("table"));
		for(WebElement table : tables){
			if(table.findElements(By.tagName("td")).get(1).getText().equalsIgnoreCase(option)){
				table.findElements(By.tagName("input")).get(0).click();
				break;
			}
		}	
	}
	
	public void sortOrder() {
		getDriver().findElement(By.id("sort-order_sort-order_Sorting")).click();
		util.wait(1);
		getDriver().findElement(By.id("sort-order_SaveOrdering")).click();
		util.wait(1);
		getDriver().findElement(By.id("OK")).click();
	}

	public void acceptAlert() {
		util.wait(2);
		getDriver().switchTo().alert().accept();
	}
	
}
