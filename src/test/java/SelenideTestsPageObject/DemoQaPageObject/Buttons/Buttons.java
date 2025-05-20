package SelenideTestsPageObject.DemoQaPageObject.Buttons;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class Buttons {

	public static final String websiteWebTables = "https://demoqa.com/buttons";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}

	@Test
	public void TestButtonsSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/buttons", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: нажать на кнопку Double Click Me (двойной клик)", () ->
				$x(".//*[@id='doubleClickBtn']").doubleClick());

		step("3 Шаг: Проверить, что появилась надпись (You have done a double click)", () ->
				$x(".//*[@id='doubleClickMessage']").shouldHave(text("You have done a double click")));

		step("4 Шаг: нажать на кнопку Right Click Me (клик правой кнопкой мыши)", () ->
				$x(".//*[@id='rightClickBtn']").contextClick());

		step("5 Шаг: Проверить, что появилась надпись (You have done a right click)", () ->
				$x(".//*[@id='rightClickMessage']").shouldHave(text("You have done a right click")));

		step("6 Шаг: нажать на кнопку Click Me (клик левой кнопкой мыши)", () ->
				$x("(.//*[@class='btn btn-primary'])[3]").click());

		step("7 Шаг: Проверить, что появилась надпись (You have done a dynamic click)", () ->
				$x(".//*[@id='dynamicClickMessage']").shouldHave(text("You have done a dynamic click")));
	}

}