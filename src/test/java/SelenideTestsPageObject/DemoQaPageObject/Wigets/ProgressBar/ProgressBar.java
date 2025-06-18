package SelenideTestsPageObject.DemoQaPageObject.Wigets.ProgressBar;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class ProgressBar {

	public static final String websiteWebTables = "https://demoqa.com/progress-bar";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}


	@Test  // УСПЕШНО
	public void TestProgressBarSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/progress-bar", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: Нажать на кнопку с текстом 'Start' ", () ->
		{
			$x(".//*[@id='startStopButton']").click();
		});

		step("3 Шаг: проверить, что строка Progress Bar заполняется % выполнения (не пустой) ", () ->
		{
			$x(".//*[@id='progressBar']").shouldBe(not(empty));
		});

		sleep(6666); // КАК ЧЕМ можно заменить ?

		step("4 Шаг: проверить, что появилась кнопка Reset ", () ->
		{
			$x(".//*[@id='resetButton']").shouldBe(visible);
		});
	}
}


