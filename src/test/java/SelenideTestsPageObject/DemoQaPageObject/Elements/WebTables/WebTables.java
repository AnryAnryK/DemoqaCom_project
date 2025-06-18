package SelenideTestsPageObject.DemoQaPageObject.Elements.WebTables;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class WebTables {

	public static final String websiteWebTables = "https://demoqa.com/webtables";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}

	@Test
	public void TestWebTablesSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/webtables", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: нажать на кнопку Add (для создания новой записи)", () ->
				$x(".//*[@class='btn btn-primary']").click());

		step("3 Шаг: Заполнить First Name", () ->
				$x(".//*[@placeholder='First Name']").setValue("Aa"));

		step("4 Шаг: Заполнить Last Name", () ->
				$x(".//*[@placeholder='Last Name']").setValue("Bb"));

		step("5 Шаг: Заполнить Email", () ->
				$x(".//*[@placeholder='name@example.com']").setValue("AaBb@email.com"));

		step("6 Шаг: Заполнить Age", () ->
				$x(".//*[@placeholder='Age']").setValue(String.valueOf(1)));

		step("7 Шаг: Заполнить Salary", () ->
				$x(".//*[@placeholder='Salary']").setValue(String.valueOf(0)));

		step("8 Шаг: Заполнить Department", () ->
				$x(".//*[@placeholder='Department']").setValue("department1"));

		step("9 Шаг: Нажать кнопку Submit", () ->
				$x(".//*[@id='submit']").click());

		step("10 Шаг: Подтверждение того, что запись появилась", () ->
				$x(".//*[@class='col-12 mt-4 col-md-6']").shouldHave(text("AaBb@email.com")));

		step("11 Шаг: Нажать на 'бегунок' и 'протащить его' до конца направо, чтобы проверить наличие текста 'department1' ", () ->
				$x(".//*[@class='rt-table']").scrollTo()).shouldHave(text("department1"));

	}

}