package SelenideTestsPageObject;

import SelenideTestsPageObject.Components.Meta;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTestsPageObjectTests extends Meta {

	Meta meta = new Meta();  // это - с PageObject с данными в пакете "Meta"


//	@Test
//	@Description("Успешный Автотест на проверку заполнения формы https://demoqa.com/automation-practice-form с Детализированным Отчётом")
//	@Owner("Калинченко Андрей Дмитриевич")
//
//
//	//	УСПЕШНО !!! (получен ожидаемый результат)
//
//	public void SelenideTestsLombokTestsWithDetailReportSuccesfullTest() {
//
//		// 1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form
//		step("1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form", () ->
//		{
//			open(website + "automation-practice-form");
//		});
//
//
//		// 2 Шаг: Заполнить форму
//		step("2 Шаг: Заполнить форму - Имя", () ->
//		{
//			$x(".//*[@id='firstName']").setValue(name1);
//		});
//
//		step("2 Шаг: Заполнить форму - Фамилию", () ->
//		{
//			$x(".//*[@id='lastName']").setValue(surname1);
//		});
//
//		step("2 Шаг: Заполнить форму - Электронную почту", () ->
//		{
//			$x(".//*[@id='userEmail']").setValue(email1);
//		});
//
//		step("2 Шаг: Заполнить форму - Пол", () ->
//		{
//			$x(".//*[@class='practice-form-wrapper']").$(byText("Male")).click();
//		});
//
//		step("2 Шаг: Заполнить форму - Телефон", () ->
//		{
//			$x(".//*[@id='userNumber']").setValue(String.valueOf(phoneNumber1));
//		});
//
//		step("2 Шаг: Заполнить форму - Дату рождения", () ->
//		{
//			$x(".//*[@id='dateOfBirthInput']").click();
//
//			$x(".//*[@class='react-datepicker__month-select']").$(byText("January")).click();
//			$x(".//*[@class='react-datepicker__year-select']").$(byText("1900")).click();
//			$x(".//*[@class='react-datepicker__day react-datepicker__day--001']").click();
//		});
//
//		step("2 Шаг: Заполнить форму - Предмет / Область знаний/работы", () ->
//		{
//			$x(".//*[@id='subjectsInput']").setValue("English").pressEnter();
//		});
//
//		step("2 Шаг: Заполнить форму - Хобби", () ->
//		{
//			$x(".//*[@id='hobbiesWrapper']").$(byText("Sports")).click();
//		});
//
//		step("2 Шаг: Заполнить форму - Загрузить/прикрепить файл в форму", () ->
//		{
//			$x(".//*[@id='uploadPicture']").uploadFromClasspath("sampleFile1.jpeg");
//		});
//
//		step("2 Шаг: Заполнить форму - Адрес", () ->
//		{
//			$x(".//*[@id='currentAddress']").setValue(adress1);
//		});
//
//		step("2 Шаг: Заполнить форму - Штат", () ->
//		{
//			$x(".//*[@class=' css-1wa3eu0-placeholder']").scrollTo().click();
//			$x(".//*[@id='stateCity-wrapper']").$(byText("Rajasthan")).click();
//		});
//
//		step("2 Шаг: Заполнить форму - Город", () ->
//		{
//			$x(".//*[@class=' css-1wa3eu0-placeholder']").click();
//			$x(".//*[@id='stateCity-wrapper']").$(byText("Jaiselmer")).click();
//			$x(".//*[@id='submit']").click();
//		});
//
//
//		// 3 Шаг: Проверить данные заполненной формы
//		step("3 Шаг: Проверить данные заполненной формы - наличие подтверждающей фразы 'Thanks for submitting the form'", () -> {
//			$x(".//*[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Имя и Фамилия - 'Mark Petrov'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Student Name"))
//					.sibling(0)
//					.shouldHave(text(name1 + " " + surname1));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Электронная почта - 'MarkPetrov@mail.com'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Student Email"))
//					.sibling(0)
//					.shouldHave(text(email1));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Пол - 'Male'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Gender"))
//					.sibling(0)
//					.shouldHave(text("Male"));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Телефон - '1234567891'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Mobile"))
//					.sibling(0)
//					.shouldHave(text(String.valueOf(phoneNumber1)));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Дата рождения - '01 January,1900'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Date of Birth"))
//					.sibling(0)
//					.shouldHave(
//							text("01 January,1900"));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Предмет / Область знаний/работы  - 'English'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Subjects"))
//					.sibling(0)
//					.shouldHave(text("English"));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Хобби - 'Sports'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Hobbies"))
//					.sibling(0)
//					.shouldHave(text("Sports"));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Picture - соответствует загруженной с названием 'sampleFile1.jpeg'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Picture"))
//					.sibling(0)
//					.shouldHave(text("sampleFile1.jpeg"));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Адрес - 'Russia, Moscow 1'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Address"))
//					.sibling(0)
//					.shouldHave(text(adress1));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Штат и Город - 'Rajasthan Jaiselmer'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "State and City"))
//					.sibling(0)
//					.shouldHave(text("Rajasthan Jaiselmer"));
//		});
////sleep(99999999);
//		//	УСПЕШНО !!! (получен ожидаемый результат)
//
//	}


//	@Test
//	@Description("НЕуспешный Автотест на проверку заполнения формы https://demoqa.com/automation-practice-form с Детализированным Отчётом")
//	@Owner("Калинченко Андрей Дмитриевич")
//	public void SelenideTestsLombokTestsWithDetailReportUnsuccesfullTest() {
//
//		//	УСПЕШНО !!! (получен ожидаемый результат)
//
//		// 1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form
//		step("1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form", () ->
//		{
//			open(website + "automation-practice-form");
//		});
//
//
//		// 2 Шаг: Заполнить форму
//		step("2 Шаг: Заполнить форму - Имя", () ->
//		{
//			$x(".//*[@id='firstName']").setValue(name1);
//		});
//
//		step("2 Шаг: Заполнить форму - Фамилию", () ->
//		{
//			$x(".//*[@id='lastName']").setValue(surname1);
//		});
//
//		step("2 Шаг: Заполнить форму - Электронную почту", () ->
//		{
//			$x(".//*[@id='userEmail']").setValue(email1);
//		});
//
//		step("2 Шаг: Заполнить форму - Пол", () ->
//		{
//			$x(".//*[@class='practice-form-wrapper']").$(byText("Male")).click();
//		});
//
//		step("2 Шаг: Заполнить форму - Телефон", () ->
//		{
//			$x(".//*[@id='userNumber']").setValue(String.valueOf(phoneNumber1));
//		});
//
//		step("2 Шаг: Заполнить форму - Дату рождения", () ->
//		{
//			$x(".//*[@id='dateOfBirthInput']").setValue("01.01.1990").pressEnter(); //намеренно убрал нажатие на локаторы "Дата"-"Месяц"-"Год" и поставил "ввести текст вручную" (т.к. ввод на сайте работает не корректно, то тест - падает при проверке)
//
//		});
//
//		step("2 Шаг: Заполнить форму - Предмет / Область знаний/работы", () ->
//		{
//			$x(".//*[@id='subjectsInput']").setValue("English").pressEnter();
//		});
//
//		step("2 Шаг: Заполнить форму - Хобби", () ->
//		{
//			$x(".//*[@id='hobbiesWrapper']").$(byText("Sports")).click();
//		});
//
//		step("2 Шаг: Заполнить форму - Загрузить/прикрепить файл в форму", () ->
//		{
//			$x(".//*[@id='uploadPicture']").uploadFromClasspath("sampleFile1.jpeg");
//		});
//
//		step("2 Шаг: Заполнить форму - Адрес", () ->
//		{
//			$x(".//*[@id='currentAddress']").setValue(adress1);
//		});
//
//		step("2 Шаг: Заполнить форму - Штат", () ->
//		{
//			$x(".//*[@class=' css-1wa3eu0-placeholder']").scrollTo().click();
//			$x(".//*[@id='stateCity-wrapper']").$(byText("Rajasthan")).click();
//		});
//
//		step("2 Шаг: Заполнить форму - Город", () ->
//		{
//			$x(".//*[@class=' css-1wa3eu0-placeholder']").click();
//			$x(".//*[@id='stateCity-wrapper']").$(byText("Jaiselmer")).click();
//			$x(".//*[@id='submit']").click();
//		});
//
//
//		// 3 Шаг: Проверить данные заполненной формы
//		step("3 Шаг: Проверить данные заполненной формы - наличие подтверждающей фразы 'Thanks for submitting the form'", () -> {
//			$x(".//*[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Имя и Фамилия - 'Mark Petrov'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Student Name"))
//					.sibling(0)
//					.shouldHave(text(name1 + " " + surname1));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Электронная почта - 'MarkPetrov@mail.com'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Student Email"))
//					.sibling(0)
//					.shouldHave(text(email1));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Пол - 'Male'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Gender"))
//					.sibling(0)
//					.shouldHave(text("Male"));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Телефон - '1234567891'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Mobile"))
//					.sibling(0)
//					.shouldHave(text(String.valueOf(phoneNumber1)));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Дата рождения - '01 January,1900'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Date of Birth"))
//					.sibling(0)
//					.shouldHave(
//							text("01 January,1900"));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Предмет / Область знаний/работы  - 'English'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Subjects"))
//					.sibling(0)
//					.shouldHave(text("English"));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Хобби - 'Sports'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Hobbies"))
//					.sibling(0)
//					.shouldHave(text("Sports"));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Picture - соответствует загруженной с названием 'sampleFile1.jpeg'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Picture"))
//					.sibling(0)
//					.shouldHave(text("sampleFile1.jpeg"));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Адрес - 'Russia, Moscow 1'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "Address"))
//					.sibling(0)
//					.shouldHave(text(adress1));
//		});
//
//		step("3 Шаг: Проверить данные заполненной формы - Штат и Город - 'Rajasthan Jaiselmer'", () -> {
//			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//					.$(byTagAndText("td", "State and City"))
//					.sibling(0)
//					.shouldHave(text("Rajasthan Jaiselmerk")); //сделал намеренную ошибку в проверке Города
//		});
////		sleep(99999999);
//		//	УСПЕШНО !!! (получен ожидаемый результат)
//
//	}

	@Test
	@Description("Успешный Автотест на проверку заполнения формы https://demoqa.com/automation-practice-form без Детализированного Отчёта")
	@Owner("Калинченко Андрей Дмитриевич")

	//	УСПЕШНО !!! (получен ожидаемый результат)

	public void SelenideTestsLombokTestsWithNoDetailReportSuccesfullTest() {
		// 1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form
		open(website + "automation-practice-form");

		// 2 Шаг: Заполнить форму // это - с PageObject с данными в пакете "Meta"

		meta.setFirstNameInput(name1);
		String name2 = "Mark2", // можно и так
				surname2 = "Petrov2", // можно и так
				email2 = "Mark2Petrov@mail.com"; // можно и так


		meta.setLastNameInput(surname1)
				.setUserEmailInput(email1)
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


		// БЫЛО до PageObject !!
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.shouldHave(text(name1 + " " + surname1), text(email1), text(String.valueOf(phoneNumber1)), text(adress1));  // код в Одну строку, но здесь проверяется просто наличие всех записей, но не соответствие Данных Одной колонки данным Другой соответствующей ей колонки


//				.$(byTagAndText("td", "Student Name"))  // а таким кодом как раз проверяется соответствие Данных Одной колонки данным Другой соответствующей ей колонки
//				.sibling(0)
//				.shouldHave(text(name1 + " " + surname1));
//				sleep(999999999);


//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Student Email"))
//				.sibling(0)
//				.shouldHave(text(email1));

//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Gender"))
//				.sibling(0)
//				.shouldHave(text("Male"));

//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Mobile"))
//				.sibling(0)
//				.shouldHave(text(String.valueOf(phoneNumber1)));

//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Date of Birth"))
//				.sibling(0)
//				.shouldHave(
//						text("01 January,1900"));
//
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Subjects"))
//				.sibling(0)
//				.shouldHave(text("English"));
//
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Hobbies"))
//				.sibling(0)
//				.shouldHave(text("Sports"));

//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Picture"))
//				.sibling(0)
//				.shouldHave(text("sampleFile1.jpeg"));

//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Address"))
//				.sibling(0)
//				.shouldHave(text(adress1));

//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "State and City"))
//				.sibling(0)
//				.shouldHave(text("Rajasthan Jaiselmer"));

//sleep(99999999);
		//	УСПЕШНО !!! (получен ожидаемый результат)

	}
}

//	@Test
//	@Description("Неуспешный Автотест на проверку заполнения формы https://demoqa.com/automation-practice-form без Детализированного Отчёта")
//	@Owner("Калинченко Андрей Дмитриевич")
//
//	//	УСПЕШНО !!! (получен ожидаемый результат)
//
//
//	public void SelenideTestsLombokTestsWithNoDetailReportUnsuccesfullTest() {
//
//		// 1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form
//		open(website + "automation-practice-form");
//
//		// 2 Шаг: Заполнить форму
//		$x(".//*[@id='firstName']").setValue(name1);
//
//		$x(".//*[@id='lastName']").setValue(surname1);
//
//		$x(".//*[@id='userEmail']").setValue(email1);
//
//		$x(".//*[@class='practice-form-wrapper']").$(byText("Male")).click();
//
//		$x(".//*[@id='userNumber']").setValue(String.valueOf(phoneNumber1));
//
//		$x(".//*[@id='dateOfBirthInput']").setValue("01.01.1990").pressEnter(); //намеренно убрал нажатие на локаторы "Дата"-"Месяц"-"Год" и поставил "ввести текст вручную" (т.к. ввод на сайте работает не корректно, то тест - падает при проверке)
//
//		$x(".//*[@id='subjectsInput']").setValue("English").pressEnter();
//
//
//		$x(".//*[@id='hobbiesWrapper']").$(byText("Sports")).click();
//
//		$x(".//*[@id='uploadPicture']").uploadFromClasspath("sampleFile1.jpeg");
//
//		$x(".//*[@id='currentAddress']").setValue(adress1);
//
//		$x(".//*[@class=' css-1wa3eu0-placeholder']").scrollTo().click();
//		$x(".//*[@id='stateCity-wrapper']").$(byText("Rajasthan")).click();
//
//		$x(".//*[@class=' css-1wa3eu0-placeholder']").click();
//		$x(".//*[@id='stateCity-wrapper']").$(byText("Jaiselmer")).click();
//		$x(".//*[@id='submit']").click();
//
//
//		// 3 Шаг: Проверить данные заполненной формы
//
//		$x(".//*[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));
//
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Student Name"))
//				.sibling(0)
//				.shouldHave(text(name1 + " " + surname1));
//
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Student Email"))
//				.sibling(0)
//				.shouldHave(text(email1));
//
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Gender"))
//				.sibling(0)
//				.shouldHave(text("Male"));
//
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Mobile"))
//				.sibling(0)
//				.shouldHave(text(String.valueOf(phoneNumber1)));
//
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Date of Birth"))
//				.sibling(0)
//				.shouldHave(
//						text("01 January,1900"));
//
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Subjects"))
//				.sibling(0)
//				.shouldHave(text("English"));
//
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Hobbies"))
//				.sibling(0)
//				.shouldHave(text("Sports"));
//
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Picture"))
//				.sibling(0)
//				.shouldHave(text("sampleFile1.jpeg"));
//
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "Address"))
//				.sibling(0)
//				.shouldHave(text(adress1));
//
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
//				.$(byTagAndText("td", "State and City"))
//				.sibling(0)
//				.shouldHave(text("Rajasthan Jaiselmerk")); //сделал намеренную ошибку в проверке Города
//
////sleep(99999999);
//		//	УСПЕШНО !!! (получен ожидаемый результат)
//
//	}
//
//}
//

