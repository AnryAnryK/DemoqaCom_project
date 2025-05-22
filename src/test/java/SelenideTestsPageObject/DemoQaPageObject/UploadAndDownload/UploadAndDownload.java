package SelenideTestsPageObject.DemoQaPageObject.UploadAndDownload;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class UploadAndDownload {

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

	@Test
	public void TestDownloadSuccessful() throws IOException, URISyntaxException {
		step("1 Шаг: зайти на нужную страницу https://demoqa.com/upload-download", () ->
		{
			open(websiteWebTables);
		});

//		step("2 Шаг: Нажать на кнопку Download (при нажатии автоматически происходит выгрузка файла с сайта)", () ->
//				$x(".//*[@id='downloadButton']").click());  //успешно !

//		step("2 Шаг: Нажать на кнопку Download (при нажатии автоматически происходит выгрузка файла с сайта)", () ->
//				$x(".//*[@download='sampleFile.jpeg']").click());

// это - не работает !!
//		File downloadedFile = $(byAttribute("download", "sampleFile.jpeg")).download();
		File downloadedFile = $(By.xpath(".//*[@download='sampleFile.jpeg']")).download();
//		System.out.println(downloadedFile);
	}

}