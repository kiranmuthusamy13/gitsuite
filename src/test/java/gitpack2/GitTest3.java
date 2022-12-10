package gitpack2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitTest3 {
	@Test
	void git3() {
		System.setProperty("webdriver.chrome.driver","C:\\drive\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		driver.get("https://kaplan.co.uk/");
		driver.manage().window().maximize();
	}

}
