package testcases;

import org.testng.annotations.Test;

public class testTest extends BaseTest {

	@Test
	public void firstTest() {
		System.out.println(config.getProp("gogo"));
	}
}
