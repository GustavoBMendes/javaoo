package entities;

public class Student {

	public String nome;
	public double nota1,
				  nota2,
				  nota3,
				  nfinal;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNfinal() {
		return nfinal;
	}

	public void setNfinal(double nfinal) {
		this.nfinal = nfinal;
	}

	public void pass() {
		nfinal = nota1 + nota2 + nota3; 
		if( nfinal > 60) {
			System.out.println("FINAL GRADE: " + nfinal);
			System.out.println("PASS");
		}
		else {
			System.out.println("FINAL GRADE: " + nfinal);
			System.out.println("FAILED");
			System.out.println("MISSING " + (60 - nfinal) + "POINTS");
		}
	}
	
}
