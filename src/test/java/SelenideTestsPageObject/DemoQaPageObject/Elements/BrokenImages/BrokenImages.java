package SelenideTestsPageObject.DemoQaPageObject.Elements.BrokenImages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.image;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
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

		step("2 Шаг: проверить загруженную 'нормальную картинку'", () ->
			($x(".//*[@src='/images/Toolsqa.jpg']")).shouldBe(image));  // сработало успешно (тест - зелёный, т.к. картинку он распознал как "не битую") !!

		step("3 Шаг: проверить загруженную 'битую картинку'", () -> {
			($x(".//*[@src='/images/Toolsqa_1.jpg']")).shouldBe(image); // сработало успешно (тест - зелёный, т.к. картинку он распознал как "битую") !!
		});





	}

}