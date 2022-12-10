package gitpack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitTest1 {
	@Test
	void git() {
	System.setProperty("webdriver.chrome.driver","C:\\drive\\chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	driver.get("https://kaplan.co.uk/");
	driver.manage().window().maximize();
	}
}
