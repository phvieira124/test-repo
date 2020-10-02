package br.com.inmetrics.teste.steps;


import br.com.inmetrics.teste.support.RestAssuredExtension;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;



public class ListarTodosUsuariosGetSteps {

	public static ResponseOptions<Response> response;

	@Given("realizar a solicitacao")
	public void realizar_a_solicitacao(String url) throws Throwable {
		response = RestAssuredExtension.GetOps(url);
	}

	@When("receber a solicitacao")
	public void receber_a_solicitacao(String authorName) throws Throwable {
		assertThat(response.getBody().jsonPath().get(""), hasItem(""));
	}

	@Then("validar usuarios")
	public void entao_validar_usuarios() {
		
	}
}
