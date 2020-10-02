package br.com.inmetrics.teste.steps;


import br.com.inmetrics.teste.support.RestAssuredExtension;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class ListarUsuarioCadastradosGetSteps {

	public static ResponseOptions<Response> response;

	@Given("preencher usuario")
	public void preencher_usuario(String url) throws Throwable {	
		response = RestAssuredExtension.GetOps(url);
	}

	@When("realizar cadastro usuario")
	public void realizar_cadastro_usuario(String authorName) throws Throwable {
		assertThat(response.getBody().jsonPath().get(""), hasItem(""));
	}

	@Then("validar usuario cadastrado")
	public void validar_usuario_cadastrado() {
		
	}
}
