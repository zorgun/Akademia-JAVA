package pl.atena.edu.akademia1;

import java.util.Scanner;

public class PoleProstokata3 {
	private static Scanner scanner = new Scanner(System.in);

	public static final int MIN = 1;
	public static final int MAX = 12;

	public static boolean sprawdz(int liczba, String komunikat) {

		if (!(liczba >= MIN && liczba <= MAX)) {
			System.out.println("liczba " + komunikat + " jest spoza zakresu od 1 do 10");
			return false;
		}
		return true;

	}

	public static String mniesiondz(int msc) {
		if (msc < 1 || msc > 4) {
			return "Niepoprawna wartoœæ dla miesi¹ca";
		}
		String imiemisiaca = null;

		switch (msc) {
		case 1:
			imiemisiaca = "Styczeñ";
			break;

		case 2:
			imiemisiaca = "luty";
			break;
		case 3:
			imiemisiaca = "marzec";
			break;
		default:
			break;
		}
		return imiemisiaca;

	}

	/**
	 * @param args   --- skrót szift + alt + j
	 */
	public static void main(String[] args) {

		System.out.println("Podaj liczbê dla miesi¹ca: ");
		String ma = scanner.nextLine();

		int xx = Integer.valueOf(ma);

		String mniesiu = mniesiondz(xx);

		System.out.println(mniesiu);

		////////////////
		System.out.println("Podaj wartoœæ boku a: ");
		String sa = scanner.nextLine();

		System.out.println("Podaj wartoœæ boku b: ");
		String sb = scanner.nextLine();

		int a = Integer.valueOf(sa);
		int b = Integer.valueOf(sb);

		boolean testA = sprawdz(a, "A");
		boolean testb = sprawdz(a, "B");

		if (testA && testb) {
			int result = a * b;
			System.out.println(result);
		}

		if (!testA && !testb) {
			System.out.println("We¿ siê ogarnij");
		} else if (testA && !testb) {
			System.out.println("We¿ siê ogarnij");
		} else if (!testA && testb) {
			System.out.println("We¿ siê ogarnij");
		} else {
			int result = a * b;
			System.out.println(result);
		}

		String tekst = null;
		switch (a) {
		case 1:
			tekst = "jeden";
			break;

		case 2:
			tekst = "dwa";
			break;
		case 3:
			tekst = "trzy";
			break;
		default:
			break;
		}
		System.out.println(tekst);

		// int result = a * b;

		// System.out.println(result);

	}

}
