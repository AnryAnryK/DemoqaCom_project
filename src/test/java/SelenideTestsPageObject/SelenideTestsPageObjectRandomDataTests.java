package SelenideTestsPageObject;

import SelenideTestsPageObject.Components.Meta;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;

import static SelenideTestsPageObject.Components.RandomDataBase.getRandomEmail;
import static SelenideTestsPageObject.Components.RandomDataBase.getRandomString;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTestsPageObjectRandomDataTests extends Meta {

	Meta meta = new Meta();  // это - с PageObject с данными в пакете "Meta"


	@Test
	@Description("Успешный Автотест на проверку заполнения формы https://demoqa.com/automation-practice-form без Детализированного Отчёта")
	@Owner("Калинченко Андрей Дмитриевич")

	//	УСПЕШНО !!! (получен ожидаемый результат)


	public void SelenideTestsLombokTestsWithNoDetailReportSuccesfullTest() {


		// 1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form
		open(website + "automation-practice-form");

		// 2 Шаг: Заполнить форму // это - с PageObject с данными в пакете "Meta"


		String name2 = getRandomString(10), // можно и так
				surname2 = getRandomString(10), // можно и так
				email2 = getRandomEmail(); // можно и так

		meta.setFirstNameInput(name2)
				.setLastNameInput(surname2)
				.setUserEmailInput(email2)
				.setPhoneNumber1Input(phoneNumber1)
				.setCurrentAddressInput(adress1);

		$x(".//*[@class='practice-form-wrapper']").$(byText("Male")).click();
		$x(".//*[@id='dateOfBirthInput']").click();
		$x(".//*[@class='react-datepicker__month-select']").$(byText("January")).click();
		$x(".//*[@class='react-datepicker__year-select']").$(byText("1900")).click();
		$x(".//*[@class='react-datepicker__day react-datepicker__day--001']").click();
		$x(".//*[@id='subjectsInput']").setValue("English").pressEnter();
		$x(".//*[@id='hobbiesWrapper']").$(byText("Sports")).click();
		$x(".//*[@id='uploadPicture']").uploadFromClasspath("sampleFile1.jpeg");
		$x(".//*[@class=' css-1wa3eu0-placeholder']").scrollTo().click();
		$x(".//*[@id='stateCity-wrapper']").$(byText("Rajasthan")).click();
		$x(".//*[@class=' css-1wa3eu0-placeholder']").click();
		$x(".//*[@id='stateCity-wrapper']").$(byText("Jaiselmer")).click();
		$x(".//*[@id='submit']").click();


		// 3 Шаг: Проверить данные заполненной формы

		$x(".//*[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));

//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']").shouldHave(text(name1 + " " + surname1), text(email1), text(String.valueOf(phoneNumber1)), text(adress1));
		meta.getCheckResult("Student Name", "Mark Petrov")
				.getCheckResult("Student Email", "MarkPetrov@mail.com")
				.getCheckResult("Gender", "Male")
				.getCheckResult("Mobile", "1234567891")
				.getCheckResult("Date of Birth", "01 January,1900")
				.getCheckResult("Subjects", "English")
				.getCheckResult("Hobbies", "Sports")
				.getCheckResult("Address", "Russia, Moscow 1")
				.getCheckResult("State and City", "Rajasthan Jaiselmer");


	}
}


