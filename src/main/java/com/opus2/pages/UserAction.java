package com.opus2.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opus2.enums.Pages;
import com.opus2.enums.SideMenu;
import com.opus2.enums.ToolsOption;
import com.opus2.enums.UserWorkspaceOption;
import com.opus2.util.Util;

import net.serenitybdd.core.pages.PageObject;

public class UserAction extends PageObject {
	Util util;
	public static String currentValue;
	

	/*
	 * Overloaded Click Methods
	 */
	public void clickAction(String elementId) {
		getDriver().findElement(By.id(elementId)).click();
	}
	public void clickActionLinkText(String linkText) {
		getDriver().findElement(By.linkText(linkText)).click();
	}
	public void clickActionClassName(String elementId) {
		getDriver().findElement(By.className(elementId)).click();
	}
	public void clickActionName(String elementId) {
		getDriver().findElement(By.name(elementId)).click();
	}
	public void clickAction(String topLevelId, String className, String element, String title){
		util.pause(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
				.findElements(By.className(className)).get(0);
		List<WebElement> buttons = topLevel.findElements(By.tagName(element));
		for(WebElement button : buttons){
			if((button.getAttribute("title").equalsIgnoreCase(title)) || (button.getText().equalsIgnoreCase(title))){
				button.click();
				break;
			}
		}
		util.pause(0.5);
	}

	
	public void clickAction(String topLevelId, String className, String element, int index ){
		util.pause(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
			.findElements(By.className(className)).get(0);
		topLevel.findElements(By.tagName(element))
			.get(index).click();
	}	
	public void clickAction(String topLevelId, String tagName, int index){
		util.pause(0.5);
		getDriver().findElement(By.id(topLevelId))
			.findElements(By.tagName(tagName)).get(index).click();
	}	
	public void clickAction(String topLevelId, String className, String elementId){
		util.pause(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
			.findElements(By.className(className)).get(0);
		topLevel.findElement(By.id(elementId)).click();
	}
	public void clickAction(String topLevelId, String className){
		util.pause(0.5);
		getDriver().findElement(By.id(topLevelId))
			.findElements(By.className(className)).get(0).click();
	}
	public void clickActionByText(String elementId){
		getDriver().findElement(By.linkText(elementId)).click();
	}
	public void clickAction(String topLevelId, String className, int classIndex, String element, int elementIndex){
		util.pause(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
			.findElements(By.className(className)).get(classIndex);
		topLevel.findElements(By.tagName(element))
			.get(elementIndex).click();
	}	
	
	
	public void getCharacter(int index) {
		WebElement topLevel = getDriver().findElement(By.id("formMemWord"));
        List <WebElement> characters = topLevel.findElements(By.tagName("tr"));
        for (int i = 0; i < characters.size() - 1; i++)
        {
            if (i == index)
            {
            	String label = characters.get(i).findElements(By.className("white")).get(0).getText();
                String character = label.substring(6, 7);
                enterCharacter(character, (index + 1));
                break;
            }
        }
	}
	private void enterCharacter(String character, int index) {
		WebElement topLevel = getDriver().findElement(By.id("eid" + index));
        topLevel.sendKeys(character);
	}
	
	public void grabIndex(int index){
		WebElement topLevel = getDriver().findElement(By.id("formMemWord"));
        List <WebElement> characters = topLevel.findElements(By.tagName("tr"));
        
        for (int i = 0; i < characters.size()-1; i++)
        {
        	if (i == index)
            {
            	String label = characters.get(i).findElements(By.className("white"))
            			.get(0).getText();
                inputMemorableWord(label.substring(6, 7), (i+1));
                break;
            }
        }
	}
	
	private void inputMemorableWord(String character, int index) {
		WebElement topLevel = getDriver().findElement(By.id("eid" + index));		
		if(character.equals("1")){
			topLevel.sendKeys(Configuration.first);
		}else if(character.equals("2")){
			topLevel.sendKeys(Configuration.second);
		}else if(character.equals("3")){
			topLevel.sendKeys(Configuration.third);
		}else if(character.equals("4")){
			topLevel.sendKeys(Configuration.fourth);
		}else if(character.equals("5")){
			topLevel.sendKeys(Configuration.fifth);
		}else if(character.equals("6")){
			topLevel.sendKeys(Configuration.sixth);
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
	
	
	/*
	 * overloaded methods for user inputting text
	 */
	public void inputText(String elementId, String keysToSend) {	
		util.pause(0.5);
		WebElement element = getDriver().findElement(By.id(elementId))
			.findElements(By.tagName("input")).get(0);
		element.clear();
		element.sendKeys(keysToSend);
	}
	public void inputTextId(String elementId, String text) {
		WebElement input = getDriver().findElement(By.id(elementId));
		input.clear();
		input.sendKeys(text);
	}
	public void inputText(String topLevelId, String keysToSend, int i) {
		WebElement element = getDriver().findElement(By.id(topLevelId));
		element.findElements(By.tagName("input")).get(i).clear();
		element.findElements(By.tagName("input")).get(i).sendKeys(keysToSend);
		util.pause(0.5);
	}
	public void inputTextClassName(String className, String keysToSend) {	
		util.pause(0.5);
		WebElement element = getDriver().findElements(By.className(className)).get(0);
		element.findElements(By.tagName("input")).get(0).clear();
		element.findElements(By.tagName("input")).get(0).sendKeys(keysToSend);
		util.pause(0.5);
	}
	public void inputText(String topLevelId, String className, String keysToSend) {	
		util.pause(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
				.findElements(By.className(className)).get(0);
		
		topLevel.findElements(By.tagName("input")).get(0).clear();
		topLevel.findElements(By.tagName("input")).get(0).sendKeys(keysToSend);
		util.pause(0.5);
	}
	public void inputTextArea(String elementId, String keysToSend) {	
		util.pause(0.5);
		WebElement element = getDriver().findElement(By.id(elementId));
		element.findElements(By.tagName("textarea")).get(0).clear();
		element.findElements(By.tagName("textarea")).get(0).sendKeys(keysToSend);
		util.pause(0.5);
	}
	public void inputTextAreaReturn(String elementId, String keysToSend) {
		WebElement element = getDriver().findElement(By.id(elementId))
			.findElements(By.tagName("textarea")).get(0);
		element.sendKeys(keysToSend);
		element.sendKeys(Keys.RETURN);
	}
	public void inputTextAreaReturn(String elementId, String keysToSend, String keysToSend2, String keysToSend3) {
		WebElement element = getDriver().findElement(By.id(elementId))
			.findElements(By.tagName("textarea")).get(0);
		element.sendKeys(keysToSend);element.sendKeys(Keys.RETURN);
		element.sendKeys(keysToSend2);element.sendKeys(Keys.RETURN);
		element.sendKeys(keysToSend3);
	}
	public void clearText(String elementId) {	
		util.pause(0.5);
		WebElement element = getDriver().findElement(By.id(elementId));
		element.findElements(By.tagName("input")).get(0).clear();
	}
	public void inputText(String topLevelId, String className, int classIndex, String keysToSend) {	
		util.pause(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
				.findElements(By.className(className)).get(classIndex);
		
		topLevel.clear(); topLevel.sendKeys(keysToSend);
	}
	
	public void inputText(String topLevelId, String className, String element, int index, String searchText){
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
			.findElements(By.className(className)).get(0);

        WebElement  input = topLevel.findElements(By.tagName("input")).get(index);
            input.clear();
            input.sendKeys(searchText);
	}
	public String getTime(){
		Date date = new Date();
		@SuppressWarnings("deprecation")
		int now = date.getHours() + date.getMinutes() + date.getSeconds();
		String time = Integer.toString(now);
        return time;
	}
	
	
	/*
	 * overloaded methods closeDialog
	 */
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
	
	
	/*
	 * page navigation
	 */
	
	
	/*
	 * user action reloading page
	 */
	public void reloadPage() {
		getDriver().navigate().refresh();
	}
	
	
	/*
	 * user action confirm prompt action
	 */
	public void confirm(String elementId) {
		getDriver().findElement(By.id(elementId)).click();
	}
	public void acceptAlert() {
		 util.pause(0.7);
		 getDriver().switchTo().alert().accept();
		 util.pause(2);
	}
	public void dismissAlert() {
		 util.pause(0.7);
		 getDriver().switchTo().alert().dismiss();
	}
	public void checkAlert() {
	    try {
	        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = getDriver().switchTo().alert();
	        alert.accept();
	    } catch (Exception e) {
	        //exception handling
	    }
	}

	/*
	 * Select from list and dropdown/lists
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
			if(!list.getAttribute("class").equals(" hide")){
				WebElement span = list.findElements(By.tagName("span")).get(0);
				if(span.getText().equals(user)){
					span.click();
					break;
				}
			}
		}
		util.pause(0.5);
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
		util.pause(0.5);
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
		util.pause(0.5);
	}	
	public void dropdownSelect(String topLevelId, String topLevelClassName, String option){	
		getDriver().findElement(By.id(topLevelId)).findElements(By.tagName("button")).get(0).click();
		util.pause(1);
		
		WebElement viewMenu = getDriver().findElements(By.className(topLevelClassName)).get(0)
				.findElement(By.id("view-menu"));
			
			List<WebElement> options = viewMenu.findElements(By.tagName("span"));
			for(WebElement list : options){
				if(list.getText().equals(option)){
					list.click();
					break;
				}
			}	
			util.pause(0.5);
	}
	public void selectDropdown(String topLevelId, String className, int classIndex, String element, int elementIndex, String option)
    {
        WebElement topLevel = getDriver().findElement(By.id(topLevelId));
        WebElement button = topLevel.findElements(By.className(className)).get(classIndex)
            .findElements(By.tagName(element)).get(elementIndex);
        button.click();
        util.pause(0.5);

        WebElement viewMenu = topLevel.findElements(By.className(className)).get(classIndex)
            .findElement(By.className("menu"));

        List<WebElement> spans = viewMenu.findElements(By.tagName("span"));
        for (WebElement span : spans)
        {
            if (span.getText().equalsIgnoreCase(option))
            {
                span.click();
                break;
            }
        }
    }
	public void selectDropdown(String topLevelId, String className, int classIndex, String option)
    {
        WebElement topLevel = getDriver().findElement(By.id(topLevelId));
        WebElement button = topLevel.findElements(By.className(className)).get(classIndex)
            .findElements(By.tagName("button")).get(0);
        button.click();
        util.pause(0.5);

        WebElement viewMenu = topLevel.findElements(By.className(className)).get(classIndex)
            .findElement(By.className("menu"));

        List<WebElement> spans = viewMenu.findElements(By.tagName("span"));
        for (WebElement span : spans)
        {
            if (span.getText().equalsIgnoreCase(option))
            {
                span.click();
                break;
            }
        }
    }
	public void selectDropdownId(String topLevelId, String className, int classIndex, String option)
    {
        WebElement topLevel = getDriver().findElement(By.id(topLevelId));
        WebElement button = topLevel.findElements(By.tagName("button")).get(0);
        button.click();
        util.pause(0.5);

        WebElement viewMenu = topLevel.findElements(By.className(className)).get(classIndex);
        List<WebElement> spans = viewMenu.findElements(By.tagName("span"));
        for (WebElement span : spans)
        {
            if (span.getText().equalsIgnoreCase(option))
            {
                span.click();
                break;
            }
        }
    }
	public void selectDropdown(String option){	
		WebElement viewMenu = getDriver().findElement(By.id("view-menu"));
			
			List<WebElement> options = viewMenu.findElements(By.tagName("span"));
			for(WebElement list : options){
				if(list.getText().equals(option)){
					list.click();
					break;
				}
			}	
			util.pause(0.5);
	}	
	public void selectFolder(String file) {
		util.pause(1);
		WebElement wrap = getDriver().findElement(By.id("doc-chooser_doc-chooser"));		
		
		List<WebElement> folders = wrap.findElements(By.tagName("span"));
		for(WebElement folder : folders){
			if(folder.getText().equalsIgnoreCase(file)){
				folder.click();
				break;
			}
		}
	}
	public void chooseTag(String label) {
		WebElement topLevel = getDriver().findElements(By.className("treeContentDiv")).get(0);
		List<WebElement> tags = topLevel.findElements(By.tagName("span"));		
		for(WebElement tag: tags){
			if(tag.getText().equalsIgnoreCase(label)){
				tag.click();
				break;
			}
		}	
	}
	public void selectDocOpenWindow(String file) {
		util.pause(5);
		WebElement wrap = getDriver().findElement(By.id("uploader_uploader"));
		WebElement input = wrap.findElements(By.tagName("input")).get(0);

		System.out.println("C:\\Users\\misele\\Desktop\\PN\\docs\\testData\\" + file + ".pdf");
		System.out.println(input.getAttribute("value"));
		
		//input.sendKeys("C:\\Users\\misele\\Desktop\\PN\\docs\\testData\\" + file + ".pdf");
		//input.sendKeys("C:\\Users\\misele\\UD\\" + file + ".pdf");
		util.pause(7);
	}
	public void selectFile(String file) throws AWTException {
		util.pause(1);
		String ext = ".pdf";
		String path = "C:\\Users\\misele\\Desktop\\PN\\docs\\testData\\testDoc\\";
		
		StringSelection myFile = new StringSelection(path+file+ext);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(myFile, null);
		
		Robot upload = new Robot();	
		upload.keyPress(KeyEvent.VK_CONTROL);
		upload.keyPress(KeyEvent.VK_V);
		upload.keyRelease(KeyEvent.VK_V);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);		
		
		util.pause(1);
	}
	public void selectFile(String topLevelId, String className, int classIndex, String element, int elementIndex, String file) {	
		//String path = "C:\\Users\\misele\\Desktop\\PN\\docs\\testData\\";
		String path = "C:\\Users\\martino\\Desktop\\Opus2\\testDoc\\testData\\";
		
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
				.findElements(By.className(className)).get(classIndex);
		WebElement input = topLevel.findElements(By.tagName(element)).get(elementIndex);
		input.sendKeys(path + file);
	}
	public void adminUserPopupMenu(String topLevelId,String list) {	
		WebElement topLevel = getDriver().findElements(By.id(topLevelId)).get(0);
		List<WebElement> options = topLevel.findElements(By.className("element"));		
		for(WebElement option: options){
			if(option.findElement(By.tagName("span")).getText().equalsIgnoreCase(list)){
				option.click();
				break;
			}
		}
		util.pause(1);
	}
	
	/*
	 * custom Actions
	 */

	public void find(String parentElementId, String keysToSend){
		WebElement wrap = getDriver().findElement(By.id(parentElementId));
		wrap.findElements(By.tagName("input")).get(0).sendKeys(keysToSend);
	}	
	public void findSearch(String elem, String doc) {
		WebElement topLevel = getDriver().findElement(By.id(elem));
		WebElement search = topLevel.findElement(By.className("searchComponent"));
		search.findElements(By.tagName("input")).get(0).clear();
		search.findElements(By.tagName("input")).get(0).sendKeys(doc);
		util.pause(1);
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
	public void selectOption(String option) {
		util.pause(0.4);
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
	public void confirmDelete() {
		WebElement wrap = getDriver().findElement(By.id("DOMadditions"));
		wrap.findElements(By.tagName("input")).get(0).sendKeys("p00k!DtLQ");
		util.pause(1);
		
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
	public void clickDialogHeader(String topLevelId, String header,
			String element, String text) {
		WebElement topLevel = getDriver().findElement(By.id(topLevelId));
		List<WebElement> dialogs = topLevel.findElements(By.className("dialog"));

        for (WebElement dialog : dialogs)
        {
        	WebElement h2 = dialog.findElements(By.tagName("h2")).get(0);

            if (h2.getText().equals(header.toUpperCase()))
            {
            	List <WebElement> buttons = dialog.findElements(By.className("dialogFoot")).get(0)
                    .findElements(By.tagName(element));
                for (WebElement button : buttons)
                {
                    if (button.getText().equals(text))
                    {
                        button.click();
                        return;
                    }
                }
            }
        }
        util.pause(0.3);
	}
	public void setCapabilities(int startIndex, int lastIndex) {
		WebElement topLevel = getDriver().findElement(By.id("settingsmain"))
				.findElements(By.className("floatleft")).get(0);
		
		List<WebElement> lists = topLevel.findElements(By.tagName("tr"));
		for(int i = startIndex; i < lastIndex; i++){
			lists.get(i).findElements(By.tagName("input")).get(0).click();
		}
	}
	public void adminSidemMenu(SideMenu menu){
		util.pause(1);
		WebElement topLevel = getDriver().findElement(By.id("settingsmain"))
				.findElements(By.className("menudiv")).get(0);
		
		List<WebElement> lists = topLevel.findElements(By.tagName("tr"));		
		for(int i=0; i < lists.size(); i++){			
			WebElement list = lists.get(i).findElements(By.tagName("td")).get(0);
			if(list.getAttribute("class").equalsIgnoreCase("menubutton")){
				if(menu.enumField().equals("Monitor Activity")){
					topLevel.findElements(By.tagName("a")).get(0).click();
	                 break;
				}else if(menu.enumField().equals("ACL Reports")){
					topLevel.findElements(By.tagName("a")).get(1).click();
	                 break;
				}
			}else{
				if (list.getText().equalsIgnoreCase(menu.enumField()))
	            {
					list.click();
	                 break;
	            }
			}
		}
		util.pause(0.3);
	}
	
	/*
	 * user action implicit wait
	 */
	public void turnOnWait() {
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}	
	public void turnOffWait() {
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);	
	}
	

	/*
	 * Explicit Wait
	 */
	public boolean progressBar(){
		try{
			WebDriverWait wait = new WebDriverWait(getDriver(), 40);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("progress-bar-bar")));
		}catch(ElementNotVisibleException e){
			e.getMessage();
		}
		return true;
	}
	public boolean progressBar2(){
		WebDriverWait wait = new WebDriverWait(getDriver(), 40);
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("progress-bar-bar")));
	}
	
	/*
	 * debugging issues
	 */
	public void debug(){
		WebElement topLevel = getDriver().findElement(By.id("settingsmain"));
		WebElement header = topLevel.findElements(By.className("panel-header")).get(0);
		List<WebElement> lists = header.findElements(By.tagName("td"));	
				
		int roleIndex = 0;
		for(int i=0; i < lists.size(); i++){
			if(lists.get(i).getText().equalsIgnoreCase("TRole2")){
				roleIndex = i;
				break;
			}
		}
	
		WebElement editRow = topLevel.findElements(By.className("floatleft")).get(0)
				.findElements(By.tagName("tr")).get(24);
		List<WebElement> rows = editRow.findElements(By.className("btn-grp"));
		
		for(int c=0; c < rows.size(); c++){
			if(rows.indexOf(rows.get(c)) == (roleIndex - 2)){
				rows.get(c).findElements(By.tagName("button")).get(1).click();
				util.pause(2);
				break;
			}
		}
	}


	public void videoTimecodeCorrection(int pageNum, int lineNum) {
		WebElement topLevel = getDriver().findElement(By.id("DOMadditions"))
				.findElements(By.className("dialogSection")).get(0);
		List<WebElement> pages = topLevel.findElements(By.className("trpage"));
		
		for(WebElement page : pages){
			if(page.getAttribute("id").equals("test")){
				//
			}
		}	
	}
	
	public void inputChroDate(String topLevelId, String text) {
		WebElement topLevel = getDriver().findElement(By.id(topLevelId));
        topLevel.clear();
        topLevel.sendKeys(text);
	}


	public void selectChroDateOption(String option, int index) {		
		if(option != "Range"){
			clickActionName("Date: ");
			inputTextId("filter-from-date", "18/04/2015");
			selectDropdown("");
		}else if(option == "Range"){
			selectChroDateOption(option, 0);
			clickActionName("Date: ");
		}
		
		clickActionName("Date: ");
		util.pause(0.5);
		
		WebElement topLevel = getDriver().findElements(By.className("filter-header")).get(index)
                .findElements(By.className("menu")).get(index);
        List <WebElement> lists = topLevel.findElements(By.tagName("span"));
/*
        turnOffWait();
        for (WebElement list : lists)
        {
            if (list.getText().equalsIgnoreCase(option)&& (option != "Range"))
            {
                list.click();
                util.pause(0.5);
                break;
            }
            else if (list.getText().equalsIgnoreCase(option) && (option == "Range"))
            {
                list.click();
                util.pause(0.5);
                inputChroDate("filter-from-date", "04/18/2016");
                inputChroDate("filter-to-date", "04/18/2016");
            }
        }
        turnOnWait();  */  
	}
	
	public void openDropdown(int index){
		WebElement topLevel = getDriver().findElement(By.id("chron-filter.chron-filter"))
                .findElements(By.className("filter")).get(index);
            topLevel.findElements(By.tagName("button")).get(0).click();
	}
	public void filterDropdown(int index){
		WebElement topLevel = getDriver().findElement(By.id("chron-filter.chron-filter"))
                .findElements(By.className("saved-filters")).get(0);
            topLevel.findElements(By.tagName("button")).get(index).click();
	}
	public void chroTypeOption(String index){
		WebElement topLevel = getDriver().findElement(By.id("chron-type-dropdown"))
                .findElements(By.className("listSelectorItems")).get(0);
		
		List<WebElement> options = topLevel.findElements(By.className("selectable"));
        
		turnOffWait();
		for (WebElement option : options)
        {
            if (option.findElement(By.className("listSelectorValue")).getText().equalsIgnoreCase(index))
            {
                option.findElements(By.tagName("input")).get(0).click();
                util.pause(0.5);
                option.findElements(By.tagName("input")).get(0).click();
                break;
            }
        }
		turnOnWait();
	}
	public void chroTypeAllNone(int index){
		util.pause(1);
		WebElement topLevel = getDriver().findElement(By.id("chron-type-dropdown"))
                .findElements(By.className(" floatright")).get(0);
		topLevel.findElements(By.tagName("span")).get(index).click();   	
	}
	public void chroStatue(String list){
		openDropdown(2);
		
		WebElement topLevel = getDriver().findElement(By.id("chron-filter_chron-filter"))
                .findElements(By.className("filter")).get(2);	
		List<WebElement> options = topLevel.findElements(By.className("menu")).get(0)
				.findElements(By.tagName("span"));
        
		turnOffWait();
		for (WebElement option : options)
        {
            if (option.getText().equalsIgnoreCase(list))
            {
                option.click();
                util.pause(0.5);
                break;
            }
        }
		turnOnWait();
	}
	
	public void uncheckDate(){
		
	}
	public void currentFilter(String option){
		WebElement topLevel = getDriver().findElement(By.id("chron-filter_chron-filter"))
                .findElements(By.className("floatright")).get(0);
		List<WebElement> lists = topLevel.findElements(By.tagName("span"));
        
		if (option == "Shared")
        {
            lists.get(1).click();
        }
        else if (option == "Private")
        {
            lists.get(2).click();
        }
        util.pause(1);
	}
	public void filterOption(int index){
		WebElement topLevel = getDriver().findElement(By.id("chron-filter_chron-filter"))
		    .findElements(By.className("saved-filters")).get(0);
		topLevel.findElements(By.className("autocompletes")).get(index)
            .findElements(By.tagName("div")).get(0).click();
            util.pause(1);    
	}
	public void selectLiveUser(String option){
		WebElement topLevel = getDriver().findElement(By.id("settingsmain"))
			    .findElements(By.className("panel-body")).get(3);
		
		List<WebElement> rows = topLevel.findElements(By.tagName("tr"));
		for(int i=1; i < rows.size(); i++){
			WebElement cell = rows.get(i).findElements(By.tagName("td")).get(0);
			if(cell.getText().equalsIgnoreCase(option)){
				rows.get(i).findElements(By.tagName("input")).get(0).click();
				break;
			}
		}
		util.pause(1);
	}
	
	
	public void selectWorkspace(String workspace) {
		WebElement wslist = getDriver().findElement(By.id("workspaceslist"));
		List <WebElement> lists = wslist.findElements(By.className("wsline"));
		for(WebElement list: lists){
			if(list.getAttribute("title").equalsIgnoreCase(workspace)){
				list.findElements(By.tagName("a")).get(0).click();
				break;
			}
		}	
	}
	
	
	/*
	 * user click action switching windows
	 */
	public void switchToCurrentWindow(int index) {
		util.pause(2);
		Set<String> AllWindowHandles = getDriver().getWindowHandles(); 
		String currentWindow = (String) AllWindowHandles.toArray()[index];
		getDriver().switchTo().window(currentWindow);
	}
	
	/*
	 * 
	 */
	 public WebElement element(String tagname, String text)
     {
		 List<WebElement> spans = getDriver().findElements(By.tagName(tagname));
         WebElement element = null;

         turnOffWait();
         for (WebElement span : spans)
         {
             if (span.getText().equalsIgnoreCase(text))
             {
                 element = span;
             }
         }
         turnOnWait();

         return element;
     }
	
	public void cfClickAction(String parentId, String label)
    {
		WebElement topLevel = getDriver().findElement(By.id(parentId));
		WebElement dialogBody = topLevel.findElement(By.className("dialogBody"));
		List<WebElement> rows = dialogBody.findElements(By.tagName("tr"));

        turnOffWait();
        for (WebElement row : rows)
        {
        	WebElement cell = row.findElements(By.tagName("td")).get(0);
            if (cell.getText().equalsIgnoreCase(label))
            {
                row.findElements(By.tagName("input")).get(0).click();
                break;
            }
        }
        turnOnWait();
    }
	public void radio(String topLevelId, String label) {
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
				.findElements(By.className("clearboth")).get(1);
		List<WebElement> radios = topLevel.findElements(By.tagName("tr"));

		turnOffWait();
		for (WebElement radio : radios)
        {
        	WebElement cell = radio.findElements(By.tagName("td")).get(1);
            if (cell.getText().equalsIgnoreCase(label))
            {
            	radio.findElements(By.tagName("input")).get(0).click();
                break;
            }
        }
		turnOnWait();
		util.pause(1);
	}
	
}
