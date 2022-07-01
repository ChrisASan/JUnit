package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.TestQ1Page;
import util.BrowserFactory;

public class TestQ3 {
	WebDriver driver;
	
	@Before	
public void runBefore() {
		driver = BrowserFactory.init();
		BrowserFactory.waitTime();
}
	
	@Test
	public void validateAllListItemCanBeRemovedUsingTheRemoveButtonAndWhenToggleAllFunctionalityIsOn() {
		TestQ1Page testQ1Page = PageFactory.initElements(driver, TestQ1Page.class);
		testQ1Page.toggleAllCheckBoxIsChecked();
		testQ1Page.clickRemoveButton();
		testQ1Page.validateAllListItemsAreRemoved();
		testQ1Page.addListItems();
		
	}
			
	@After	
public void runAfter() {
		BrowserFactory.tearDown();	
	}
	
}
