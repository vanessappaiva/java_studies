package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		
		rec.width = sc.nextDouble();
		rec.heitght = sc.nextDouble();
		
		System.out.println();
		System.out.println(rec);
		sc.close();

	}

}
