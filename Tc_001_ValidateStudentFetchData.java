package org.apiautomation.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Tc_001_ValidateStudentFetchData {
	
	 String getStudentEndPoint ="https://thetestingworldapi.com/api/Students/3000000";
	 
	@Test
	public void validateStudentData() {
		
		Response response = RestAssured.get(getStudentEndPoint);
		
		//System.out.println(response.getStatusCode());
		
		System.out.println(response.getHeaders());
		System.out.println(response.getHeader("date"));
		
		System.out.println(response.asString());
		System.out.println(response.asPrettyString());
		
		
	}

}
