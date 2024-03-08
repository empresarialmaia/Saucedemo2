package saucedemo.automation.elementos;

import org.openqa.selenium.By;

public class ElementosLoginPage {
	
	public By usuario = By.id("user-name");
	public By senha = By.id("password");
	public By btnlogin = By.id("login-button");
	public By msgSenhaErrada = By.xpath("//h3[@data-test='error']");
	public By msgUsuarioEmBranco = By.xpath("//h3[@data-test='error']");
	public By msgUsuarioBloqueado = By.xpath("//h3[@data-test='error']");
	
	

}
