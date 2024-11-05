package challenge2.model;

public class CorretoraSeguro {

	private String nomeCorretora;
	private int contatoCorretora;
	private String enderecoCorretora;
	
	public CorretoraSeguro(){
		
	}
	
	public CorretoraSeguro(String nomeCorretora, int contatoCorretora, String enderecoCorretora) {
		this.nomeCorretora = nomeCorretora;
		this.contatoCorretora = contatoCorretora;
		this.enderecoCorretora = enderecoCorretora;
	}
	//getters setters
	public String getNomeCorretora() {
		return nomeCorretora;
	}
	public void setNomeCorretora(String nomeCorretora) {
		this.nomeCorretora = nomeCorretora;
	}
	public int getContatoCorretora() {
		return contatoCorretora;
	}
	public void setContatoCorretora(int contatoCorretora) {
		this.contatoCorretora = contatoCorretora;
	}
	public String getEnderecoCorretora() {
		return enderecoCorretora;
	}
	public void setEnderecoCorretora(String enderecoCorretora) {
		this.enderecoCorretora = enderecoCorretora;
	}
	
	//M
	public String infoCorretora(String info) {
	return info;
	}
}
