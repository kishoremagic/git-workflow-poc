package StepDefinitions;

import static org.junit.Assert.assertThat;

import java.util.concurrent.TimeUnit;

import org.hamcrest.core.StringContains;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleSearch {
	
	WebDriver driver;
	LoginPage loginPage = new LoginPage();
	BaseClass base;
	public GoogleSearch(BaseClass base)
    {
        this.base = base;
        driver = base.driver;
	    System.out.println("In 1st const : "+base.driver);
    }
	
	@Given("Google is loaded")
	public void google_is_loaded() {
		System.out.println("Inside Step - Google is loaded");
		System.out.println(driver);
		driver.get("https://www.google.com/");
		//context.openBaseUrl();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	
	@Then("Search for iselect")
	public void search_for_iselect() {
		System.out.println("Inside Step - Language is en-GB");
		driver.findElement(loginPage.getsearchBox()).sendKeys("iselect");
		driver.quit();
	}
}
