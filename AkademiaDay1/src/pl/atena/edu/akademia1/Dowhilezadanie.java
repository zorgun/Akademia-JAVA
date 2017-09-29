package pl.atena.edu.akademia1;

import java.util.Random;

public class Dowhilezadanie {

	public static void main(String[] args) {
		
		
		Random generator = new Random();
		int iter2 = 0;
		int iteracje = 5;
		int maximus = 0;
		int minimus = 100;
		int los2 = 0;
		int sum2 = 0;
		int sredniak;
		
		do { 
			iter2 ++;
			los2 = generator.nextInt(100);
			
			if (maximus < los2) { 
				maximus = los2;
					
			}
			
			if (minimus > los2) {
				minimus = los2;
			}
			sum2 = sum2 + los2; // to samo co: sum2 += los2
		} while (iter2 < iteracje);

		sredniak = sum2/iter2;
		
		System.out.println(minimus);
		System.out.println(maximus);

		System.out.println(sum2);
		System.out.println(sredniak);
		
		System.out.printf("Liczba minimalna %d ",minimus);
		System.out.printf("Liczba maksymalna %d ",maximus);
		System.out.printf("Liczba minimalna %d ",sredniak);
	}

}
