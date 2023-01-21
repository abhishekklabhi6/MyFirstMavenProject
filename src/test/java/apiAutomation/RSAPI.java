package apiAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class RSAPI {

	@Test

	public void getResponse()
	{
		RestAssured.baseURI="https://reqres.in/api/users";
		given().log().all().queryParam("page", 2)
		.given().get().then().log().all().assertThat().statusCode(200);

	}
	
	@Test
	public void postRequest()
	{
		RestAssured.baseURI="https://reqres.in/api/users";
		given().log().all().header("Content-Type", "application/json") 
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}").when().post().then().log().all().assertThat().statusCode(201);
	
	}

}
