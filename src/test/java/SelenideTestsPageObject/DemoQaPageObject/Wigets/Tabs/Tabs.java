package SelenideTestsPageObject.DemoQaPageObject.Wigets.Tabs;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class Tabs {

	public static final String websiteWebTables = "https://demoqa.com/tabs";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}


	@Test  // УСПЕШНО
	public void TestTabsSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/tabs", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: Проверить наличие текста 'Lorem Ipsum is simply dummy text' ", () ->
		{
			$x(".//*[@class='fade tab-pane active show'][1]").shouldHave(text("Lorem Ipsum is simply dummy text"));
		});

		step("3 Шаг: Перейти на вкладку 'Origin' ", () ->
		{
			$x(".//*[@class='nav-item nav-link']").click();
		});

		step("4 Шаг: Проверить наличие текста 'Contrary to popular belief' ", () ->
		{
			$x(".//*[@class='fade tab-pane active show'][1]").shouldHave(text("Contrary to popular belief"));
		});

		step("5 Шаг: Перейти на вкладку 'Use' ", () ->
		{
			$x(".//*[@class='nav-item nav-link'][2]").click();
		});

		step("6 Шаг: Проверить наличие текста 'It is a long established fact' ", () ->
		{
			$x(".//*[@class='fade tab-pane active show'][1]").shouldHave(text("It is a long established fact"));
		});

	}
}


