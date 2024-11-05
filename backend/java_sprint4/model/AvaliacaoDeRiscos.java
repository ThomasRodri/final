package challenge2.model;

public class AvaliacaoDeRiscos {

	private String analiseSaude;
	private String avaliacaoVeiculoClienteEsp;
	
	//getters setters
	public AvaliacaoDeRiscos(){
		
	}
	
	public AvaliacaoDeRiscos(String analiseSaude, String avaliacaoVeiculoClienteEsp) {
		this.analiseSaude = analiseSaude;
		this.avaliacaoVeiculoClienteEsp = avaliacaoVeiculoClienteEsp;
	}


	public String getAnaliseSaude() {
		return analiseSaude;
	}
	public void setAnaliseSaude(String analiseSaude) {
		this.analiseSaude = analiseSaude;
	}
	public String getAvaliacaoVeiculoClienteEsp() {
		return avaliacaoVeiculoClienteEsp;
	}
	public void setAvaliacaoVeiculoClienteEsp(String avaliacaoVeiculoClienteEsp) {
		this.avaliacaoVeiculoClienteEsp = avaliacaoVeiculoClienteEsp;
	}
	
	//M
	public void avaliacaoDeRisco() {
	}
	
}
