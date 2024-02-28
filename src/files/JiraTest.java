package files;



import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class JiraTest {

	public static void main(String[] args) {
		
		RestAssured.baseURI="http://localhost:8080";
		
		SessionFilter session = new SessionFilter();
		
		
		//logging in and creating session id
		String response = given().header("Content-Type","application/json").body("{\r\n"
				+ "    \"username\": \"arjunsingh308569\",\r\n"
				+ "    \"password\": \"Bangari@308569\"\r\n"
				+ "}").log().all().filter(session).when().post("/rest/auth/1/session").then().log().all().extract().response().asString();
		
		//adding comment to a particular issue with its id.
		given().pathParam("Key", "10100").log().all().header("Content-Type","application/json").body("{\r\n"
				+ "    \"body\":\"i have added comment through API automation \",\r\n"
				+ "    \"visibility\":{\r\n"
				+ "        \"type\":\"role\",\r\n"
				+ "        \"value\":\"Administrators\"\r\n"
				+ "    }\r\n"
				+ "\r\n"
				+ "}").filter(session).when().post("/rest/api/2/issue/{Key}/comment").then().log().all().statusCode(201);

		
		//this session variable will be keeping the note of the session created on each new request , so
		//using filter(session) implies the session id to the request which got created.
		
		
		//AddAttachment
		given().header("X-Atlassian-Token","no-check").filter(session).pathParam("Key", "10100").header("Content-Type","multipart/form-data").
		multiPart("file",new File("jira.txt")).when().
		post("/rest/api/2/issue/{Key}/attachments").then().log().all().assertThat().statusCode(200);
		
		//GetIssue
		String issueDetails = given().filter(session).pathParam("Key","10100").queryParam("fields","comment").log().all().when().get("/rest/api/2/issue/{Key}").
		then().log().all().extract().response().asString();
		System.out.println(issueDetails);
		
		JsonPath js1 = new JsonPath(issueDetails);
		int commentsCount =   js1.getInt("fields.comment.comments.size()");
		for(int i=0;i<commentsCount;i++)
		{
			System.out.println(js1.getInt("fields.comment.comments["+i+"].id"));
		}
		
		

	}

}