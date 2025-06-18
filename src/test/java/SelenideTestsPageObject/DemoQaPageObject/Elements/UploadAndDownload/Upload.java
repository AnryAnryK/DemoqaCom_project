package SelenideTestsPageObject.DemoQaPageObject.Elements.UploadAndDownload;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class Upload {

	public static final String websiteWebTables = "https://demoqa.com/upload-download";

	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}

	@Test
	public void TestUploadSuccessful() {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/upload-download", () ->
		{
			open(websiteWebTables);
		});

		step("2 Шаг: загрузить файл на сайт", () ->
				$x(".//*[@id='uploadFile']").uploadFromClasspath("sampleFile1.jpeg"));

		step("3 Шаг: проверить, что загрузка файла на сайт произошла успешно", () ->
				$x(".//*[@id='uploadedFilePath']").shouldHave(text("sampleFile1.jpeg")));

	}
}

