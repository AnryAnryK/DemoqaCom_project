package SelenideTestsPageObject.DemoQaPageObject.NotWorking;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class AutoComplete {

	public static final String websiteWebTables = "https://demoqa.com/auto-complete";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}


	@Test  // УСПЕШНО
	public void TestAutoCompleteSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/auto-complete", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: Заполнить строку текстом выбора цвета '' ", () ->
		{
//			$x("(.//*[@class='auto-complete__placeholder css-1wa3eu0-placeholder'])[1]").setValue("r");
//			$x(".//*[@class='auto-complete__placeholder css-1wa3eu0-placeholder']").setValue("r");

//			$x(".//*[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']").setValue("r");
			$x(".//*[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']").click();
//			$x(".//*[@class='auto-complete__control css-yk16xz-control']").click(); // тоже ок

					$x(".//*[@class='auto-complete__control auto-complete__control--is-focused auto-complete__control--menu-is-open css-1pahdxg-control']").setValue("r");
//		//
		});

//		step("3 Шаг: написать в строке текст (r) ", () ->
//		{
//			$x(".//*[@class='collapse']").shouldBe(hidden);
//		});
	}
}


