package apiAutomation;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DemoApi {

	//@Test
	public void run()
	{
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		Response response=RestAssured.request(Method.GET);
		ValidatableResponse validatableResponse=response.then();
		String expected="https://reqres.in/#support-heading";
	}
	
	//@Test
	public void run1()
	{
		given()
		.baseUri("https://reqres.in/api/users?page=2")
		.request(Method.GET)
		.then().log().all()
		
	      //verify status code as 200
	      .assertThat().statusCode(200)

	      //verify body
	      .body("data[0].first_name", Matchers.equalTo("George"));
	}
	@Test
	public void jasonPayload()
	{
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("FirstName", "Abhishek K L");
		jsonObject.put("FirstName", "K L");
		JSONArray jsonArray=new JSONArray();
		jsonArray.add("Personal Details");
	}

}
