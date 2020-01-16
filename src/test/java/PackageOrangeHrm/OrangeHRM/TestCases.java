package PackageOrangeHrm.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCases extends BrowserLaunch {

	@Test
	public void GetLink() {
		String sitename = driver.getTitle();
		System.out.println(sitename);
	}
	
}