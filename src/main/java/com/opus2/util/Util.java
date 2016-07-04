package com.opus2.util;

import net.serenitybdd.core.pages.PageObject;

public class Util extends PageObject {

	
	public void pause(int waitTime) {
		try {
			Thread.sleep(1000 * waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void pause(double waitTime) {
		try {
			Thread.sleep((long) (1000 * waitTime));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
