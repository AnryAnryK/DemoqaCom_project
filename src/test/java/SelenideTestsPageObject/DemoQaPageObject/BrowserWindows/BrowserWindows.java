package SelenideTestsPageObject.DemoQaPageObject.BrowserWindows;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class BrowserWindows {

	public static final String websiteWebTables = "https://demoqa.com/browser-windows";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}

	@Test
	public void TestBrowserWindowsNewTabSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/browser-windows", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: нажать на кнопку 'New Tab' ", () ->
				$x(".//*[@id='tabButton']").click());

		step("3 Шаг: проверить, что открылось новое окно (перейти в него) ", () ->
				Selenide.switchTo().window(1));

	}

	@Test
	public void TestBrowserWindowsNewWindowSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/browser-windows", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: нажать на кнопку 'New Window' ", () ->
				$x(".//*[@id='windowButton']").click());

		step("3 Шаг: проверить, что открылось новое окно (перейти в него) ", () ->
				Selenide.switchTo().window(1));

		step("4 Шаг: проверить наличие текста 'This is a sample page' ", () ->
				$x(".//*[@id='sampleHeading']").shouldHave(text("This is a sample page")));


	}

	@Test
	public void TestBrowserWindowsNewWindowMessageSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/browser-windows", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: нажать на кнопку 'New Window' ", () ->
				$x(".//*[@id='messageWindowButton']").click());

		step("3 Шаг: проверить, что открылось новое окно (перейти в него) ", () ->
				Selenide.switchTo().window(1));

		step("4 Шаг: проверить наличие текста 'Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.'", () ->
				Selenide.switchTo().frame($(byTagAndText("body","Knowledge")).shouldHave(text("Knowledge"))));

//		step("4 Шаг: проверить наличие текста 'Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.'", () ->
//				Selenide.switchTo().frame($x("/html/body/text()")));

//			step("4 Шаг: проверить наличие текста 'Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.'", () ->
//					$(byTagAndText("body","Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.")));  //этот вариант - проходит, даже если совсем убрать значение аттрибута (т.е. что-то тут некорректно !)
	}

}