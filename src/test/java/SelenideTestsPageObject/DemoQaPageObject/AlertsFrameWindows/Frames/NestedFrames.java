package SelenideTestsPageObject.DemoQaPageObject.AlertsFrameWindows.Frames;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class NestedFrames {

	public static final String websiteWebTables = "https://demoqa.com/nestedframes";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}


	@Test
	public void TestNestedFramesSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/nestedframes", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: найти на странице первый 'Parent frame' ", () ->
		{
			switchTo().frame(0);
			$(byTagAndText("body", "Parent frame")).shouldHave(text("Parent frame"));
		});

		step("3 Шаг: найти на странице первый 'Child Iframe' ", () ->
		{
			switchTo().frame(0);
//			switchTo().innerFrame(String.valueOf("p"));
			$(byTagAndText("p", "Child Iframe")).shouldHave(text("Child Iframe"));
		});
	}
}


