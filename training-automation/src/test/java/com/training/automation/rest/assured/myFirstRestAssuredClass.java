package com.training.automation.rest.assured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class myFirstRestAssuredClass {

	@Test
	public static void getResponseBody() {
		given().when()
		.get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1")
		.then().log().all();
	}
}
