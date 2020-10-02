@listar_todos_usuarios_get
Feature: Listar Todos Usuarios - Lista todos os usuarios
	Como uma aplicação de APIs
  Quero chamar o endpoint da API
  Para validar a funcionalidade do mesmo
  
  @todos_usuarios
  Scenario: Validar todos os usuarios
  Given realizar a solicitacao
  When receber a solicitacao
  Then validar usuarios

