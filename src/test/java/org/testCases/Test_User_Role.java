package org.testCases;

import org.BaseClass.BaseClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.pageObjects.User_Role_Page_Objects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_User_Role extends BaseClass {
Logger logger= Logger.getLogger(Test_User_Role.class);
	
	public void moveToUsersPage(){
		Actions actions= new Actions(driver);
		actions.moveToElement(User_Role_Page_Objects.adminlink);
		actions.moveToElement(User_Role_Page_Objects.userManagementLink);
		actions.moveToElement(User_Role_Page_Objects.userslink);
		actions.click().build().perform();
	}

	public void selectUserRole(){
		Select selectRole= new Select(User_Role_Page_Objects.userRole);
		selectRole.selectByIndex(1);
	}

	public void selectStatus(){
		Select selectStatus= new Select(User_Role_Page_Objects.userstatus);
		selectStatus.selectByIndex(1);
	}


	@Test
	public void checkUserRole(){
		PageFactory.initElements(driver, User_Role_Page_Objects.class);
		logger.info("Navigating to Users Page");
		moveToUsersPage();
		logger.info("Selecting the Users Role");
		selectUserRole();
		logger.info("Selecting the Status");
		selectStatus();	
		User_Role_Page_Objects.searchButton.click();

		String actualRole=User_Role_Page_Objects.userRoleValue.getText();
		String actualStatus=User_Role_Page_Objects.userstatusValue.getText();
		
		logger.info("Verifying the results");
		Assert.assertEquals(actualRole, "Admin");
		Assert.assertEquals(actualStatus, "Enabled");
		logger.info("End of Test_User_Role test case");

	}

}
