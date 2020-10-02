package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.support.RestAssuredExtension;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class AlterarUsuarioPutSteps {
	
	public static ResponseOptions<Response> response;

	@Given("alterar usuario")
	public void alterar_usuario(String url) throws Throwable {
		response = RestAssuredExtension.GetOps(url);
	}

	@When("finalizar alteracao")
	public void finalizar_alteracao(String authorName) throws Throwable {
		assertThat(response.getBody().jsonPath().get(""), hasItem(""));
	}

	@Then("validar alteracao usuario")
	public void validar_alteracao_usuario() {
		
	}
}
