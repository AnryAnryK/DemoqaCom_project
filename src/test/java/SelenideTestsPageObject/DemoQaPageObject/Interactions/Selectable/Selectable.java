package SelenideTestsPageObject.DemoQaPageObject.Interactions.Selectable;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class Selectable {

	public static final String websiteWebTables = "https://demoqa.com/selectable";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}


	@Test  // УСПЕШНО
	public void TestSelectableSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/selectable", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: Нажать на кнопку 'Cras justo odio' ", () ->
		{
			$x(".//*[@class='mt-2 list-group-item list-group-item-action'][1]").click();
		});

		step("3 Шаг: Проверить, что кнопка отмечена как нажатая (выделена цветом) ", () ->
		{
			$x(".//*[@class='mt-2 list-group-item active list-group-item-action'][1]").shouldHave(visible);
		});

		step("4 Шаг: Нажать на кнопку 'Dapibus ac facilisis in' ", () ->
		{
			$x(".//*[@class='mt-2 list-group-item list-group-item-action'][1]").click();
		});

		step("5 Шаг: Проверить, что кнопка отмечена как нажатая (выделена цветом) ", () ->
		{
			$x(".//*[@class='mt-2 list-group-item active list-group-item-action'][1]").shouldHave(visible);
		});

		step("6 Шаг: Нажать на кнопку 'Morbi leo risus' ", () ->
		{
			$x(".//*[@class='mt-2 list-group-item list-group-item-action'][1]").click();
		});

		step("7 Шаг: Проверить, что кнопка отмечена как нажатая (выделена цветом) ", () ->
		{
			$x(".//*[@class='mt-2 list-group-item active list-group-item-action'][1]").shouldHave(visible);
		});

		step("8 Шаг: Нажать на кнопку 'Porta ac consectetur ac' ", () ->
		{
			$x(".//*[@class='mt-2 list-group-item list-group-item-action'][1]").click();
		});

		step("9 Шаг: Проверить, что кнопка отмечена как нажатая (выделена цветом) ", () ->
		{
			$x(".//*[@class='mt-2 list-group-item active list-group-item-action'][1]").shouldHave(visible);
		});
	}
}


