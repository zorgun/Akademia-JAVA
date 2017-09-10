package pl.atena.edu.akademia1;

import java.util.Scanner;

public class PoleKola2 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Podaj wartoœæ promienia r: ");
		String sa = scanner.nextLine();

		//System.out.println("Podaj wartoœæ liczby Pi ");
		//String sb = scanner.nextLine();

		int a = Integer.valueOf(sa);
		//int b = Integer.valueOf(sb);
		
		double b = Math.PI;
		int result = a * a * b;
		
		System.out.println(result);

	}
}
