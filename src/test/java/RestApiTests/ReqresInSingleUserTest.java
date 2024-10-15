package RestApiTests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;

import static com.codeborne.selenide.Selenide.open;
import static io.restassured.http.ContentType.JSON;
import static org.codehaus.groovy.ast.tools.GeneralUtils.param;
import static org.hamcrest.Matchers.is;


public class ReqresInSingleUserTest {
//	String data ="{id: 2,\n" +
//			"email: \"janet.weaver@reqres.in\",\n" +
//			"first_name: \"Janet\",\n" +
//			"last_name: \"Weaver\"}";

	@Test
	void SingleUserApiSucessfullTest(){
		get("https://reqres.in/api/users/2")
		.then()
				.statusCode(200)
				.body("data.id", is(2))
				.body("data.email", is("janet.weaver@reqres.in"))
				.body("data.first_name", is("Janet"))
				.body("data.last_name", is("Weave"));

	}
}
