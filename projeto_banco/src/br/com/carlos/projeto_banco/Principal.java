package br.com.carlos.projeto_banco;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();
		cliente1.conta = new Contas();
		
		cliente1.nome = sc.next();
		cliente1.conta.numeroConta = 123;
		
		System.out.println("Bem vindo Cliente "+ cliente1.nome + " Da conta de número " + cliente1.conta.numeroConta);
		
		Contas conta1 = new Contas();
		conta1.numeroConta = 888;
		
		Cliente cliente2 = new Cliente();
		cliente2.conta = conta1;
		cliente2.nome = "Fulano";
		
		cliente1.conta.setDeposita(300.00);
		cliente1.conta.setDeposita(300.00);
		cliente1.conta.setDeposita(900);
		cliente2.conta.setDeposita(30.00);
		
		System.out.println("O cliente "+ cliente1.nome + " possui R$: " + cliente1.conta.getSaldo());
		System.out.println("O cliente 2 possui R$: "+ cliente2.conta.getSaldo());

	}

}
