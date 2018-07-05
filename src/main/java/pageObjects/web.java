package pageObjects;
import java.util.concurrent.TimeUnit;
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


public class web {
	
	public static WebDriver CreateChrome()  {
		
		//Instanciando o Navegador
				WebDriver navegador = new ChromeDriver();
				
		//pgLogin.esperarCarregarPagina();
				navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
				
		//Acessar a Página
				navegador.get("http://hlg-oms.api-cnova.com.br/admin/");
				return navegador;
		
	}

}
