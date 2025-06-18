package SelenideTestsPageObject.DemoQaPageObject.Wigets.ToolTips;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class ToolTips {

	public static final String websiteWebTables = "https://demoqa.com/tool-tips";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}


	@Test  // УСПЕШНО
	public void TestToolTipsSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/tool-tips", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: Навести курсор (можно нажать) на кнопку 'Hover me to see' ", () ->
		{
			$x(".//*[@class='btn btn-success']").click();
		});

		step("3 Шаг: Проверить появление элемента ", () ->
		{
			$x(".//*[@aria-describedby='buttonToolTip']").shouldHave(text("Hover me to see"));
//			или можно так (но так и с 'enable', и с 'visible', и, даже с 'not visible' - работает, что, по-моему, неверно !
//			$x(".//*[@aria-describedby='buttonToolTip']").shouldHave(exist);
		});


	}
}


