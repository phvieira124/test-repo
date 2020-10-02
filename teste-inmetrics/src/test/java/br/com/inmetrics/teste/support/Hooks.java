package br.com.inmetrics.teste.support;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import br.com.inmetrics.teste.support.RestAssuredExtension;

public class Hooks{
	
	@Before 
	public void beforeTest() {
		
		RestAssuredExtension restAssuredExtension = new RestAssuredExtension();
	}
	
	@After
	public void afterTest() throws Exception{
		
	}
}