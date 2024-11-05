package challenge2.model;

import java.time.LocalDate;

public class Sinistro {

	private LocalDate dataDoSinistro;
	private String DescricaoDoSinistro;
	private String avaliacaoDeDanos;
	private float valorDoPrejuizo;
	
	public Sinistro(){
		
	}
	
	public Sinistro(LocalDate dataDoSinistro, String descricaoDoSinistro, String avaliacaoDeDanos,
			float valorDoPrejuizo) {
		this.dataDoSinistro = dataDoSinistro;
		DescricaoDoSinistro = descricaoDoSinistro;
		this.avaliacaoDeDanos = avaliacaoDeDanos;
		this.valorDoPrejuizo = valorDoPrejuizo;
	}



	public LocalDate getDataDoSinistro() {
		return dataDoSinistro;
	}
	public void setDataDoSinistro(LocalDate dataDoSinistro) {
		this.dataDoSinistro = dataDoSinistro;
	}
	public String getDescricaoDoSinistro() {
		return DescricaoDoSinistro;
	}
	public void setDescricaoDoSinistro(String descricaoDoSinistro) {
		DescricaoDoSinistro = descricaoDoSinistro;
	}
	public String getAvaliacaoDeDanos() {
		return avaliacaoDeDanos;
	}
	public void setAvaliacaoDeDanos(String avaliacaoDeDanos) {
		this.avaliacaoDeDanos = avaliacaoDeDanos;
	}
	public float getValorDoPrejuizo() {
		return valorDoPrejuizo;
	}
	public void setValorDoPrejuizo(float valorDoPrejuizo) {
		this.valorDoPrejuizo = valorDoPrejuizo;
	}
	
	//M
	
	public void sinistro() {
	}
}
