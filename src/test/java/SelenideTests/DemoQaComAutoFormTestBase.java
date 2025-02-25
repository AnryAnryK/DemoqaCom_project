package SelenideTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;

public class DemoQaComAutoFormTestBase {

	public static final String website = "https://demoqa.com/";
	public static final String name1 = "Mark";
	public static final String surname1 = "Petrov";
	public static final String email1 = "MarkPetrov@mail.com";
	public static final int phoneNumber1 = 1234567891;
	public static final String adress1 = "Russia, Moscow 1";


	@BeforeEach
	public void TestBase() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
		Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub"; // это - для запуска теста на Selenoid (учебный стенд !)
	}
}
