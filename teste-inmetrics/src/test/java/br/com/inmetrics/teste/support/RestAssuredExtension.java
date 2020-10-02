package br.com.inmetrics.teste.support;

import java.net.URI;
import java.net.URISyntaxException;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class RestAssuredExtension {
	
	public static RequestSpecification Request; 
	
	public RestAssuredExtension() {
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("inm-api-test.herokuapp.com");
		builder.setContentType(ContentType.JSON);
		var requestSpec = builder.build();
		Request = RestAssured.given().spec(requestSpec);
	}
	
	public static ResponseOptions<Response> GetOps(String url){
		
		try {
			return Request.get(new URI(url));
		} 
		catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
