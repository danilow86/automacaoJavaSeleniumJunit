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



public class relatorioPage {
	static WebDriver driver;
	private WebDriver navegador;
	
	public relatorioPage(WebDriver navegador) {
		this.navegador = navegador;
		
	}
		
		//*****************************Métodos da Página de login********************************************************
		
		//Selecionar a opção RELATÓRIO no Menu
		public relatorioPage selecionarMenuRelatorio() {
						navegador.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[1]/ul/li[3]/a/span")).click();
						return this;
				
							}
		
		//Clicar no botão pesquisar na página de relatório
		public relatorioPage clicarBotaoPesquisarPaginaRelatorio(){
			navegador.findElement(By.xpath("//*//*[@id=\"content\"]/oms-relatorio-filtro/oms-widget-panel/div/div/div/div/div/form/oms-submit-widget/div/button[2]")).click();
				return this;
		}
		
		
		//Esperar Carregar Página
		public void esperarCarregarPagina(){
			navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				}
				
					
			}


		
