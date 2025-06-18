package SelenideTestsPageObject.DemoQaPageObject.AlertsFrameWindows;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class Alerts {

	public static final String websiteWebTables = "https://demoqa.com/alerts";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}

	@Test
	public void TestClickButtonAlertSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/alerts", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: нажать на кнопку 'Click me' с описанием 'Click Button to see alert' ", () ->
				$x(".//*[@id='alertButton']").click());

		step("3 Шаг: проверить, что открылось новое окно с текстом 'You clicked a button' ", () ->  //текст 'Подтвердите действие на demoqa.com' в Assert не нужно включать
		{
			Alert ClickMelAlert = switchTo().alert();
			String ClickMelAlert_text = ClickMelAlert.getText();
			System.out.println(ClickMelAlert_text);

			Assertions.assertEquals("You clicked a button", ClickMelAlert_text);
			ClickMelAlert.accept();
		});
	}


	@Test
	public void TestClickButtonAlert5secondsSuccessful() throws InterruptedException {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/alerts", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: нажать на кнопку 'Click me' с описанием 'Click Button to see alert' ", () ->
		{
			$x(".//*[@id='timerAlertButton']").click();
		});

		step("3 Шаг: установить требуемый таймаут (в 5 секунд), чтобы появился Alert с нужным описанием 'This alert appeared after 5 seconds' ", () ->
		{
			Configuration.timeout = 5000;
		});


		step("4 Шаг: проверить, что открылось новое окно с текстом 'This alert appeared after 5 seconds' ", () ->  //текст 'Подтвердите действие на demoqa.com' в Assert не нужно включать
		{
			Alert ClickMelAlert = switchTo().alert();
			String ClickMelAlert_text = ClickMelAlert.getText();
			System.out.println(ClickMelAlert_text);

			Assertions.assertEquals("This alert appeared after 5 seconds", ClickMelAlert_text);
			ClickMelAlert.accept();
		});
	}


	@Test
	public void TestClickButtonAlertConfirmButtonSuccessful() throws InterruptedException {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/alerts", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: нажать на кнопку 'Click me' с описанием 'On button click, confirm box will appear' ", () ->
		{
			$x(".//*[@id='confirmButton']").click();
		});


		step("3 Шаг: проверить, что открылось новое окно с текстом 'Do you confirm action?' и подтвердить (сделать accept) ", () ->  //текст 'Подтвердите действие на demoqa.com' в Assert не нужно включать
		{
			Alert ClickMelAlert = switchTo().alert();
			String ClickMelAlert_text = ClickMelAlert.getText();
			System.out.println(ClickMelAlert_text);

			Assertions.assertEquals("Do you confirm action?", ClickMelAlert_text);
			ClickMelAlert.accept();
		});

		step("4 Шаг: проверить, что появился подтверждающий текст 'You selected  Ok' ", () ->
		{
			$x(".//*[@id='confirmResult']").shouldHave(text("You selected Ok"));
		});
	}


	@Test
	public void TestClickButtonAlertPromtButtonSuccessful() throws InterruptedException {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/alerts", () ->
		{
			open(websiteWebTables);
		});


		step("2 Шаг: нажать на кнопку 'Click me' с описанием 'On button click, prompt box will appear' ", () ->
		{
			$x(".//*[@id='promtButton']").click();
		});



		step("3 Шаг: проверить, что открылось новое окно с текстом 'Please enter your name', ввести в него текст 'PromtButtonSuccessful' и подтвердить (сделать accept) ", () ->  //текст 'Подтвердите действие на demoqa.com' в Assert не нужно включать
		{
			Alert ClickMelAlert = switchTo().alert();
			String ClickMelAlert_text = ClickMelAlert.getText();
			System.out.println(ClickMelAlert_text);
			ClickMelAlert.sendKeys("PromtButtonSuccessful");

			Assertions.assertEquals("Please enter your name", ClickMelAlert_text);
			ClickMelAlert.accept();
		});


		step("4 Шаг: проверить, что текст 'PromtButtonSuccessful' появился ", () ->
		{
			$x(".//*[@id='promptResult']").shouldHave(text("You entered PromtButtonSuccessful"));
		});

	}
}

