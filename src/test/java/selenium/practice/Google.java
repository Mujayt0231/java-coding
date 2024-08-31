package selenium.practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Google {

	@Test
	public void backGroundColor() throws IOException {

		ChromeOptions op = new ChromeOptions();

		WebDriver driver = new ChromeDriver(op);

		Duration duration = driver.manage().timeouts().getImplicitWaitTimeout();

		System.out.println(duration.toSeconds());

		driver.navigate().refresh();

		driver.get("https://www.aapc.com/about-us/contact");
		String pageTitle = driver.getTitle();

		// driver.findElement();

		System.out.println(pageTitle);
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMDD");
		String timestamp = now.format(format);

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File fileDir = new File(System.getProperty("user.dir") + "screenshot_" + timestamp + ".png");
		FileUtils.copyFile(file, fileDir);

//		File elemScreenshot = driver.findElement(By.xpath("//input[@value=\"I'm Feeling Lucky\" and @role=\"button\"]"))
//				.getScreenshotAs(OutputType.FILE);

		// FileUtils.copyFile(elemScreenshot, fileDir);

		driver.quit();

	}

}
