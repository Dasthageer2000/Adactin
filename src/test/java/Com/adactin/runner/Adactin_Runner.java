package Com.adactin.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import Com.adactin_baseclass.Adactin_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//Com//Adactin//feature", glue = "Com.adactin.stepdefinition", plugin = {
		"html:Report/Html_Report", "pretty", "json:Report/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Report.html" })

public class Adactin_Runner {

//	public static void main(String[] args) {
//		
//		browser_launch("chrome");
//		url("https://adactinhotelapp.com/");
//	
//	}
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void browser_close() {

		driver.close();

	}

}
