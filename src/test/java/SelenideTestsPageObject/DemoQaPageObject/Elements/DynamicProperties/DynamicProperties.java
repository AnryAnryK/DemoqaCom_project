package SelenideTestsPageObject.DemoQaPageObject.Elements.DynamicProperties;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class DynamicProperties {

	public static final String websiteWebTables = "https://demoqa.com/dynamic-properties";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}

	@Test
	public void TestDynamicPropertiesSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/dynamic-properties", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: дождаться появления надписи 'Color Change' ", () ->
				$x(".//*[@id='colorChange']").shouldHave(text(("Color Change")))); //успешно;  с shouldNotHave(visible)  - падает, т.е. тоже - верно
//				$x(".//*[@id='colorChange']").should(appear)); //успешно с shouldNot(appear)  - падает, т.е. тоже - верно
//				$x(".//*[@id='colorChange']").shouldBe(visible)); //успешно; с NotBe(visible)  - падает, т.е. тоже - верно
//				$x(".//*[@id='colorChange']").shouldNotBe(visible));  // с NotBe(visible)  - падает, т.е. тоже - верно

	}
}