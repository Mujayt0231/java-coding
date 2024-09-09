package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Locators {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.aapc.com/");

	}

	@Test
	public void shouldHaveBackGroundColorOfBlack() {
		String backgroundColor = driver.findElement(By.tagName("body")).getCssValue("background-color");
		System.out.println(backgroundColor);
		Assert.assertTrue(backgroundColor.contains("rgba(255, 255, 255, 1)"));
		driver.close();
	}

	@Test
	public void shouldHaveTitleOf() {

	}

	@Test
	public void shouldHaveFontOf() {

		String fontFamily = driver.findElement(By.xpath("//a[@title='Medical Coding Certification']"))
				.getCssValue("font-family");
		Assert.assertTrue(fontFamily.contains("'Montserrat', sans-serif"));
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
