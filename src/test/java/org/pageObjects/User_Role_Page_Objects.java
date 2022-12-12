package org.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Role_Page_Objects {
	@FindBy (id="searchSystemuser_userName")
	public static WebElement userName;
	@FindBy (id="searchSystemuser_userType")
	public static WebElement userRole;
	@FindBy(id="searchSystemuser_status")
	public static WebElement userstatus;
	@FindBy(id="searchBtn")
	public static WebElement searchButton;
	@FindBy(xpath="//tr/td[3]")
	public static WebElement userRoleValue;
	@FindBy (xpath="//tr/td[5]")
	public static WebElement userstatusValue;
	@FindBy(linkText="Admin")
	public static WebElement adminlink;
	@FindBy(linkText="User Hanagement")
	public static WebElement userManagementLink;
	@FindBy (linkText="Users")
	public static WebElement userslink;
}
