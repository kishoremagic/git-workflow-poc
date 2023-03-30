package Utils;

import org.openqa.selenium.WebDriver;

import Pages.DashboardPage;
import Pages.LoginPage;
import StepDefinitions.BaseClass;

public class Context extends BaseClass {
	
	LoginPage loginPage;
	
	public Context()
	{
		setup();
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
//	public void InitializePageObject(WebDriver driver) {
//
//		
//
//		loginPage = new LoginPage(driver);
//
//		dashboardPage = new DashboardPage(driver);
//
//			
//
//	}
	
	public LoginPage getLoginPage()
	{
		if(loginPage==null)
		{
			System.out.println("Login page is null");
			//loginPage = new LoginPage(getDriver());
		}
		else {
			System.out.println("Login page is not null");

		}
		//System.out.println("Login page is "+loginPage);
		return loginPage;
	} 
	
	public DashboardPage getDashboardPage()
	{
		if(loginPage==null)
		{
			//dashboardPage = new DashboardPage(driver);
		}
		return dashboardPage;
	}
	
	
}