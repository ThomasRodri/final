package challenge2.model;

public class AvaliacaoSinistro extends Sinistro {

	private String documentacao;
	private boolean decisaoDaCobertura;
	private String acoesRecomendadas;
	
	public AvaliacaoSinistro(){
		
	}
	
	public AvaliacaoSinistro(String documentacao, boolean decisaoDaCobertura, String acoesRecomendadas) {
		super();
		this.documentacao = documentacao;
		this.decisaoDaCobertura = decisaoDaCobertura;
		this.acoesRecomendadas = acoesRecomendadas;
	}

	//getters setters
	public String getDocumentacao() {
		return documentacao;
	}
	public void setDocumentacao(String documentacao) {
		this.documentacao = documentacao;
	}
	public boolean isDecisaoDaCobertura() {
		return decisaoDaCobertura;
	}
	public void setDecisaoDaCobertura(boolean decisaoDaCobertura) {
		this.decisaoDaCobertura = decisaoDaCobertura;
	}
	public String getAcoesRecomendadas() {
		return acoesRecomendadas;
	}
	public void setAcoesRecomendadas(String acoesRecomendadas) {
		this.acoesRecomendadas = acoesRecomendadas;
	}
	
}
