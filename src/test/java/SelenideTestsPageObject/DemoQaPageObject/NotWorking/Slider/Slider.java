package SelenideTestsPageObject.DemoQaPageObject.NotWorking.Slider;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class Slider {

	public static final String websiteWebTables = "https://demoqa.com/slider";

	private final SelenideElement slider1 = $x("(.//*[@class='range-slider range-slider--primary'])");
	private final SelenideElement slider2 = $x("(.//*[@class='range-slider__tooltip range-slider__tooltip--auto range-slider__tooltip--bottom'])");

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

	}

	@Test
	public void TestSliderSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/slider", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: установить цифру в окне (путём изменения цифры прокручивается слайдер, например: 32) ", () ->
		{

			executeJavaScript("arguments[0].setAttribute('value','32')", slider1);  // тест - зелёный, НО именно 'value' не меняется на '32' !!!
			executeJavaScript("arguments[0].setAttribute('style','--value: 32;')", slider1);

			executeJavaScript("arguments[0].setAttribute('style','left: calc(32% + 3.6px);')", slider2);
			$x("(.//*[@id='sliderValue'])").clear();
			$x("(.//*[@id='sliderValue'])").setValue("32");
		});

		step("3 Шаг: проверить, что установлена нужная цифра (например: 32) ", () ->
		{
			$x("(.//*[@id='sliderValue'])").shouldHave(value("32")); // значение остаётся на 25, тест падает !!!
		});
	}

}












