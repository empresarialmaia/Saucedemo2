@login @regressivo
Feature: login

COMO usuario
QUERO informar dados
PARA realizar login

Background: Acessar tela de login
Given que eu nao esteja logado 

@positivo
Scenario: Login valido
When preencho campo nome
And preencho campo senha
And clicar no botao login
Then usuario logado

@negativo
Scenario: Login senha invalida
When preencho campo nome
And preencho a senha errada
And clicar no botao login
Then mensagem de erro








