package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.TestQ1Page;
import util.BrowserFactory;

public class TestQ1 {
	WebDriver driver;
	
	@Test
	public void validateToggleAllCheckBox() {
		
		driver = BrowserFactory.init();
		BrowserFactory.waitTime();

//Q1 JUNIT		
		TestQ1Page testQ1Page = PageFactory.initElements(driver, TestQ1Page.class);
		testQ1Page.toggleAllCheckBoxIsChecked();
		BrowserFactory.waitTime();	
		
	
//		testQ1Page.toggleAllCheckBoxIsNotCheck();
//		BrowserFactory.waitTime();	
		testQ1Page.validateAllCheckBoxesAreChecked();
		BrowserFactory.waitTime();

//Q2 JUNIT	
		
		BrowserFactory.tearDown();
		
//Q2 JUNIT	
		
		
		
	}
	
}
