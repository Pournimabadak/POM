package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightFinderView {

	@FindBy(xpath = ".//*[@value='roundtrip']")
	static WebElement roundtripRadio;

	@FindBy(xpath = ".//select[@name='fromPort']/option")
	static List<WebElement> fromPortValues;

	public boolean radio() {
		return roundtripRadio.isSelected();
	}

	ArrayList<String> fromPortValuesList = new ArrayList<>();

	public ArrayList<String> getFromPortvalues() {

		for (int i = 0; i < fromPortValues.size(); i++) {

			fromPortValuesList.add(fromPortValues.get(i).getText());
		}

		System.out.println(fromPortValuesList);
		return fromPortValuesList;
		

	}

}
