package SelenideTests.DemoQaPageObject.Checkbox;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class Checkbox {

	public static final String websiteCheckbox = "https://demoqa.com/checkbox";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}

	@Test
	public void TestCheckboxSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/checkbox", () ->
		{
			open(websiteCheckbox);
		});

		step("2 Шаг: нажать на кнопку, раскрывающую Список Home", () ->
				$x(".//*[@class='rct-collapse rct-collapse-btn']").click());

		step("3 Шаг: нажать на кнопку, раскрывающую Список Documents в Home", () ->
				$x("(.//*[@class='rct-icon rct-icon-expand-close'])[2]").click());

		step("4 Шаг: нажать на кнопку, раскрывающую Список Office в Documents в Home", () ->
				$x("(.//*[@class='rct-icon rct-icon-expand-close'])[3]").click());

		step("5 Шаг: поставить чек-бокс в графе Public Списка Office в Documents в Home", () ->
				$x("(.//*[@class='rct-icon rct-icon-uncheck'])[6]").click());

	}

}