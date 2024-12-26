package SelenideTestsPageObject;

import SelenideTestsPageObject.Components.Meta;
import SelenideTestsPageObject.Components.MetaJavaFaker;
import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SelenideTestsPageObjectJavaFakerTests extends MetaJavaFaker {

	Meta meta = new Meta();  // это - с PageObject с данными в пакете "Meta"


	@Test
	@Description("Успешный Автотест на проверку заполнения формы https://demoqa.com/automation-practice-form без Детализированного Отчёта")
	@Owner("Калинченко Андрей Дмитриевич")

	//	УСПЕШНО !!! (получен ожидаемый результат)


	public void SelenideTestsLombokTestsWithNoDetailReportSuccesfullTest() {


		// 1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form
		open(website + "automation-practice-form");

		// 2 Шаг: Заполнить форму // это - с PageObject с данными в пакете "MetaJavaFaker"

		Faker faker = new Faker(new Locale("pl"));  // new Locale - дает возможность получать данные на ЛЮБОМ языке мира (здесь пример "pl" - польского языка) - на ГитХаб можно посмотреть здесь: https://github.com/DiUS/java-faker?tab=readme-ov-file

		MetaJavaFaker metaJavaFaker = new MetaJavaFaker();

// вариант JavaFaker:
//		String firstName = faker.name().firstName(); // Emory
//		String lastName = faker.name().lastName(); // Barton
//		String email = faker.internet().emailAddress(); //
//		long phoneNumber = getRandomphoneNumber(0000000001L, 9999999999L); // можно и так
//		String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

		$x(".//*[@id='firstName']").setValue(metaJavaFaker.firstName); // или $x(".//*[@id='firstName']").setValue(new metaJavaFaker().firstName)

		metaJavaFaker.setFirstNameInput(firstName)
				.setLastNameInput(lastName)
				.setUserEmailInput(email)
				.setPhoneNumber2Input(phoneNumber)
				.setCurrentAddressInput(streetAddress);


//sleep(999999999);

		$x(".//*[@class='practice-form-wrapper']").$(byText("Male")).click();
		$x(".//*[@id='dateOfBirthInput']").click();
		$x(".//*[@class='react-datepicker__month-select']").$(byText("January")).click();
		$x(".//*[@class='react-datepicker__year-select']").$(byText("1900")).click();
		$x(".//*[@class='react-datepicker__day react-datepicker__day--001']").click();
		//
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

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']").shouldHave(text(firstName + " " + lastName), text(email), text(String.valueOf(phoneNumber)), text(streetAddress));

	}
}


