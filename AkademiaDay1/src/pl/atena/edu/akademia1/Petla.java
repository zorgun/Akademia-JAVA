package pl.atena.edu.akademia1;

//ctr shif o
import java.util.Random;

public class Petla {

	public static void main(String[] args) {
		
		Integer warunek = Integer.valueOf(100);
		Integer sum = Integer.valueOf(0);
		int iteracje = 0;
		
		Random generator = new Random();
		
		while (sum.compareTo(warunek) < 0) {
			sum += generator.nextInt(10);
			iteracje++;
		}
		
		System.out.printf("osi¹gniêto liczbê %d w %d iteracjach", sum, iteracje, args);
		
		/* dokoñczyæ suma liczb parzystych mniejsza od 100
		Integer warunek1 = Integer.valueOf(101);
		Integer liczba = Integer.valueOf(2);

		Integer skok = Integer.valueOf(2);
		
		while (liczba.compareTo(warunek1) < 0) {
			;
			;
		}*/
		
	}
		
		public static void main2(String[] args) {
		
		int suma1 = 0, iter = 0;
		while (iter <=100) {
			suma1 += ++iter %2 ==0 ? iter :0;
		}
		System.out.println(suma1);
		
		}
	
	
	
	
	
	
	
	
	
	
	
}
