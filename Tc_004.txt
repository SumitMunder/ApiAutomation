package org.apiautomation.testcases;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Tc_003_ValidateStudent_Post {
	
	String postEndPoint = "https://thetestingworldapi.com/api/Students1";
	
	public void addStudent() {
		
		RequestSpecification postRequest = RestAssured.given();
		postRequest.body("{\r\n"
				+ "  \"first_name\": \"sample string 1\",\r\n"
				+ "  \"middle_name\": \"sample string 2\",\r\n"
				+ "  \"last_name\": \"sample string 3\",\r\n"
				+ "  \"date_of_birth\": \"sample string 4\"\r\n"
				+ "}az");
		
		
	}

}
