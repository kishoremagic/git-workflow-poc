package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

public static WebDriver driver;
	@Before
	public void setup()
	{
		
		if(driver==null)
		{
			System.out.println("In Base const : ");
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.add_argument('--disable-dev-shm-usage');
			options.add_argument('--ignore-ssl-errors=yes');
			options.add_argument('--ignore-certificate-errors');
			driver = new ChromeDriver(options);
			System.out.println(driver);
		}
	}
	
}
