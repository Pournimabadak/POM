package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class FlightFinderTest extends AbstractTest {

	// verify login
	@Test(priority = 0)
	public void verifylogin() {
		assertTrue(loginview.doLogin());

	}

	// verify Number Of FromPort Values
	@Test(priority = 1)
	public void verifyNumberOfFromPortValues() {
		assertTrue(flightfinderview.radio());

	}

	// verify dropdown values of from port
	@Test(priority = 2)
	public void verifyFromPort() {
		assertEquals(flightfinderview.getFromPortvalues(), flightfinderdata.wsFromPortValues());
	}

}
