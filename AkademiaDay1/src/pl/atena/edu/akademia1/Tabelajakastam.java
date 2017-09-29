package pl.atena.edu.akademia1;

public class Tabelajakastam {
	public static void main(String[] args) {
		
		//poprawic zgodnie z prezentacja
		
		Integer [][] taba2 = new Integer [10][10];
		for (int a=1; a<10;a++) {
			for (int b=1; b<10;b++) {
				taba2[a][b] = b;
			}
		}
		
		for (Integer[] kolumna: taba2) {
			for (Integer element: kolumna) {
				System.out.print (element);
			}
			System.out.println();
		} 
		
			
		
		

		
		
		
		
		
		
		
		

	}
}
