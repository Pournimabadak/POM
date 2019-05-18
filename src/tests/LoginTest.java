package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;


public class LoginTest extends AbstractTest {

	@Test(priority = 1)
	public void textVerify() {

		assertEquals(loginview.registerTextWeb(), logindata.registerText());

	}

	@Test(priority = 2)
	public void verifylogin() {
		assertTrue(loginview.doLogin());

	}

}
