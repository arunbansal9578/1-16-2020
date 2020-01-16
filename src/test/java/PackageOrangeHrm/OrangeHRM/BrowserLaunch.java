package PackageOrangeHrm.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BrowserLaunch {
	WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {
		String DriverPath = System.getProperty("user.dir") + "\\src\\test\\java\\Browser_Driver\\chromedriver79.exe";
		System.setProperty("webdriver.chrome.driver", DriverPath);
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	
}
