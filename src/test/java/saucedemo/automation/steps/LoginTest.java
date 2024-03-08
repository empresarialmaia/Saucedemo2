package saucedemo.automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import saucedemo.automation.pages.LoginPage;
import saucedemo.automation.runner.Executa;

public class LoginTest {
	
LoginPage page = new LoginPage();

	@Given("que eu nao esteja logado {string}")
	public void queEuNaoEstejaLogado(String url) {
		Executa.iniciarTest(url);
	    
	}
	
	@When("preencho campo nome")
	public void preenchoCampoNome() {
		page.usuario();
	  
	}
	@When("preencho campo senha")
	public void preenchoCampoSenha() {
		page.senha();
	    
	}
	@When("clicar no botao login")
	public void clicarNoBotaoLogin() {
		page.botaoLogin();
	    
	}
	@Then("usuario logado")
	public void usuarioLogado() {
		page.urlUsuarioLogado();
	   
	}	

	@When("preencho a senha errada")
	public void preenchoASenhaErrada() {
		page.usuarioSenhaErrada();
	   
	}

	@Then("mensagem de erro senha invalida")
	public void mensagemDeErroSenhaInvalida() {
		page.msgSenhaErrada();
		page.botaoLogin();
	    
	}
	
	@When("preencho campo nome de usuario bloqueado")
	public void preenchoCampoNomeDeUsuarioBloqueado() {
		page.usuarioBloqueado();
	    
	}
	
	@Then("mensagem de usuario bloqueado")
	public void mensagemDeUsuarioBloqueado() {
		page.msgUsuarioBloqueado();
	   
	}		

	@When("nao preencher campo nome")
	public void naoPreencherCampoNome() {
		
	    
	}
	
	@When("nao preencho campo senha")
	public void naoPreenchoCampoSenha() {
	    
	}
	
	@When("clicar no botao login mesmo sem preencher nome e senha")
	public void clicarNoBotaoLoginMesmoSemPreencherNomeESenha() {
		page.botaoLogin();
	  
	}
	
	@Then("mensagem de erro dados em branco")
	public void mensagemDeErroDadosEmBranco() {
		page.msgUsuarioEmBranco();
	    
	}



	
}