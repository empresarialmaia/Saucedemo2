@login @regressivo
Feature: login

COMO usuario
QUERO informar dados
PARA realizar login

Background: Acessar tela de login
Given que eu nao esteja logado "https://www.saucedemo.com/"

@positivo
Scenario: Login valido
When preencho campo nome
And preencho campo senha
And clicar no botao login
Then usuario logado

@negativo1
Scenario: Login senha invalida
When preencho campo nome
But preencho a senha errada
And clicar no botao login
Then mensagem de erro senha invalida

@negativo2
Scenario: Usuario bloqueado
When preencho campo nome de usuario bloqueado
But preencho campo senha
And clicar no botao login
Then mensagem de usuario bloqueado

@negativo3
Scenario: Usuario em branco
When nao preencher campo nome
And nao preencho campo senha
But clicar no botao login mesmo sem preencher nome e senha
Then mensagem de erro dados em branco












