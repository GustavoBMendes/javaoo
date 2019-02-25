package entities;

public class Cliente {
	
	private String nome;
	private int numeroConta;
	private double saldo;
	
	public Cliente(String nome, int numeroConta) {
		this.nome = nome;
		this.numeroConta = numeroConta;
	}
	
	public Cliente(String nome, int numeroConta, double depositoInicial) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		deposito(depositoInicial);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ numeroConta
				+ ", Holder: "
				+ nome
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
	
}
