package pl.atena.edu.akademia1;

import java.util.Random;

public class P�tlaDoWhile {
	
	public static void main(String[] args) {
	
		Random generator = new Random();
		
	int iteracje = 0;
	int liczba=5 , los =0;
	do {
		los = generator.nextInt(10);
		iteracje ++;
	} while (los != liczba);
	
	System.out.printf("Osi�gni�to liczb� %d w %d iteracjach ", liczba, iteracje);
	
	}
	
	
	
	

	
	
	
	
	

}
