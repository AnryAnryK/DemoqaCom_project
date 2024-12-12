package SelenideTestsPageObject.Components;

import SelenideTestsPageObject.SelenideTestsPageObjectTestBase;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Meta extends SelenideTestsPageObjectTestBase {



	private SelenideElement firstNameInput = $x(".//*[@id='firstName']");
	private SelenideElement lastNameInput = $x(".//*[@id='lastName']");
	private SelenideElement userEmailInput = $x(".//*[@id='userEmail']");
	private SelenideElement phoneNumber1Input = $x(".//*[@id='userNumber']");
	private SelenideElement currentAddressInput = $x(".//*[@id='currentAddress']");


	public Meta setFirstNameInput(String value) {
		firstNameInput.setValue(value);
		return this;
	}

	public Meta setLastNameInput(String value) {
		lastNameInput.setValue(value);
		return this;
	}

	public Meta setUserEmailInput(String value) {
		userEmailInput.setValue(value);
		return this;
	}

	public Meta setPhoneNumber1Input(int value) {
		phoneNumber1Input.setValue(String.valueOf(value));
		return this;
	}

	public Meta setCurrentAddressInput(String value) {
		currentAddressInput.setValue(value);
		return this;
	}

	public Meta getCheckResult(String key, String value) {
		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']");
		return this;
	}
}
