@listar_usuario_cadastrados_get
Feature: Listar Usuario Cadastrados Get - Lista usuarios cadastrados 
	Como uma aplicação de APIs
  Quero chamar o endpoint da API
  Para validar a funcionalidade do mesmo
  
  @validar_usuarios_cadastrados
  Scenario: Validar usuarios cadastrados
  	Given preencher usuario
  	When realizar cadastro usuario
  	Then validar usuario cadastrado
  	
