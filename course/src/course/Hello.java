package course;

import java.util.Scanner;

import entities.Student;

public class Hello {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Student aluno = new Student();
		
		aluno.nota1 = s.nextDouble();
		aluno.nota2 = s.nextDouble();
		aluno.nota3 = s.nextDouble();
		
		aluno.nfinal = aluno.nota1 + aluno.nota2 + aluno.nota3;
		
		aluno.pass();
		
		s.close();
	}

}
