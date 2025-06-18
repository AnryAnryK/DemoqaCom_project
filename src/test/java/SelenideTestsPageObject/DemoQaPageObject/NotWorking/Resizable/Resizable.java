package SelenideTestsPageObject.DemoQaPageObject.NotWorking.Resizable;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static io.qameta.allure.Allure.step;


public class Resizable {

	public static final String websiteWebTables = "https://demoqa.com/resizable";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}


	@Test  // УСПЕШНО
	public void TestResizableSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/resizable", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: Навести курсор на окно, которое способно менять размер ", () ->
		{
			$x(".//*[@class='box react-resizable']").click();
		});

		Object resizable =
				$x(".//*[@class='box react-resizable']");
		executeJavaScript("argument[0].setAttribute('width','333px')", resizable);
		executeJavaScript("argument[0].setAttribute('height','244px')", resizable);

			}
}


