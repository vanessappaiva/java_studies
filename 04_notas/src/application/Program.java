package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student();
		
		System.out.println("Enter name and grades:");
		st.name = sc.nextLine();
		st.nota1 = sc.nextDouble();
		st.nota2 = sc.nextDouble();
		st.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", st.notaFinal());
		
		if(st.notaFinal()<60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", st.pontosFaltantes());
		}else {
			System.out.println("PASS");
		}

		sc.close();
	}

}
