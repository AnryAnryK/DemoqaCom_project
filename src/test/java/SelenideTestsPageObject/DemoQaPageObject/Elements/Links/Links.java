package SelenideTestsPageObject.DemoQaPageObject.Elements.Links;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class Links {

	public static final String websiteWebTables = "https://demoqa.com/links";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}

	@Test
	public void TestLinksSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/links", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: нажать на ссылку Home", () ->
				$x(".//*[@id='simpleLink']").click());

		step("3 Шаг: Перейти в новое окно, открытое по нажатой ссылке Home", () ->
				switchTo().window(1));

		step("4 Шаг: Проверить наличие логотипа /images/Toolsqa.jpg", () ->
				$x("(//a[@href])[1]").shouldHave(href("https://demoqa.com/")));
//				$(".//*[@href='https://demoqa.com/']").shouldHave(href("https://demoqa.com/"))); // пробовал с этим локатором, но не работало !
	}

}