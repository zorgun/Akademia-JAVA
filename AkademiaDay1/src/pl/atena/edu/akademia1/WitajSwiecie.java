/**
 * 
 */
package pl.atena.edu.akademia1;

import java.util.Random;



/**
 * To te¿ jest komentarz
 * @author Dorota
 *
 */
public class WitajSwiecie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// To jest komentarz
		System.out.println("Witaj Œwiecie w tê piêkn¹ Niedzielê");
		
		System.out.println((new Random()).nextInt());
		
		byte zmienna1 = 24;   //deklarowanie zmiennej
		byte zmienna2 = 12;   //deklarowanie zmiennej
		float zmienna4 = 34.34f, zmienna5;
		
		int zmienna3;
		
		System.out.println(zmienna1);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.NEGATIVE_INFINITY);
		
		for (double i = 0; i < 1; i += 0.1) {
			System.out.println(i);
		}
		
		char znak1 = '\u004a';
		System.out.println(znak1);

		char[] znaki = "Witaj Œwiecie". toCharArray();
		for(byte i = 0; i <znaki.length; i++) {
			System.out.println(znaki[i]);
			
		}
		
		int liczba2 = 456;
		liczba2++; //zwiêksza zmienn¹ o 1
		final double test = 3.14; //sta³a, nie mo¿na jej zmieniæ
		//public static final int BEST_PRACTICE = 16;

		System.out.println(Zwierzak.PIES);
		
		int z1 = 15, z2 = 12, z3 = -2;
		System.out.println(z1+z2/z3);
		
		z1 -=10; //zmniejszy zmienn¹ z1 o 10
		z2 +=5; //zwiêkszy zmienn¹ z2 0 5
		
		String[] tab = {"jeden", "dwa"};
		int indeks = 0;
		System.out.println(tab[indeks++]);
		System.out.println(tab[indeks]);
		int indeks2 = 0;
		System.out.println(tab[++indeks2]);
		System.out.println(tab[indeks2]);
		
		int test3 = 1000000000 *3;
		System.out.println(test3);
		
		int test4 = Math.multiplyExact(1000000000, 3);
		
		double x = 3.75; //konwersja z typu double na typ integer
		int n = (int) x;
		System.out.println(n);
		
		
		char c1 = 'J' + 1;
		System.out.println(c1);
		///
		byte z6 = 0, z7 = 7;
		int k = 7;
		boolean z8 = k == 9;
		boolean z9 = k != 9;
		boolean z10 = k <= 9;

		boolean z11 = k == 9;
		
		String test12 = k == 0 ? "rybka" : "frytka";
		
		
		
		
		
		
		
		
		
		
		
	}

}
