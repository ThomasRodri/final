package challenge2.model;

public class Funcionario {
	
	private int codigo; //Código de acesso é 123456
	
	public Funcionario() {
		
	}

	public Funcionario(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		try {
			if (codigo > 100000) {
				this.codigo = codigo;				
			} else {
				throw new Exception("ERRO"
						+ "\n CÓDIGO NÃO PODE TER MENOS DE 6 ALGARISMOS OU NEGATIVO");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
