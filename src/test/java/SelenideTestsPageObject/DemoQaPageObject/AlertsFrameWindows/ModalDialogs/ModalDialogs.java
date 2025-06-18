package SelenideTestsPageObject.DemoQaPageObject.AlertsFrameWindows.ModalDialogs;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class ModalDialogs {

	public static final String websiteWebTables = "https://demoqa.com/modal-dialogs";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}


	@Test
	public void TestSmallModalDialogSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/modal-dialogs", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: Нажать на кнопку 'Small modal' ", () ->
		{
			$x(".//*[@id='showSmallModal']").click();
		});

		step("3 Шаг: проверить появление окна с текстом 'This is a small modal. It has very less content' ", () ->
		{
			switchTo().window(0);
			$x(".//*[@class='modal-body']").shouldHave(text("This is a small modal. It has very less content"));
		});

	}

	@Test
	public void TestLadgeModalDialogSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/modal-dialogs", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: Нажать на кнопку 'Large modal' ", () ->
		{
			$x(".//*[@id='showLargeModal']").click();
		});


		step("3 Шаг: проверить появление окна с текстом 'Lorem Ipsum is simply dummy text' ", () ->
		{
			switchTo().window(0);
			$x(".//*[contains(text(),'Lorem Ipsum is simply dummy text')]").shouldHave(text("Lorem Ipsum is simply dummy text"));
		});
	}
}

