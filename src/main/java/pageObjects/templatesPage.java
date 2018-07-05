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

public class templatesPage {
	private WebDriver navegador;
	
	public templatesPage(WebDriver navegador) {
		this.navegador = navegador;
		
	}
	
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	


	
	//*****************************M�todos da P�gina de TEMPLATES********************************************************
	//Esperar Carregar P�gina
					
	//Selecionar a op��o TEMPLATE no Menu
	public templatesPage selecionarMenuTemplate() {
					navegador.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[1]/ul/li[1]/a/span")).click();
		return this;
					}

	//Pesquisar TEMPLATES sem informar par�metros para consulta
	public templatesPage pesquisarTemplateSemParametros() {
		navegador.findElement(By.xpath("//*[@id=\"content\"]/oms-template-filtro/oms-widget-panel/div/div/div/div/div/form/oms-submit-widget/div/button[2]")).click();												
		return this;
		}
	
	
	//Clicar no bot�o Novo Template
	public templatesPage clicarNoBotaoNovoTemplate() {
		navegador.findElement(By.id("[@id=\"content\"]/oms-header-content/div/div/button")).click();
		return this;
		}
	
	
	//Selecionar Tipo Comunica��o
	public templatesPage selecionarTipoComunicacao() {
		navegador.findElement(By.id("[@id=\"content\"]/oms-header-content/div/div/button")).click();
		return this;
		}
					
	//Selecionar Tipo Comunica��o Email
	public templatesPage selecionarComunicacaoEmail() {
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/form/div/section/oms-tipo-comunicacao-radio/div/label[2]")).click();
		return this;
		}
	
	//Selecionar Tipo Comunica��o SMS
		public templatesPage selecionarComunicacaoSms() {
			navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/form/div/section/oms-tipo-comunicacao-radio/div/label[1]/i")).click();
			return this;
			}
		
		//Selecionar Tipo Comunica��o Push
		public templatesPage selecionarComunicacaoPush() {
			navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/form/div/section/oms-tipo-comunicacao-radio/div/label[3]/i")).click();
			return this;
			}
	
	//Preencher Template de comunica��o Email
	public void preencherFormularioComunicacaoEmail() {
		
		//Clicar no campo Unidade de neg�cio
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/oms-email/form/fieldset[1]/div/div/div[1]/oms-unidade-negocio-select/ng-select/div/div/div[2]/input")).click();

		//Selecionar unidade de neg�cio
		navegador.findElement(By.id("abb766a994b5"));
		
		//Clicar no campo Ponto de controle
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/oms-email/form/fieldset[1]/div/div/div[2]/oms-ponto-controle-select/ng-select/div")).click();
		
		//Selecionar Ponto de Controle 
		navegador.findElement(By.id("a4da3a7751ab"));
		
		//Inserir Descri��o
		navegador.findElement(By.name("descricao")).sendKeys("teste");
		
		//Clicar no campo Nome de Remetente
		navegador.findElement(By.name("nomeRemetente")).click();
		
		//Inserir Nome de Remetente
		navegador.findElement(By.name("nomeRemetente")).sendKeys("DescricaoTeste");

		//Clicar no campo Email de Remetente
		navegador.findElement(By.name("emailRemetente")).click();
		
		//Preencher Email de Remetente
		navegador.findElement(By.name("emailRemetente")).sendKeys("teste@teste.com");

		//Clicar no campo Assunto
		navegador.findElement(By.name("assunto")).click();
		
		//Preencher Assunto
		navegador.findElement(By.name("assunto")).sendKeys("teste@teste.com");
		
		//Clicar no bot�o de anexo
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/oms-email/form/fieldset[4]/div/div[1]/div/label[2]/div/input")).click();
		
		//Selecionar Anexo
		
		
		//Selecionar Sem Checklist Correios
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/oms-email/form/fieldset[5]/div/div/div/section/oms-tipo-checklist-radio/div/label[1]/i")).click();
		
		//Selecionar Toggle Ativo
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/oms-email/form/fieldset[6]/div/div/div/ui-switch/span")).click();
		
		//Clicar em Salvar Template
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/oms-email/form/oms-submit-widget/div/button[2]")).click();		
		}
	
		//Preencher Formul�rio de Comunica��o SMS
		public void preencherFormularioComunicacaoSms() {
			//Clicar no campo Unidade de Neg�cio
			navegador.findElement(By.xpath("")).click();
			
			//Selecionar Unidade Neg�cio
			
			//Clicar no Campo Ponto de Controle
			
			//Selecionar Ponto de Controle
			
			//Clicar no Campo Descri��o 
			
			//Preencher Descri��o
			
			//Clicar no Campo Tipo Entrega
			
			//Preencher Tipo Entrega
			
			//Clicar no campo Template Push
			
			//Preencher Template Push
			
			//Clicar no campo Titulo
			
			//Preencher campo Titulo
			
			//Clicar no Campo Dispositivo
			
			//Preencher o campo Dispositivo
			
			//Clicar no campo Hash Dispositivo M�vel
			
			//Preencher o campo Hash Dispositivo M�vel
			
			//Clicar no campo URL
			
			//Preencher URL
			
			//Clicar no campo Expira Em
			
			//Selecionar valor para o campo Expira EM
			
			//Clicar no campo Som
			
			//Preencher o campo Som
			
			//Selecionar Prioridade
			
			//Selecionar Toggle Ativo
			
			//Clicar em Salvar
			
			}

	
		//Preencher Formul�rio de Comunica��o PUSH
				public void preencherFormularioComunicacaoPush() {	
					//Clicar no campo Unidade de neg�cio
					navegador.findElement(By.xpath("")).click();
			
					}

	
}
