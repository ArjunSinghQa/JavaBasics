package files;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class SumValidation {
	
	@Test
	public void sumvalidation()
	{

		int sum = 0;
		JsonPath js = new JsonPath(Payload.courseprice());
		int count = js.getInt("courses.size()");
		
		for (int i = 0; i < count; i++) {

			int courseprice = js.get("courses[" + i + "].price");
			int coursecopies = js.get("courses[" + i + "].copies");

			int amount = courseprice * coursecopies;
			 sum = sum + amount;
		}
		
		System.out.println(sum);
		
		int totalpurchaseamount = js.getInt("dashboard.purchaseAmount");
		
		Assert.assertEquals(sum, totalpurchaseamount);
		
	}

}
