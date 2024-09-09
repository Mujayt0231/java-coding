package selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTab {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
	}

	@Test
	public void multiTab() {

		driver = new ChromeDriver();
		driver.get("https://www.aapc.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));

		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(300)).ignoring(ElementNotInteractableException.class);

		w.until(d -> {
			driver.findElement(By.xpath("")).sendKeys("123");
			return true;
		});

	}
}
