package pl.atena.edu.akademia1;

public class PoleProstokata {

	public static void main(String[] args) {
		double a = 10.26;
		double b = 12.36;

		double c = a * b;

		System.out.print("D³ugoœæ boku a = ");
		System.out.println(a);
		System.out.println("D³ugoœæ boku b = " + b);
		// System.out.println(b);
		System.out.print("Pole = ");
		System.out.println(c);

		if (!(a >= 1 && a <= 10)) {
			System.out.print("Liczba A jest spoza zakresu od 1 do 10");
			return;
		}
		if (!(b >= 1 && b <= 10)) {
			System.out.print("Liczba B jest spoza zakresu od 1 do 10");
			return;
		}

		// if (a>=1 && a <=10) {
		// else
		// System .out.print("Liczba A jest spoza zakresu od 1 do 10");
		// return;
		// }

	}

}
