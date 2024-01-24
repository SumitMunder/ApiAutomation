package org.apiautomation.testcases;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Tc_002ValidateStudent {
	
	String StudentEndPoint = "https://thetestingworldapi.com/api/studentsDetails/10055490";
	public void validateStudentData() {
		
		Response response= RestAssured.get(StudentEndPoint);
		System.out.println("Validate Success Code--------" +response.getStatusCode());
		//Assert get success in response code
		Assert.assertEquals(response.getStatusCode(), 200);
		
		System.out.println("Headers Validate --------------" +response.headers());
		Assert.assertEquals(response.headers(), "Date");
		
		System.out.println("Validate Particular Header Validate--------"+response.header("Date"));
		Assert.assertEquals(response.header("Date"), "Date");
		
	}

}
