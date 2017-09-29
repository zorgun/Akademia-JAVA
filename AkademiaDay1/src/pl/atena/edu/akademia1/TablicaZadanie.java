package pl.atena.edu.akademia1;

public class TablicaZadanie {

	public static void main(String[] args) {

		
		int tablica [] = new int[10], liczba =9;
		for (int i = 0; i < tablica.length; i++, liczba--) {
			tablica[i] = liczba;
		}
		
		for (int item: tablica  ) {
			System.out.printf("%4d", tablica[item]);
		}
		
		
		
		
		
		
		

	}

}
