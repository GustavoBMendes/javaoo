package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		System.out.println("How many employees will be registered?");
		int n = s.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.println("ID: ");
			int id = s.nextInt();
			System.out.println("Name: ");
			s.nextLine();
			String nome = s.nextLine();
			System.out.println("Salary: ");
			double salario = s.nextDouble();
			list.add(new Funcionario(id, nome, salario));
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = s.nextInt();
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if(func == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = s.nextDouble();
			func.aumento(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Funcionario obj: list) {
			System.out.println(obj);
		}
		
		s.close();
	}

}
