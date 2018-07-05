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



public class variaveisPage {
	private WebDriver navegador;
	
	public variaveisPage(WebDriver navegador) {
		this.navegador = navegador;
		
	}
	
		
		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
		}
		

		
		//*****************************M�todos da P�gina de Vari�veis********************************************************
		
		//Acessar a P�gina Auxiliar
		public variaveisPage selecionarMenuAuxiliar() {
			navegador.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[1]/ul/li[4]/a/span")).click();
			return this;
				}
		
		//Clicar no Menu de pagina��o de Vari�veis
				public variaveisPage clicarMenuRegistros() {
					navegador.findElement(By.id("limiteAtual")).click();
					return this;
						}
				
		//Selecionar o resultado de apenas 1 registro por p�gina
				public variaveisPage selecionarUmRegistro() {
					navegador.findElement(By.id("limiteAtual")).click();
					return this;
						}
		
			}


		
