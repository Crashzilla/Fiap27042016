package Aula27042016;

public class ContaBancaria {

	protected double saldo;
	protected String nomeCliente;
	protected String endCliente;
	protected String cpfCliente;
	
	public ContaBancaria(String nomeCliente, String endCliente, String cpfCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.endCliente = endCliente;
		this.cpfCliente = cpfCliente;
	}
	public void saque(double valor)throws Exception{
		saldo-=valor;
		}
	public void deposita(double valor){
		saldo+=valor;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEndCliente() {
		return endCliente;
	}
	public void setEndCliente(String endCliente) {
		this.endCliente = endCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	
	
}
