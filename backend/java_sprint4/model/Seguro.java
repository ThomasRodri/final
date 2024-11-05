package challenge2.model;

public class Seguro {

	private String numeroDeContado;
	private String tipoPlanosSeguro;
	private String coberturasIncluidas;
	private String planosParaClientesEspeciais;
	
	public Seguro() {
		
	}
	
	
	public Seguro(String numeroDeContado, String tipoPlanosSeguro, String coberturasIncluidas,
			String planosParaClientesEspeciais) {
		this.numeroDeContado = numeroDeContado;
		this.tipoPlanosSeguro = tipoPlanosSeguro;
		this.coberturasIncluidas = coberturasIncluidas;
		this.planosParaClientesEspeciais = planosParaClientesEspeciais;
	}


	public String getNumeroDeContado() {
		return numeroDeContado;
	}
	public void setNumeroDeContado(String numeroDeContado) {
		this.numeroDeContado = numeroDeContado;
	}
	public String getTipoPlanosSeguro() {
		return tipoPlanosSeguro;
	}
	public void setTipoPlanosSeguro(String tipoPlanosSeguro) {
		this.tipoPlanosSeguro = tipoPlanosSeguro;
	}
	public String getCoberturasIncluidas() {
		return coberturasIncluidas;
	}
	public void setCoberturasIncluidas(String coberturasIncluidas) {
		this.coberturasIncluidas = coberturasIncluidas;
	}
	public String getPlanosParaClientesEspeciais() {
		return planosParaClientesEspeciais;
	}
	public void setPlanosParaClientesEspeciais(String planosParaClientesEspeciais) {
		this.planosParaClientesEspeciais = planosParaClientesEspeciais;
	}
	
}
