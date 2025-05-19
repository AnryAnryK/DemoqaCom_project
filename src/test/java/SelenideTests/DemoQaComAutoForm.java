package SelenideTests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static io.qameta.allure.Allure.step;

class DemoQaComAutoForm extends DemoQaComAutoFormTestBase {


	private ArrayList name;
	private List<String> surname;

	@Test
	@Description("Успешный Автотест на проверку заполнения формы https://demoqa.com/automation-practice-form с Детализированным Отчётом")
	@Owner("Калинченко Андрей Дмитриевич")


	//	УСПЕШНО !!! (получен ожидаемый результат)

	public void SelenideTestsLombokTestsWithDetailReportSuccesfullTest() {

		// 1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form
		step("1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form", (Runnable) () ->
		{
			open(website + "automation-practice-form");
		});


		// 2 Шаг: Заполнить форму
		step("2 Шаг: Заполнить форму - Имя", (Runnable) () ->
		{
			$x(".//*[@id='firstName']").setValue(name1);
		});

		step("2 Шаг: Заполнить форму - Фамилию", (Runnable) () ->
		{
			$x(".//*[@id='lastName']").setValue(surname1);
		});

		step("2 Шаг: Заполнить форму - Электронную почту", (Runnable) () ->
		{
			$x(".//*[@id='userEmail']").setValue(email1);
		});

		step("2 Шаг: Заполнить форму - Пол", (Runnable) () ->
		{
			$x(".//*[@class='practice-form-wrapper']").$(byText("Male")).click();
		});

		step("2 Шаг: Заполнить форму - Телефон", (Runnable) () ->
		{
			$x(".//*[@id='userNumber']").setValue(String.valueOf(phoneNumber1));
		});

		step("2 Шаг: Заполнить форму - Дату рождения", (Runnable) ->
		{
			$x(".//*[@id='dateOfBirthInput']").click();

			$x(".//*[@class='react-datepicker__month-select']").$(byText("January")).click();
			$x(".//*[@class='react-datepicker__year-select']").$(byText("1900")).click();
			$x(".//*[@class='react-datepicker__day react-datepicker__day--001']").click();
		});

		step("2 Шаг: Заполнить форму - Предмет / Область знаний/работы", (Runnable) ->
		{
			$x(".//*[@id='subjectsInput']").setValue("English").pressEnter();
		});

		step("2 Шаг: Заполнить форму - Хобби", (Runnable) ->
		{
			$x(".//*[@id='hobbiesWrapper']").$(byText("Sports")).click();
		});

		step("2 Шаг: Заполнить форму - Загрузить/прикрепить файл в форму", (Runnable) ->
		{
			$x(".//*[@id='uploadPicture']").uploadFromClasspath("sampleFile1.jpeg");
		});

		step("2 Шаг: Заполнить форму - Адрес", (Runnable) ->
		{
			$x(".//*[@id='currentAddress']").setValue(adress1);
		});

		step("2 Шаг: Заполнить форму - Штат", (Runnable) ->
		{
			$x(".//*[@class=' css-1wa3eu0-placeholder']").scrollTo().click();;
			$x(".//*[@id='stateCity-wrapper']").$(byText("Rajasthan")).click();
		});

		step("2 Шаг: Заполнить форму - Город", (Runnable) ->
		{
			$x(".//*[@class=' css-1wa3eu0-placeholder']").scrollTo().click();
			$x(".//*[@id='stateCity-wrapper']").$(byText("Jaiselmer")).click();
			$x(".//*[@id='submit']").click();
		});


		// 3 Шаг: Проверить данные заполненной формы
		step("3 Шаг: Проверить данные заполненной формы - наличие подтверждающей фразы 'Thanks for submitting the form'", (Runnable) -> {
			$x(".//*[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Имя и Фамилия - 'Mark Petrov'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Student Name"))
					.sibling(0)
					.shouldHave(text(name1 + " " + surname1));
		});

		step("3 Шаг: Проверить данные заполненной формы - Электронная почта - 'MarkPetrov@mail.com'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Student Email"))
					.sibling(0)
					.shouldHave(text(email1));
		});

		step("3 Шаг: Проверить данные заполненной формы - Пол - 'Male'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Gender"))
					.sibling(0)
					.shouldHave(text("Male"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Телефон - '1234567891'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Mobile"))
					.sibling(0)
					.shouldHave(text(String.valueOf(phoneNumber1)));
		});

		step("3 Шаг: Проверить данные заполненной формы - Дата рождения - '01 January,1900'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Date of Birth"))
					.sibling(0)
					.shouldHave(
							text("01 January,1900"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Предмет / Область знаний/работы  - 'English'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Subjects"))
					.sibling(0)
					.shouldHave(text("English"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Хобби - 'Sports'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Hobbies"))
					.sibling(0)
					.shouldHave(text("Sports"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Picture - соответствует загруженной с названием 'sampleFile1.jpeg'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Picture"))
					.sibling(0)
					.shouldHave(text("sampleFile1.jpeg"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Адрес - 'Russia, Moscow 1'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Address"))
					.sibling(0)
					.shouldHave(text(adress1));
		});

		step("3 Шаг: Проверить данные заполненной формы - Штат и Город - 'Rajasthan Jaiselmer'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "State and City"))
					.sibling(0)
					.shouldHave(text("Rajasthan Jaiselmer"));
		});
//sleep(99999999);
		//	УСПЕШНО !!! (получен ожидаемый результат)

	}


	@Test
	@Description("НЕуспешный Автотест на проверку заполнения формы https://demoqa.com/automation-practice-form с Детализированным Отчётом")
	@Owner("Калинченко Андрей Дмитриевич")
	public void SelenideTestsLombokTestsWithDetailReportUnsuccesfullTest() {

		//	УСПЕШНО !!! (получен ожидаемый результат)

		// 1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form
		step("1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form", (Runnable) ->
		{
			open(website + "automation-practice-form");
		});


		// 2 Шаг: Заполнить форму
		step("2 Шаг: Заполнить форму - Имя", (Runnable) ->
		{
			$x(".//*[@id='firstName']").setValue(name1);
		});

		step("2 Шаг: Заполнить форму - Фамилию", (Runnable) ->
		{
			$x(".//*[@id='lastName']").setValue(surname1);
		});

		step("2 Шаг: Заполнить форму - Электронную почту", (Runnable) ->
		{
			$x(".//*[@id='userEmail']").setValue(email1);
		});

		step("2 Шаг: Заполнить форму - Пол", (Runnable) ->
		{
			$x(".//*[@class='practice-form-wrapper']").$(byText("Male")).click();
		});

		step("2 Шаг: Заполнить форму - Телефон", (Runnable) ->
		{
			$x(".//*[@id='userNumber']").setValue(String.valueOf(phoneNumber1));
		});

		step("2 Шаг: Заполнить форму - Дату рождения", (Runnable) ->
		{
			$x(".//*[@id='dateOfBirthInput']").setValue("01.01.1990").pressEnter(); //намеренно убрал нажатие на локаторы "Дата"-"Месяц"-"Год" и поставил "ввести текст вручную" (т.к. ввод на сайте работает не корректно, то тест - падает при проверке)

		});

		step("2 Шаг: Заполнить форму - Предмет / Область знаний/работы", (Runnable) ->
		{
			$x(".//*[@id='subjectsInput']").setValue("English").pressEnter();
		});

		step("2 Шаг: Заполнить форму - Хобби", (Runnable) ->
		{
			$x(".//*[@id='hobbiesWrapper']").$(byText("Sports")).click();
		});

		step("2 Шаг: Заполнить форму - Загрузить/прикрепить файл в форму", (Runnable) ->
		{
			$x(".//*[@id='uploadPicture']").uploadFromClasspath("sampleFile1.jpeg");
		});

		step("2 Шаг: Заполнить форму - Адрес", (Runnable) ->
		{
			$x(".//*[@id='currentAddress']").setValue(adress1);
		});

		step("2 Шаг: Заполнить форму - Штат", (Runnable) ->
		{
			$x(".//*[@class=' css-1wa3eu0-placeholder']").scrollTo().click();
			$x(".//*[@id='stateCity-wrapper']").$(byText("Rajasthan")).click();
		});

		step("2 Шаг: Заполнить форму - Город", (Runnable) ->
		{
			$x(".//*[@class=' css-1wa3eu0-placeholder']").scrollTo().click();
			$x(".//*[@id='stateCity-wrapper']").$(byText("Jaiselmer")).click();
			$x(".//*[@id='submit']").click();
		});


		// 3 Шаг: Проверить данные заполненной формы
		step("3 Шаг: Проверить данные заполненной формы - наличие подтверждающей фразы 'Thanks for submitting the form'", (Runnable) -> {
			$x(".//*[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Имя и Фамилия - 'Mark Petrov'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Student Name"))
					.sibling(0)
					.shouldHave(text(name1 + " " + surname1));
		});

		step("3 Шаг: Проверить данные заполненной формы - Электронная почта - 'MarkPetrov@mail.com'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Student Email"))
					.sibling(0)
					.shouldHave(text(email1));
		});

		step("3 Шаг: Проверить данные заполненной формы - Пол - 'Male'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Gender"))
					.sibling(0)
					.shouldHave(text("Male"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Телефон - '1234567891'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Mobile"))
					.sibling(0)
					.shouldHave(text(String.valueOf(phoneNumber1)));
		});

		step("3 Шаг: Проверить данные заполненной формы - Дата рождения - '01 January,1900'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Date of Birth"))
					.sibling(0)
					.shouldHave(
							text("01 January,1900"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Предмет / Область знаний/работы  - 'English'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Subjects"))
					.sibling(0)
					.shouldHave(text("English"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Хобби - 'Sports'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Hobbies"))
					.sibling(0)
					.shouldHave(text("Sports"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Picture - соответствует загруженной с названием 'sampleFile1.jpeg'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Picture"))
					.sibling(0)
					.shouldHave(text("sampleFile1.jpeg"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Адрес - 'Russia, Moscow 1'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Address"))
					.sibling(0)
					.shouldHave(text(adress1));
		});

		step("3 Шаг: Проверить данные заполненной формы - Штат и Город - 'Rajasthan Jaiselmer'", (Runnable) -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "State and City"))
					.sibling(0)
					.shouldHave(text("Rajasthan Jaiselmerk")); //сделал намеренную ошибку в проверке Города
		});
//		sleep(99999999);
		//	УСПЕШНО !!! (получен ожидаемый результат)

	}

	@Test
	@Description("Успешный Автотест на проверку заполнения формы https://demoqa.com/automation-practice-form без Детализированного Отчёта")
	@Owner("Калинченко Андрей Дмитриевич")

	//	УСПЕШНО !!! (получен ожидаемый результат)

	public void SelenideTestsLombokTestsWithNoDetailReportSuccesfullTest() {

		// 1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form
		open(website + "automation-practice-form");

		// 2 Шаг: Заполнить форму
		$x(".//*[@id='firstName']").setValue(name1);

		$x(".//*[@id='lastName']").setValue(surname1);

		$x(".//*[@id='userEmail']").setValue(email1);

		$x(".//*[@class='practice-form-wrapper']").$(byText("Male")).click();

		$x(".//*[@id='userNumber']").setValue(String.valueOf(phoneNumber1));

		$x(".//*[@id='dateOfBirthInput']").click();

		$x(".//*[@class='react-datepicker__month-select']").$(byText("January")).click();
		$x(".//*[@class='react-datepicker__year-select']").$(byText("1900")).click();
		$x(".//*[@class='react-datepicker__day react-datepicker__day--001']").click();

		$x(".//*[@id='subjectsInput']").setValue("English").pressEnter();


		$x(".//*[@id='hobbiesWrapper']").$(byText("Sports")).click();

		$x(".//*[@id='uploadPicture']").uploadFromClasspath("sampleFile1.jpeg");

		$x(".//*[@id='currentAddress']").setValue(adress1);

		$x(".//*[@class=' css-1wa3eu0-placeholder']").scrollTo().click();
		$x(".//*[@id='stateCity-wrapper']").$(byText("Rajasthan")).click();

		$x(".//*[@class=' css-1wa3eu0-placeholder']").scrollTo().click();
		$x(".//*[@id='stateCity-wrapper']").$(byText("Jaiselmer")).click();
		$x(".//*[@id='submit']").click();


		// 3 Шаг: Проверить данные заполненной формы

		$x(".//*[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Student Name"))
				.sibling(0)
				.shouldHave(text(name1 + " " + surname1));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Student Email"))
				.sibling(0)
				.shouldHave(text(email1));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Gender"))
				.sibling(0)
				.shouldHave(text("Male"));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Mobile"))
				.sibling(0)
				.shouldHave(text(String.valueOf(phoneNumber1)));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Date of Birth"))
				.sibling(0)
				.shouldHave(
						text("01 January,1900"));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Subjects"))
				.sibling(0)
				.shouldHave(text("English"));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Hobbies"))
				.sibling(0)
				.shouldHave(text("Sports"));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Picture"))
				.sibling(0)
				.shouldHave(text("sampleFile1.jpeg"));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Address"))
				.sibling(0)
				.shouldHave(text(adress1));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "State and City"))
				.sibling(0)
				.shouldHave(text("Rajasthan Jaiselmer"));

//sleep(99999999);
		//	УСПЕШНО !!! (получен ожидаемый результат)

	}

	@Test
	@Description("Неуспешный Автотест на проверку заполнения формы https://demoqa.com/automation-practice-form без Детализированного Отчёта")
	@Owner("Калинченко Андрей Дмитриевич")

	//	УСПЕШНО !!! (получен ожидаемый результат)


	public void SelenideTestsLombokTestsWithNoDetailReportUnsuccesfullTest() {

		// 1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form
		open(website + "automation-practice-form");

		// 2 Шаг: Заполнить форму
		$x(".//*[@id='firstName']").setValue(name1);

		$x(".//*[@id='lastName']").setValue(surname1);

		$x(".//*[@id='userEmail']").setValue(email1);

		$x(".//*[@class='practice-form-wrapper']").$(byText("Male")).click();

		$x(".//*[@id='userNumber']").setValue(String.valueOf(phoneNumber1));

		$x(".//*[@id='dateOfBirthInput']").setValue("01.01.1990").pressEnter(); //намеренно убрал нажатие на локаторы "Дата"-"Месяц"-"Год" и поставил "ввести текст вручную" (т.к. ввод на сайте работает не корректно, то тест - падает при проверке)

		$x(".//*[@id='subjectsInput']").setValue("English").pressEnter();


		$x(".//*[@id='hobbiesWrapper']").$(byText("Sports")).click();

		$x(".//*[@id='uploadPicture']").uploadFromClasspath("sampleFile1.jpeg");

		$x(".//*[@id='currentAddress']").setValue(adress1);

		$x(".//*[@class=' css-1wa3eu0-placeholder']").scrollTo().click();
		$x(".//*[@id='stateCity-wrapper']").$(byText("Rajasthan")).click();

		$x(".//*[@class=' css-1wa3eu0-placeholder']").scrollTo().click();
		$x(".//*[@id='stateCity-wrapper']").$(byText("Jaiselmer")).click();
		$x(".//*[@id='submit']").click();


		// 3 Шаг: Проверить данные заполненной формы

		$x(".//*[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Student Name"))
				.sibling(0)
				.shouldHave(text(name1 + " " + surname1));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Student Email"))
				.sibling(0)
				.shouldHave(text(email1));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Gender"))
				.sibling(0)
				.shouldHave(text("Male"));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Mobile"))
				.sibling(0)
				.shouldHave(text(String.valueOf(phoneNumber1)));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Date of Birth"))
				.sibling(0)
				.shouldHave(
						text("01 January,1900"));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Subjects"))
				.sibling(0)
				.shouldHave(text("English"));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Hobbies"))
				.sibling(0)
				.shouldHave(text("Sports"));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Picture"))
				.sibling(0)
				.shouldHave(text("sampleFile1.jpeg"));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "Address"))
				.sibling(0)
				.shouldHave(text(adress1));

		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
				.$(byTagAndText("td", "State and City"))
				.sibling(0)
				.shouldHave(text("Rajasthan Jaiselmerk")); //сделал намеренную ошибку в проверке Города

//sleep(99999999);
		//	УСПЕШНО !!! (получен ожидаемый результат)

	}

}

