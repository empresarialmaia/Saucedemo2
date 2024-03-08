package saucedemo.automation.pages;

import saucedemo.automation.elementos.ElementosLoginPage;
import saucedemo.automation.metodos.Metodos;

public class LoginPage  {
	
	ElementosLoginPage eleLogin = new ElementosLoginPage();
	
	
	public void usuario() {
		Metodos.escrever(eleLogin.usuario, "standard_user");
		
	}
	
	public void senha() {
		Metodos.escrever(eleLogin.senha, "secret_sauce");	
	}
	
	public void usuarioSenhaErrada() {		
		Metodos.escrever(eleLogin.senha, "TESTE");	

	}
	
	public void usuarioBloqueado() {
		Metodos.escrever(eleLogin.usuario, "locked_out_user");
		
	}
	
        
    public void botaoLogin() {
    	Metodos.clicar(eleLogin.btnlogin);
    }
    
    public void urlUsuarioLogado() {
    	Metodos.validarUrl("https://www.saucedemo.com/inventory.html");
    }
    
    public void msgSenhaErrada() {
    	Metodos.validarTexto(eleLogin.msgSenhaErrada, "Epic sadface: Username and password do not match any user in this service");
    	
    }
    
    public void msgUsuarioEmBranco() {
    	Metodos.validarTexto(eleLogin.msgSenhaErrada, "Epic sadface: Username is required");
    	
}
    
    public void msgUsuarioBloqueado() {
    	Metodos.validarTexto(eleLogin.msgSenhaErrada, "Epic sadface: Sorry, this user has been locked out.");
    	
}
    
    
    
}

