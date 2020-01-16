package PackageOrangeHrm.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LaunchChrome {
	
@Test
public void launchChrome() {
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.google.com");
}
@Test
public void TestPass() {
	System.out.println("Test Case Pass");
}
}
