package com.opus2.util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.opus2.util.components.Component;

import net.serenitybdd.core.pages.PageObject;

public abstract class Page extends PageObject{
 protected WebElement me;
 public Page(){
 }
 public abstract Page view();
}
