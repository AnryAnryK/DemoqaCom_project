package SelenideTestsPageObject.Components;

import SelenideTestsPageObject.SelenideTestsPageObjectTestBase;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Meta extends SelenideTestsPageObjectTestBase {


	private SelenideElement firstNameInput = $x(".//*[@id='firstName']");
	private SelenideElement lastNameInput = $x(".//*[@id='lastName']");

	public Meta setFirstNameInput(String value) {
		firstNameInput.setValue(value);
		return this;
	}

	public Meta setLastNameInput(String value) {
		lastNameInput.setValue(value);
		return this;
	}

}
