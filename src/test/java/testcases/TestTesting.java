package testcases;

import org.testng.annotations.Test;

public class TestTesting extends BaseTest {
	
	@Test
	public void firstTest() {
		log.debug("yeah!");
		System.out.println(config.getProp("gogo"));
	}
	
}
