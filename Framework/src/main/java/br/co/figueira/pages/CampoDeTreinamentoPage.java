package br.co.figueira.pages;
import br.co.figueira.BasePage;

public class CampoDeTreinamentoPage extends BasePage {
	
	
	/*** *** *** Set's  *** *** ***/
	
	/*** Name ***/
	public void setNome(String nome) {
		dsl.escrever("elementosForm:nome", nome);
	}
	
	public void setSobrenome(String sobrenome) {
		dsl.escrever("elementosForm:sobrenome", sobrenome);
	}
	
	/*** Sex ***/
	public void setSexoMasculino() {
		dsl.selecionarRadio("elementosForm:sexo:0");
	}
	
	public void setSexoFeminino() {
		dsl.selecionarRadio("elementosForm:sexo:1");
	}
	
	/*** Favorite Food ***/
	public void setComidaCarne() {
		dsl.selecionarCheck("elementosForm:comidaFavorita:0");
	}
	
	public void setComidaFrango() {
		dsl.selecionarCheck("elementosForm:comidaFavorita:1");
	}
	
	public void setComidaPizza() {
		dsl.selecionarCheck("elementosForm:comidaFavorita:2");
	}
	
	public void setComidaVegetariano() {
		dsl.selecionarCheck("elementosForm:comidaFavorita:3");
	}
	
	/*** School ***/
	public void setEscolaridade(String escolaridade) {
		dsl.select("elementosForm:escolaridade", escolaridade);
	}
	
	/*** Favorite Sport ***/
	public void setEsporte(String... esporte) {
		for(String valor: esporte) {
		dsl.select("elementosForm:esportes", valor);
		}
	}
	
	/*** Click Button ***/
	public void setBotaoCadastrar() {
		dsl.clicarBotao("elementosForm:cadastrar");
	}
	
	/*** *** *** Get's  *** *** ***/
	public String retornarCadastro() {
		return dsl.retornaTxtPag("resultado");
	}
	
	public String retornarNomeCadastro() {
		return dsl.retornaTxtPag("descNome");
	}
	
	public String retornarSobrenomeCadastro() {
		return dsl.retornaTxtPag("descSobrenome");
	}
	
	public String retornarSexoCadastro() {
		return dsl.retornaTxtPag("descSexo");
	}
	
	public String retornarComidaCadastro() {
		return dsl.retornaTxtPag("descComida");
	}
	
	public String retornarEscolaridadeCadastro() {
		return dsl.retornaTxtPag("descEscolaridade");
	}
	
	public String retornarEsporteCadastro() {
		return dsl.retornaTxtPag("descEsportes");
	}
}
