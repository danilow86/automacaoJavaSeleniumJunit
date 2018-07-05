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
import pageObjects.templatesPage;
import pageObjects.web;

	public class cadastrarTemplate{
		//instanciando a classe webdriver e passando como par�metro o driver
		static WebDriver driver;
		WebDriver navegador = new ChromeDriver();
		//loginPage pgLogin = new loginPage(driver);
		//templatesPage pgTemplatesPage = new templatesPage();
	

		@Before
		public void setUp() throws Exception {
			//Chamada para o m�todo Criar navegador
				navegador = web.CreateChrome();
		}
		

		@Test
		public void test() {
			
			//Selecionando a op��o templates no menu
			//pgTemplatesPage.selecionarMenuTemplate();
			
			//Clicar no bot�o NOVO TEMPLATE
			//pgTemplatesPage.clicarNoBotaoNovoTemplate();
			
			//Selecionar Templatete de Email
			//pgTemplatesPage.selecionarComunicacaoEmail();
			
			//Preencher e Salvar Template
			//pgTemplatesPage.preencherFormularioComunicacaoEmail();
			
		}

		
		{
			
			
			//Acessar a P�gina
			//pgLogin.acessarAdmin();
			navegador.get("http://hlg-oms.api-cnova.com.br/admin/");

			//Clicar no Campo Usu�rio
			//pgLogin.clicarNoCampoUsuario();
			navegador.findElement(By.cssSelector("input[name='usuario']")).click();
			
			//Preencher Usu�rio
			//pgLogin.preencherUsuario(); 
			navegador.findElement(By.cssSelector("input[name='usuario']")).sendKeys("giovani.barili");
			
			//Clicar no Campo Senha
			//pgLogin.clicarCampoSenha();
			navegador.findElement(By.xpath("/html/body/oms-root/oms-login-layout/section/div/div/div[2]/oms-login-entrar/form/div[2]/div[2]/input")).click();
			
			//Preencher Senha
			//navegador.findElement(By.linkText("usuario")).sendKeys("asd");
			navegador.findElement(By.xpath("/html/body/oms-root/oms-login-layout/section/div/div/div[2]/oms-login-entrar/form/div[2]/div[2]/input")).sendKeys("asd");
			
			
			
		}	
	

	@After
	public void tearDown() throws Exception {
		//O driver quit fecha o browser por completo
				navegador.quit();
	}
}
