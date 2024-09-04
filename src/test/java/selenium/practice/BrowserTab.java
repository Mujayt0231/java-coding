package selenium.practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserTab {

	@Test
	public void multiTab() {

		WebDriver driver = new ChromeDriver();
		String currentWindow = driver.getWindowHandle();

		Set<String> windowHandles = driver.getWindowHandles();

	}
}
