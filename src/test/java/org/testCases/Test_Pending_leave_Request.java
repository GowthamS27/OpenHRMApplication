package org.testCases;

import org.BaseClass.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.pageObjects.Dashboard_Page_Objects;
import org.pageObjects.Login_Page_Objects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Pending_leave_Request extends BaseClass {
	String actualMessage=null;
	public void login() {
		PageFactory.initElements(driver, Login_Page_Objects.class);
		Login_Page_Objects.userName.sendKeys(properties.getProperty("username"));
		Login_Page_Objects.password.sendKeys(properties.getProperty("password"));
		Login_Page_Objects.submitButton.click();
	}
	public void getPendingLeaveRequest() {
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		actualMessage = Dashboard_Page_Objects.pendingLeaveRequest.getText();
	}
	
	@Test
	public void verifyPendingLeaveRequest() {
		
		Assert.assertEquals(actualMessage, "Leave Requests to Approve");
	}
}
