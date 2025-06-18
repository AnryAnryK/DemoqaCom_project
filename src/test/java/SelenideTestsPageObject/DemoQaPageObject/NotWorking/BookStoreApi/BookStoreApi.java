package SelenideTestsPageObject.DemoQaPageObject.NotWorking.BookStoreApi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookStoreApi {

	@Test  // НЕ УСПЕШНО !
	public void BookStoreApiTestBookStoreV1BooksGetSucessful() {

		String url = "https://demoqa.com/BookStore/v1/Books";
		List<String> expectResult = new ArrayList<>(Integer.parseInt("9781449325862, 9781449331818, 9781449337711, 9781449365035, 9781491904244, 9781491950296, 9781593275846, 9781593277574"));
		String actualResult =
				given()
						.log().all()
						.when()
						.get(url)
						.then()
						.log().all()
						.statusCode(200)
						.body("books.isbn", is(expectResult))
						.extract().path("books.isbn");
		assertEquals(expectResult, actualResult);
//				.body("books.isbn", is("[9781449325862, 9781449331818, 9781449337711, 9781449365035, 9781491904244, 9781491950296, 9781593275846, 9781593277574]"));


	}

	@Test  // УСПЕШНО !
	public void BookStoreApiTestAccountV1UserByUserIdPostSucessful() {

		String data = "{userId: \"29642d34-1ff0-4ebb-a3b8-dc6d254a9225\", username: \"string1\"}";

		given()
				.log().all()
				.body(data)
				.contentType(JSON)
				.when()
				.post("https://demoqa.com/swagger/#/Account/AccountV1UserPost")
				.then()
				.log().all()
				.statusCode(200);
	}

	@Test // НЕ УСПЕШНО !
	public void BookStoreApiTestAccountV1UserByUserIdGetSucessful() {

		String url = "https://demoqa.com/Account/v1/User/29642d34-1ff0-4ebb-a3b8-dc6d254a9225";
//		String actualResult =
		given()
				.log().all()
//				.header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IlN0cmluZzEiLCJwYXNzd29yZCI6IlN0cmluZzEhIiwiaWF0IjoxNzQ4ODU4OTI3fQ.aupejQ01WkchQWiFjkPUy5D2rl9m4IfywjPSkQW_Tjg")
				.contentType(JSON)
				.when()
				.get(url)
				.then()
				.log().all()
				.statusCode(200);

//						.body("books.isbn", is(expectResult))


	}
}
