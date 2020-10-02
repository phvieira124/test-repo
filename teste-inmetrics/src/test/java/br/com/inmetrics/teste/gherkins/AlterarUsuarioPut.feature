@alterar_usuario_put
Feature: Alterar usuario - Altera usuario cadastrado
	Como uma aplicação de APIs
  Quero chamar o endpoint da API
  Para validar a funcionalidade do mesmo
  
  @alterar_usuario
  Scenario: Validar alteracao usuario
  	Given alterar usuario
  	When finalizar alteracao 
  	Then validar alteracao usuario 