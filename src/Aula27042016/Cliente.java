package Aula27042016;

public class Cliente {

	private String nome;
	private double cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		
		return nome;
	}
	
}
