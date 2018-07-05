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
import pageObjects.web;



public class loginPage {
		static WebDriver driver;
		private WebDriver navegador;
		
		public loginPage(WebDriver navegador) {
			this.navegador = navegador;
		}
					
		//Preenche o usuário 
		public loginPage preencherUsuario(String usuario) {
			//Preencher Usuário
			  navegador.findElement(By.cssSelector("input[name='usuario']")).sendKeys("giovani.barili");
			return this;
		}
		
		
		public loginPage preencherCampoSenha(String senha) {
			//Preencher Senha
			navegador.findElement(By.xpath("/html/body/oms-root/oms-login-layout/section/div/div/div[2]/oms-login-entrar/form/div[2]/div[2]/input")).sendKeys("asd");
			return this;
		}
		
		public homeAdmin clicarBotaoSubmit() {
			//Clicar no Botão Entrar
			navegador.findElement(By.xpath("/html/body/oms-root/oms-login-layout/section/div/div/div[2]/oms-login-entrar/form/div[3]/div/button")).click();
			return new homeAdmin(navegador);
		}
		
		
	}


		
