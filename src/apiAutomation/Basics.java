package apiAutomation;

import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import files.ReusableMethods;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class Basics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// validate if add place API is working as expected

		// given-- all input details
		// when-- submit the API-- response and HTTP methods.
		// then- validate the response
		
		//header is required only when we have the body in the request

		RestAssured.baseURI= "https://rahulshettyAcademy.com";
		String response =given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\sneha\\OneDrive\\Desktop\\addplace.json")))).when().post("maps/api/place/add/json")
		.then().statusCode(200).body("scope",equalTo("APP"))
		.header("server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js1 = ReusableMethods.rawtoJson(response);//for parsing JSON response
		String placeid = js1.getString("place_id");
		System.out.println(placeid);

		
		String newaddress = "70 Summer walk, India";
		
		//code for updating address for a place id
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeid+"\",\r\n"
				+ "\"address\":\""+newaddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "").
		when().put("maps/api/place/update/json").
           then().assertThat().log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));
		
		//code for get place
		String getcallresponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id",placeid).
		when().get("maps/api/place/get/json").
		then().statusCode(200).extract().response().asString();
		
		JsonPath js2 = ReusableMethods.rawtoJson(getcallresponse);//for parsing JSON response
		String responseaddress = js2.getString("address");
		System.out.println(responseaddress);
		
		//check update address is equal to the NEWADDRESS in GETCALL response
		Assert.assertEquals(responseaddress,newaddress);
		
		
		//.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\sneha\\OneDrive\\Desktop\\addplace.json"))))
		//this code lets us feed the json from the pc through its path , directly into the code
		
	}

	

}