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
import pageObjects.templatesPage;
import pageObjects.web;


	public class consultarTemplateTest {
		//instanciando a classe webdriver e passando como par�metro o driver
		//private WebDriver driver;
		WebDriver navegador = new ChromeDriver();

		@Before
		public void setUp() throws Exception {
			//Chamada para o m�todo Criar navegador
			navegador = web.CreateChrome();
			
			//Faz login na p�gina do Admin
			new loginPage(navegador).preencherUsuario("giovani.barili").preencherCampoSenha("asd").clicarBotaoSubmit();

		}
		
		@BeforeClass
		public static void setUpBeforeClass() throws Exception{
			//passando o Local onde est� o ChromeDriver
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			
			
	}			
			
			
			@Test
			public void consultarTemplate()
			{
					

				//Fun��o aguardar carregar os elementos da p�gina do Admin
				navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Invocando m�todos da p�gina Templates Page
				new templatesPage(navegador).selecionarMenuTemplate().pesquisarTemplateSemParametros();
									
			}

			@After
			public void tearDown() throws Exception {
				//O driver quit fecha o browser por completo
				navegador.quit();
			
			}
			

			

	
}
