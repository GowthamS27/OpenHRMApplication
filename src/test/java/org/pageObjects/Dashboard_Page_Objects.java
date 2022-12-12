package org.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_Page_Objects {
	@FindBy(xpath="(//*[@class='oxd-text oxd-text--p'])[5]")
	public static WebElement pendingLeaveRequest;
	
}
