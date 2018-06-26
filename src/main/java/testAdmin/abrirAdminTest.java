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


public class abrirAdminTest {
	//instanciando a classe webdriver e passando como parâmetro o driver
		static WebDriver driver;
		WebDriver navegador = new ChromeDriver();
		
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//passando o Local onde está o ChromeDriver
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver.exe");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//O driver quit fecha o browser por completo
		driver.quit();
		
		//Responsável por fechar o aba do browser
		driver.close();
		
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		//Acessar a Página
		navegador.get("http://hlg-oms.api-cnova.com.br/admin/");
		
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Clicar no Campo Usuário
		navegador.findElement(By.cssSelector("input[name='usuario']")).click();
		
		//Preencher Usuário
		  navegador.findElement(By.cssSelector("input[name='usuario']")).sendKeys("giovani.barili");
		
		//Clicar no Campo Senha
		navegador.findElement(By.xpath("/html/body/oms-root/oms-login-layout/section/div/div/div[2]/oms-login-entrar/form/div[2]/div[2]/input")).click();
		
		//Preencher Senha
		//navegador.findElement(By.linkText("usuario")).sendKeys("asd");
		navegador.findElement(By.xpath("/html/body/oms-root/oms-login-layout/section/div/div/div[2]/oms-login-entrar/form/div[2]/div[2]/input")).sendKeys("asd");
		
		//Clicar no Botão Entrar
		//navegador.findElement(By.className("btn btn-primary mt-2")).click();
		navegador.findElement(By.xpath("/html/body/oms-root/oms-login-layout/section/div/div/div[2]/oms-login-entrar/form/div[3]/div/button")).click();
		
	}

}
