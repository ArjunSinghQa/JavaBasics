package files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJson {

	@Test(dataProvider="bookdata")
	public void addBook(String isbn, String aisle) {

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String addbookresponse = given().log().all().header("Content-Type", "Application/Json").body(Payload.addbook(isbn,aisle))
				.when().post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response()
				.asString();
		System.out.println(addbookresponse);

		JsonPath js1 = ReusableMethods.rawtoJson(addbookresponse);
		String id = js1.get("isbn");
		System.out.println(id);

	}
	
	
	//data provider TESTNG annotation
	//here we creating multidimensional array which is a collection of array, each array represents a data set
	//which will make the case run as many as times as the number of arrays are there.
	@DataProvider(name="bookdata")
	public Object[][] getdata() {
		
		return new Object[][] {{"45367","sadh"},{"657584","fioerng"},{"98494","ueowop"}};
		
		
		
	}

}
