package SelenideTestsPageObject.DemoQaPageObject.BrokenImages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class BrokenImages {

	public static final String websiteWebTables = "https://demoqa.com/broken";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}

	@Test
	public void TestBrokenImagesSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/broken", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: проверить загруженную 'битую картинку'", () -> {
			$x(".//*[@src='/images/Toolsqa_1.jpg']").isImage();
		});  // пишет "всё ок, тест - ок, Image - норм".  А как он - "норм", если Image явно "битый" ??

//		step("2 Шаг: проверить загруженную 'нормальную картинку'", () ->
//				$x(".//*[@src='/images/Toolsqa.jpg']").isImage());


	}

}