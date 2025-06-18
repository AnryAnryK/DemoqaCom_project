package SelenideTestsPageObject.DemoQaPageObject.Wigets.Accordian;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class Accordian {

	public static final String websiteWebTables = "https://demoqa.com/accordian";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}


	@Test  // УСПЕШНО
	public void TestAccordianSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/accordian", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: Нажать на кнопку с текстом 'What is Lorem Ipsum?' ", () ->
		{
			$x(".//*[@class='card-header']").click();
		});

		step("3 Шаг: проверить закрытие окна (в DOM появляется тэг class=collapse и статус hidden) ", () ->
		{
			$x(".//*[@class='collapse']").shouldBe(hidden);
		});
	}
}


