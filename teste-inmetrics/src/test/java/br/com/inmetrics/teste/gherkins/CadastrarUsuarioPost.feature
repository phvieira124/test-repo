@cadastrar_usuario_post
Feature: Cadastrar Usuario Post - Realiza cadastro usuario post
	Como uma aplicação de APIs
  Quero chamar o endpoint da API
  Para validar a funcionalidade do mesmo
	
	@cadastrar_usuario_post_com_sucesso
	Scenario: Validar cadastro usuario post com sucesso
	Given informar dados para cadastro usuario post
	When preenchidos dados para cadastro usuario post
	Then validar dados para cadastro usuario post com sucesso
	
		