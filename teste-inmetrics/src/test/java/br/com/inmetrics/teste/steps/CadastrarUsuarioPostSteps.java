package br.com.inmetrics.teste.steps;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.hasItem;

import br.com.inmetrics.teste.support.RestAssuredExtension;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;


public class CadastrarUsuarioPostSteps {
	
	public static ResponseOptions<Response> response;

	@Given("informar dados para cadastro usuario post")
	public void informar_dados_para_cadastro_usuario_post(String url) throws Throwable {
		response = RestAssuredExtension.GetOps(url);

	}

	@When("preenchidos dados para cadastro usuario post")
	public void preenchidos_dados_para_cadastro_usuario_post(String authorName) throws Throwable {
		assertThat(response.getBody().jsonPath().get(""), hasItem(""));
	}

	@Then("validar dados para cadastro usuario post com sucesso")
	public void validar_dados_para_cadastro_usuario_post_com_sucesso() {
		
	}
}
