import files.Payload;
import io.restassured.path.json.JsonPath;

public class Complexjsonparse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// from payload.courseprice we have captured the response and
		// placed it in the instance below and it will convert it into the JSON.
		// as we have a response as sample for the API which is not ready yet.
		JsonPath js = new JsonPath(Payload.courseprice());

		// print total courses count
		int count = js.getInt("courses.size()");
		System.out.println(count);

		// print total purchase amount
		int totalamount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalamount);

		// print first course title
		String coursetitle = js.get("courses[0].title");
		System.out.println(coursetitle);

		// print all courses title and their prices
		for (int i = 0; i < count; i++) {
			String title = js.get("courses[" + i + "].title");
			System.out.println(title);
			System.out.println(js.get("courses[" + i + "].price").toString());

		}

		System.out.println("print copies sold by RPA course");

		for (int i = 0; i < count; i++) {
			String title = js.get("courses[" + i + "].title");

			if (title.equalsIgnoreCase("RPA")) {
				int coursecopies = js.get("courses[" + i + "].copies");
				System.out.println(coursecopies);
				break; // will stop the for loop once the condition is matched , no further execution
						// of the JSON array

			}

		}

		// code to verify the purchase amount in the JSON response

		int amount;
		int purchase_amount = 0;
		int new_amount = 0;

		for (int i = 0; i < count; i++) {

			int courseprice = js.get("courses[" + i + "].price");
			int coursecopies = js.get("courses[" + i + "].copies");

			amount = courseprice * coursecopies;
			purchase_amount = amount + new_amount;
			new_amount = purchase_amount;
		}
		
		
		System.out.println("total purchase amount is" + " " + purchase_amount);

		if (totalamount == purchase_amount) {

			System.out.println("purchase amount is verified successfully");
		}

	}

}
