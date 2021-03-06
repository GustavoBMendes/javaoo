package contaBancaria;

import java.util.Scanner;

import entities.Cliente;

public class Conta {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int conta;
		double deposito = 0.0;
		String nome;
		Cliente cli;
		
		System.out.println("Enter account number: ");
		conta = s.nextInt();
		System.out.println("Enter account holder: ");
		s.nextLine();
		nome = s.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char opt = s.next().charAt(0);
		if(opt == 'y') {
			System.out.println("Enter initial deposit value: ");
			deposito = s.nextDouble();
			cli = new Cliente(nome, conta, deposito);
		}
		
		else {
			cli = new Cliente(nome, conta);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(cli);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		deposito = s.nextDouble();
		cli.deposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(cli);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double saque = s.nextDouble();
		cli.saque(saque);
		System.out.println("Updated account data: ");
		System.out.println(cli);
		
		s.close();
	}

}
