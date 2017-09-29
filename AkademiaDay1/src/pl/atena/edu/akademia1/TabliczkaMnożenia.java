package pl.atena.edu.akademia1;

public class TabliczkaMno¿enia {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (i == 0) {
					System.out.printf("%4d", j);

				} else if (j == 0) {
					System.out.printf("%4d", i);

				} else {
					System.out.printf("%4d", i * j);

				}
				
			} System.out.println();

		}

	}

}
