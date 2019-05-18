package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginView {

	@FindBy(name = "userName")
	static WebElement username;

	@FindBy(name = "password")
	static WebElement password;

	@FindBy(name = "login")
	static WebElement loginButton;

	@FindBy(xpath = ".//*[@value='oneway']")
	static WebElement onewayRadio;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[1]/td/font")
	static WebElement text;

	public String registerTextWeb() {
		String registerText = text.getText();
		return registerText;
	}

	public boolean doLogin() {
		username.sendKeys("batman");
		password.sendKeys("batman");
		loginButton.click();

		return onewayRadio.isDisplayed();
	}

}
