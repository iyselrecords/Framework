package com.opus2.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opus2.enums.Pages;

import net.thucydides.core.guice.Injectors;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;

public class Util extends PageObject{
	
	private EnvironmentVariables environmentVariables;
		
	public static Logger APP_LOGS = Logger.getLogger(Util.class);
	private static String language;
	private static String brandType;
	private static String platform;
	private static String browser;
	private static long defaultImplicitlyWait;
	private static Properties OR_CHARTS_PAGE;
	public WebDriver driver = getDriver();
	
	
	
	public void wait(int sec){
		try {
			Thread.sleep(1000 * sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void wait(double sec){
		try {
			Thread.sleep((long) (1000 * sec));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void explicitWait(String elementId){	
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), 300);
			wait.until( 
					ExpectedConditions.elementToBeClickable(By.id(elementId)));
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public EnvironmentVariables getEnvironmentVariables() {
        if (environmentVariables == null) {
            environmentVariables = Injectors.getInjector().getProvider(EnvironmentVariables.class).get().copy();
        }
        return environmentVariables;
    }
	
	
	public static void initializing(final String brand, final String lang,
			final String platf, final String browser) throws IOException {
		APP_LOGS.info("Inside initialization....." + brand);
		setBrand(brand);
		setLang(lang);
		setPlatform(platf);
		setDefaultImplicitlyWait(200000);
		brandConfigLoader(brand);
	}
	
	private static void setBrand(final String brand) {
		if ("Opus2".equals(brand)) {
			setBrandType(Constants.MP);
		} else {
			APP_LOGS.info("(): ERROR: The brand \'" + brand + "\' is not supported.");
		}
	}
	public static void setBrandType(final String brand) {
		brandType = brand;
	}
	private static void setLang(final String lang) {
		if ("EN".equals(lang)) {
			setLanguage(Constants.EN);
		} else if ("HI".equals(lang)) {
			setLanguage(Constants.HI);
		}else if ("IT".equals(lang)) {
			setLanguage(Constants.IT);
		}  
		else {
			APP_LOGS.info("(): ERROR: The language \'" + lang + "\' is not supprted.");
		}
	}
	
	private static void setLanguage(final String lang) {
		language = lang;
	}

	public static void setDefaultImplicitlyWait(final long defaultImplicitlyWait) {
		Util.defaultImplicitlyWait = defaultImplicitlyWait;
	}
	
	private static void setPlatform(final String platf) {
		if ("DESKTOP".equals(platf.toUpperCase())) {
			platform = Constants.PLATFORM_DESKTOP;
		} else if ("MOBILE".equals(platf.toUpperCase())) {
			platform = Constants.PLATFORM_MOBILE;
		} else if ("GRID".equals(platf.toUpperCase())) {
			platform = Constants.PLATFORM_GRID;
		} else {
			APP_LOGS.info("(): ERROR: The platform \'" + platf + "\' is not supported.\n");
		}
	}
	public static void brandConfigLoader(String brandType) throws IOException {
		FileInputStream brandConfigFile = null;

			APP_LOGS.info("brandConfigLoader(): brandType= "+getBrandType());
			APP_LOGS.info("brandConfigLoader(): Platform = "+getPlatform());			

			
			
			brandConfigFile = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//"+ brandType + "//" + Constants.OPUS2_PAGE +".properties");
			OR_CHARTS_PAGE = new Properties();
			OR_CHARTS_PAGE.load(brandConfigFile);
	}
	
	public static String getBrandType() {
		return brandType;
	}
	public static String getPlatform() {
		return platform;
	}

	public void switchToCurrentWindow(int index) {
		wait(1);
		Set<String> AllWindowHandles = getDriver().getWindowHandles(); 
		String currentWindow = (String) AllWindowHandles.toArray()[index];
		getDriver().switchTo().window(currentWindow);
		wait(3);
	}
	
	public void clickAction(String elementId){
		getDriver().findElement(By.id(elementId)).click();
		wait(0.5);
	}
	public void clickAction(String topLevelId, String className, String element, String title){
		wait(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
				.findElements(By.className(className)).get(0);
		List<WebElement> buttons = topLevel.findElements(By.tagName(element));
		for(WebElement button : buttons){
			if((button.getAttribute("title").equalsIgnoreCase(title)) || (button.getText().equalsIgnoreCase(title))){
				button.click();
				break;
			}
		}
		wait(0.5);
	}
	public void clickAction(String topLevelId, String className, String element, int index ){
		wait(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId))
			.findElements(By.className(className)).get(0);
		topLevel.findElements(By.tagName(element))
			.get(index).click();
		wait(0.5);
	}
	public void clickAction(String topLevelId, String tagName, int index){
		wait(0.5);
		WebElement topLevel = getDriver().findElement(By.id(topLevelId));
		topLevel.findElements(By.tagName(tagName))
		.get(index).click();
		wait(0.5);
	}
	
	
	
	public void inputText(String elementId, String keysToSend) {	
		wait(0.5);
		WebElement element = getDriver().findElement(By.id(elementId));
		element.findElements(By.tagName("input")).get(0).clear();
		element.findElements(By.tagName("input")).get(0).sendKeys(keysToSend);
		wait(1);
	}
	public void inputText(String topLevel, String keysToSend, int i) {
		WebElement element = getDriver().findElement(By.id(topLevel));
		element.findElements(By.tagName("input")).get(i).clear();
		element.findElements(By.tagName("input")).get(i).sendKeys(keysToSend);
		wait(0.5);
	}
	public void inputTextClassName(String className, String keysToSend) {	
		wait(0.5);
		WebElement element = getDriver().findElements(By.className(className)).get(0);
		element.findElements(By.tagName("input")).get(0).clear();
		element.findElements(By.tagName("input")).get(0).sendKeys(keysToSend);
		wait(1);
	}
	public void clearText(String elementId) {	
		wait(0.5);
		WebElement element = getDriver().findElement(By.id(elementId));
		element.findElements(By.tagName("input")).get(0).clear();
		wait(1);
	}
	
	public void clickActionByText(String elementId){
		getDriver().findElement(By.linkText(elementId)).click();
		wait(1);
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
		wait(1);
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
		wait(1);
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
		wait(3);
		WebElement wrap = getDriver().findElement(By.id("uploader_uploader"));
		WebElement input = wrap.findElements(By.tagName("input")).get(0);
				
		input.sendKeys("C:\\Users\\misele\\UD\\testDoc.pdf");
		wait(2);
	}
	public void reloadPage() {
		getDriver().navigate().refresh();
	}
	public void confirm(String elementId) {
		getDriver().findElement(By.id(elementId)).click();
	}
	public void selectOption(String option) {
		wait(0.4);
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
		 wait(0.7);
		 getDriver().switchTo().alert().accept();
	}
	public void dismissAlert() {
		 wait(0.7);
		 getDriver().switchTo().alert().dismiss();
	}
	public  void xSpace(int num)
    {
        WebElement wrap = getDriver().findElement(By.id("reorder"));
        wrap.findElements(By.tagName("input")).get(0).clear();
        wrap.findElements(By.tagName("input")).get(0).sendKeys("7");

        //Driver.Instance.FindElement(By.CssSelector("placeholder:X")).SendKeys(num.ToString());
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
		wait(1);
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
	
	public void highlight(int pageNum, int lineNum) {
		Actions action = new Actions(getDriver());		
		
		WebElement page = getDriver().findElement(By.id("page_" + (pageNum - 1)));
		WebElement line = page.findElement(By.id("line_"+ (pageNum - 1) + "_" + (lineNum - 1)));	
		WebElement text = line.findElement(By.className("trlinetext"))
				.findElement(By.tagName("span"));		

		int width = text.getSize().width;
		int height = text.getSize().height/2;
		
		System.out.println(text.getText());
		System.out.println(width);
		System.out.println(height);
				
		action.moveToElement(text).dragAndDropBy(text, 60, 9).build().perform();
	    
		wait(7);
	}
	
	

	
	
}