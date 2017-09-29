package pl.atena.edu.akademia1;

public class XZadanie {

public static void main(String[] args) {
		
		
		
    Integer[][] tab2 = new Integer[10][10];

    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            if (i == j || i + j == 9) {
                tab2[i][j] = 1;
            } else {
                tab2[i][j] = 0;
            }
            System.out.printf("%4d", tab2[i][j]);
        }
        System.out.println();
		

	
	
    }
	
}
	
}
