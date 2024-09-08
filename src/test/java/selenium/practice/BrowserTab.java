package selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrowserTab {

	@Test
	public void multiTab() {

		ChromeOptions op = new ChromeOptions();

		op.addArguments("--disable-notifications");

		op.addArguments("--incognito");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.aapc.com/");

		driver.quit();

	}
}
