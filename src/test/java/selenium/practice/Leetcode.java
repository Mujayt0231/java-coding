package selenium.practice;

import java.time.LocalDate;

import org.testng.annotations.Test;

public class Leetcode {

	@Test
	public void dateAndTimeTest() {

		LocalDate localDate = LocalDate.now().minusDays(3);

		System.out.println(localDate);

	}

}
