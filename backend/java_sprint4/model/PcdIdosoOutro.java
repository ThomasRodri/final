package challenge2.model;

public class PcdIdosoOutro {

	private Boolean confirmaPcd;
	private String historicoMedico;
	private String exames;
	private String laudoDeComprovacao;
	private float riscoClienteValor;
	
	public PcdIdosoOutro() {
		
	}
		
	public PcdIdosoOutro(Boolean confirmaPcd, String historicoMedico, String exames, String laudoDeComprovacao,
			float riscoClienteValor) {
		this.confirmaPcd = confirmaPcd;
		this.historicoMedico = historicoMedico;
		this.exames = exames;
		this.laudoDeComprovacao = laudoDeComprovacao;
		this.riscoClienteValor = riscoClienteValor;
	}


	public Boolean getconfirmaPcd() {
		return confirmaPcd;
	}
	public void setconfirmaPcd(Boolean confirmaPcd) {
		this.confirmaPcd = confirmaPcd;
	}
	public String getHistoricoMedico() {
		return historicoMedico;
	}
	public void setHistoricoMedico(String historicoMedico) {
		this.historicoMedico = historicoMedico;
	}
	public String getExames() {
		return exames;
	}
	public void setExames(String exames) {
		this.exames = exames;
	}
	public String getLaudoDeComprovacao() {
		return laudoDeComprovacao;
	}
	public void setLaudoDeComprovacao(String laudoDeComprovacao) {
		this.laudoDeComprovacao = laudoDeComprovacao;
	}
	public float getRiscoClienteValor() {
		return riscoClienteValor;
	}
	public void setRiscoClienteValor(float riscoClienteValor) {
		this.riscoClienteValor = riscoClienteValor;
	}
	
}	
