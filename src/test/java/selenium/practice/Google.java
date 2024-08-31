package selenium.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Google {

	@Test
	public void backGroundColor() {

		ChromeOptions op = new ChromeOptions();
		op.setAcceptInsecureCerts(false);
		op.setPageLoadTimeout(Duration.ofSeconds(10));
		op.setImplicitWaitTimeout(Duration.ofSeconds(15));

		WebDriver driver = new ChromeDriver(op);

		driver.get("https://www.google.com/");
		String pageTitle = driver.getTitle();

		System.out.println(pageTitle);
		driver.quit();

	}

}
