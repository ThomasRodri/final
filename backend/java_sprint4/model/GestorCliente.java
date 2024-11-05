package challenge2.model;

public class GestorCliente {

	private int clientePresente;
	private int clientesNovos;
	private int cliente;
	
	public GestorCliente() {
		
	}
	
	public GestorCliente(int clientePresente, int clientesNovos, int cliente) {
		setClientePresente(clientePresente);
		this.clientesNovos = clientesNovos;
		this.cliente = cliente;
	}



	public void setClientePresente(int clientePresente) {
		try {
			if (clientePresente <= 0) {
				System.out.println("Não há clientes no momento.");
				this.clientePresente = clientePresente;
			} else {
				System.out.println(cliente + " cliente(s)");
				this.clientePresente = clientePresente;
			}
		} catch (Exception e) {
			
		}
	}
	
	public int ClientePresente() {
		return clientePresente;
	}
	public int getClientesNovos() {
		return clientesNovos;
	}
	public void setClientesNovos(int clientesNovos) {
		this.clientesNovos = clientesNovos;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		try {
			if (cliente >= 0) {
				this.cliente = cliente;				
			} else {
				throw new Exception("ERRO 01");
			}
		} catch (Exception e) {
			System.out.println("Valor inválido para clientes" + e.getMessage());
		}
	}
	
	//M
	public void adicionarCliente(int clientePresente) {
		if (clientePresente >= 0) {
			clientePresente++;
		}
	}
	
	public void excluirCliente(int clientePresente) {
		if (clientePresente > 0) {
			clientePresente--;
		}
	}
}
