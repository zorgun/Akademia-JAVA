package pl.atena.edu.akademia1;

import java.util.Scanner;

public class Tekst {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	String tekst = "Cze�� dziewczynki \n Macie chwilk�?";
	Scanner scanner = new Scanner(tekst);
	
	System.out.println("Czy jest jaka� linia do wczytania?" + scanner.hasNext());
	System.out.println("Wczytuje " + scanner.nextLine());
	System.out.println("Czy jest jaka� linia do wczytania?" + scanner.hasNext());
	System.out.println("Wczytuje " + scanner.nextLine());
	System.out.println("Czy jest jaka� linia do wczytania?" + scanner.hasNext());

	scanner.close();
	
	
	
	System.out.printf("%8.2f", 1000.0/3.0);
	System.out.println();
	
	String message = String.format("Witaj,%s. Za rok bedziesz mie� %d lat. \n", "Zdzisiu",40);
	System.out.println(message);
	//liczba PI zaokr�glona do 5 miejsc po przecinku
	System.out.printf("%.5f", Math.PI);
	}
	
}

/*

*/