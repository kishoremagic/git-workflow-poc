package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private By searchBox = By.xpath("//*[@id="APjFqb"]");
	
	
	public LoginPage(){
		}
	
	
	public By getsearchBox() {
		return searchBox;
	}
	
	
}
