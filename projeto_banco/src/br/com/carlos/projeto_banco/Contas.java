package br.com.carlos.projeto_banco;

public class Contas {

	int numeroConta;
	private double saldoConta;
	
	void setSaque(double valor) {
		if(valor <= this.saldoConta) {
			this.saldoConta -= valor;
		}else {
			System.out.println("Não possui saldo");
		}
	}
	
	void setDeposita(double deposita) {
		this.saldoConta += deposita;
	}
	double getSaldo() {
		 return this.saldoConta;
	}
}
