package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Aluno aluno = new Aluno();
		
		System.out.print("Enter with name of student: ");
		aluno.name = sc.nextLine();
		System.out.print("Enter media 1, 2 and 3: ");
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.calcNota());
		
		if (aluno.calcNota() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.pontosRestantes());
		}
		else {
			System.out.println("PASS");
		}
		
		
		
		sc.close();
	}

}
