package saucedemo.automation.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import saucedemo.automation.drivers.Drivers;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "saucedemo.automation.steps",
		tags = "@login",
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:target/cucumber-report.html"}	
				
		)

public class Executa extends Drivers {

	public static void iniciarTest(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public static void encerrarTest() {
		driver.quit();
	}


}
