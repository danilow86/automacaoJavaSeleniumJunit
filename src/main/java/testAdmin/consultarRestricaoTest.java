package testAdmin;
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
import pageObjects.restricoesPage;
import pageObjects.web;

public class consultarRestricaoTest {
	//instanciando a classe webdriver e passando como parâmetro o driver
	//private WebDriver driver;
	WebDriver navegador = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		//Chamada para o método Criar navegador
		navegador = web.CreateChrome();
		
		//Faz login na página do Admin
		new loginPage(navegador).preencherUsuario("giovani.barili").preencherCampoSenha("asd").clicarBotaoSubmit();

	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		//passando o Local onde está o ChromeDriver
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		
}
	

	@Test
	public void consultarRestricao() {	

		//Função aguardar carregar os elementos da página do Admin
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Invocando métodos da página Restrições Page
		new restricoesPage(navegador).selecionarMenuRestricoes().pesquisarRestricoesSemParametros();
		
		}	
	
	
	@After
	public void tearDown() throws Exception {
		//O driver quit fecha o browser por completo
		//navegador.quit();
	}

}


