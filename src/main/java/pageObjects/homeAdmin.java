package pageObjects;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import pageObjects.loginPage;
import pageObjects.web;

public class homeAdmin {
	
	private WebDriver navegador;
	
	public homeAdmin(WebDriver navegador) {
		
		this.navegador = navegador;
	}
	
	public homeAdmin clicarBotaoSubmit(String login){
		//Clicar no Botão Entrar
		navegador.findElement(By.xpath("/html/body/oms-root/oms-login-layout/section/div/div/div[2]/oms-login-entrar/form/div[3]/div/button")).click();
		return this;
	}
	
	

}
