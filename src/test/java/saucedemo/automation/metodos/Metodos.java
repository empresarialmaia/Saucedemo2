package saucedemo.automation.metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import saucedemo.automation.drivers.Drivers;

public class Metodos extends Drivers {
	
	public static void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public static void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public static void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoCapturado, textoEsperado);		
	}
	
	public static void validarUrl(String urlEsperada) {
		String urlCapturada = driver.getCurrentUrl();
		assertEquals(urlCapturada, urlEsperada);
		
	}
	
}
