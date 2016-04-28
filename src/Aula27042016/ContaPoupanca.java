package Aula27042016;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaAniversario;

	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente) {
		super(nomeCliente, endCliente, cpfCliente);
		// TODO Auto-generated constructor stub
	}
		
	public void saque(double valor) throws SaldoInsuficienteException {
		
		if (saldo - (valor-0.1)<0){
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		}
		
		saldo-=valor+0.03*valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		ContaPoupanca conta = new ContaPoupanca(nomeCliente, endCliente, cpfCliente); 
		return conta.getCpfCliente().equals(this.cpfCliente);
	}

}
