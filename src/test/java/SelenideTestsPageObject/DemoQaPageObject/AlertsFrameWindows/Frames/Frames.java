package SelenideTestsPageObject.DemoQaPageObject.AlertsFrameWindows.Frames;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class Frames {

	public static final String websiteWebTables = "https://demoqa.com/frames";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}


	@Test
	public void TestFrame1Successful() {  // тест с Frame1 падал, если его ставить вторым по счёту и если запускать оба теста одновременно через Класс. Проблема решилась, когда я поставил тест с Frame1 в начало !  УСПЕШНО !!
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/frames", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: найти на странице первый Frame (полностью видимый - индекс 1) с текстом 'This is a sample page' ", () ->
		{
			switchTo().frame(1);
			$x(".//*[@id='sampleHeading']").shouldHave(text("This is a sample page"));
		});
	}


	@Test
	public void TestFrame0Successful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/frames", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: найти на странице первый Frame (полностью видимый - индекс 0) с текстом 'This is a sample page' ", () ->
		{
			switchTo().frame(0);
			$x(".//*[@id='sampleHeading']").shouldHave(text("This is a sample page"));
		});
	}
}

