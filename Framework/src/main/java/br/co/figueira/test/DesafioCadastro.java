package br.co.figueira.test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.co.figueira.BaseTest;
import br.co.figueira.DriveFactory;
import br.co.figueira.pages.CampoDeTreinamentoPage;;

public class DesafioCadastro extends BaseTest {
	
	
	
	private CampoDeTreinamentoPage page;
	
	@Before
	public void inicializar() {
		
		DriveFactory.getDriver().get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		page = new CampoDeTreinamentoPage();
	}
	
	@Test
	public void testeCadastroComprarSaida() {
		page.setNome("Andrea");
		page.setSobrenome("Pirlo");
		page.setSexoMasculino();
		page.setComidaPizza();
		page.setEscolaridade("Mestrado");
		page.setEsporte("Futebol");
		page.setBotaoCadastrar();
		
		Assert.assertTrue(page.retornarCadastro().startsWith("Cadastrado!"));
		Assert.assertTrue(page.retornarNomeCadastro().endsWith("Andrea"));
		Assert.assertTrue(page.retornarSobrenomeCadastro().endsWith("Pirlo"));
		Assert.assertTrue(page.retornarSexoCadastro().endsWith("Masculino"));
		Assert.assertTrue(page.retornarComidaCadastro().endsWith("Pizza"));
		Assert.assertTrue(page.retornarEscolaridadeCadastro().endsWith("mestrado"));
		Assert.assertTrue(page.retornarEsporteCadastro().endsWith("Futebol"));
			
	}

}
