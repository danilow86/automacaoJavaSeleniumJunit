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
	


	
	//*****************************Métodos da Página de TEMPLATES********************************************************
	//Esperar Carregar Página
					
	//Selecionar a opção TEMPLATE no Menu
	public templatesPage selecionarMenuTemplate() {
					navegador.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[1]/ul/li[1]/a/span")).click();
		return this;
					}

	//Pesquisar TEMPLATES sem informar parâmetros para consulta
	public templatesPage pesquisarTemplateSemParametros() {
		navegador.findElement(By.xpath("//*[@id=\"content\"]/oms-template-filtro/oms-widget-panel/div/div/div/div/div/form/oms-submit-widget/div/button[2]")).click();												
		return this;
		}
	
	
	//Clicar no botão Novo Template
	public templatesPage clicarNoBotaoNovoTemplate() {
		navegador.findElement(By.id("[@id=\"content\"]/oms-header-content/div/div/button")).click();
		return this;
		}
	
	
	//Selecionar Tipo Comunicação
	public templatesPage selecionarTipoComunicacao() {
		navegador.findElement(By.id("[@id=\"content\"]/oms-header-content/div/div/button")).click();
		return this;
		}
					
	//Selecionar Tipo Comunicação Email
	public templatesPage selecionarComunicacaoEmail() {
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/form/div/section/oms-tipo-comunicacao-radio/div/label[2]")).click();
		return this;
		}
	
	//Selecionar Tipo Comunicação SMS
		public templatesPage selecionarComunicacaoSms() {
			navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/form/div/section/oms-tipo-comunicacao-radio/div/label[1]/i")).click();
			return this;
			}
		
		//Selecionar Tipo Comunicação Push
		public templatesPage selecionarComunicacaoPush() {
			navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/form/div/section/oms-tipo-comunicacao-radio/div/label[3]/i")).click();
			return this;
			}
	
	//Preencher Template de comunicação Email
	public void preencherFormularioComunicacaoEmail() {
		
		//Clicar no campo Unidade de negócio
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/oms-email/form/fieldset[1]/div/div/div[1]/oms-unidade-negocio-select/ng-select/div/div/div[2]/input")).click();

		//Selecionar unidade de negócio
		navegador.findElement(By.id("abb766a994b5"));
		
		//Clicar no campo Ponto de controle
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/oms-email/form/fieldset[1]/div/div/div[2]/oms-ponto-controle-select/ng-select/div")).click();
		
		//Selecionar Ponto de Controle 
		navegador.findElement(By.id("a4da3a7751ab"));
		
		//Inserir Descrição
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
		
		//Clicar no botão de anexo
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/oms-email/form/fieldset[4]/div/div[1]/div/label[2]/div/input")).click();
		
		//Selecionar Anexo
		
		
		//Selecionar Sem Checklist Correios
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/oms-email/form/fieldset[5]/div/div/div/section/oms-tipo-checklist-radio/div/label[1]/i")).click();
		
		//Selecionar Toggle Ativo
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/oms-email/form/fieldset[6]/div/div/div/ui-switch/span")).click();
		
		//Clicar em Salvar Template
		navegador.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/oms-email/form/oms-submit-widget/div/button[2]")).click();		
		}
	
		//Preencher Formulário de Comunicação SMS
		public void preencherFormularioComunicacaoSms() {
			//Clicar no campo Unidade de Negócio
			navegador.findElement(By.xpath("")).click();
			
			//Selecionar Unidade Negócio
			
			//Clicar no Campo Ponto de Controle
			
			//Selecionar Ponto de Controle
			
			//Clicar no Campo Descrição 
			
			//Preencher Descrição
			
			//Clicar no Campo Tipo Entrega
			
			//Preencher Tipo Entrega
			
			//Clicar no campo Template Push
			
			//Preencher Template Push
			
			//Clicar no campo Titulo
			
			//Preencher campo Titulo
			
			//Clicar no Campo Dispositivo
			
			//Preencher o campo Dispositivo
			
			//Clicar no campo Hash Dispositivo Móvel
			
			//Preencher o campo Hash Dispositivo Móvel
			
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

	
		//Preencher Formulário de Comunicação PUSH
				public void preencherFormularioComunicacaoPush() {	
					//Clicar no campo Unidade de negócio
					navegador.findElement(By.xpath("")).click();
			
					}

	
}
