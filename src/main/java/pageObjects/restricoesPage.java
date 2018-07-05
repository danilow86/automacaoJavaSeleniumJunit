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

public class restricoesPage {
	private WebDriver navegador;
	
	public restricoesPage(WebDriver navegador) {
		this.navegador = navegador;
		
	}
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	


	
	//*****************************Métodos da Página de Restrições********************************************************
					
	//Selecionar a opção RESTRIÇÕES no Menu
	public restricoesPage selecionarMenuRestricoes() {
					navegador.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[1]/ul/li[2]/a/span")).click();
					return this;
			
						}
	
	//Pesquisar RESTRIÇÕES sem informar parâmetros para consulta
		public restricoesPage pesquisarRestricoesSemParametros() {
			navegador.findElement(By.xpath("//*[@id=\"content\"]/oms-restricao-filtro/oms-widget-panel/div/div/div/div/div/form/oms-submit-widget/div/button[2]")).click();
			return this;
			}
	
	
}
