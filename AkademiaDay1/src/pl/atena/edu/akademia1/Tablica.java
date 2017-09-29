package pl.atena.edu.akademia1;

import java.util.Arrays;

public class Tablica {

	public static void main(String[] args) {
		
		int[] tablica;
		int[] tablica2 = new int[10];
		int[] tablica3 = {1, 2, 3, 4};
		
		
		float[] tablica4 = new float[10];
				
		for (int i = 0; i < 10; i++) {
			System.out.println(tablica4[i]);
		}
		
		for (int i = 0; i < tablica4.length; i++) {		//lenght wielkosc tablicy
			System.out.println(tablica4[i]);
		}

		for (float item: tablica4) {
			System.out.println(item);
		}
		
		long[] tablica5 = new long[10];
		int i = 0;
		for (long itemek: tablica5) {
			System.out.printf("Wartoœæ komórki o indeksie %d równa %d \n", i++, itemek);
		}
		
		
		int[] deska = { 1, 2, 3, 4 };
		int[] deska2 = deska;
		
		
		int[] taba1 = { 4,6,5,1,9,7 };
		Arrays.sort(taba1);
		System.out.println(Arrays.toString(taba1));
		


		
		
	}
}
