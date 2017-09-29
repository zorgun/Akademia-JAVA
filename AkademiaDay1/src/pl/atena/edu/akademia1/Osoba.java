package pl.atena.edu.akademia1;



public class Osoba {

	public static void main(String[] args) {
		
	
	OsobaCore osoba1 = new OsobaCore();
	/*OsobaCore osoba2 = new OsobaCore(" Heniek");*/
	OsobaCore osoba3 = new OsobaCore(16);
	OsobaCore osoba4 = new OsobaCore(23,189);
	OsobaCore osoba5 = new OsobaCore("Henio", "Wielki",23,189);
	OsobaCore osoba6 = OsobaCore.instance("Romek");
	
	/*
	final OsobaCore osoba7 = OsobaCore.instance("Romek");
	*/
	
	System.out.println(osoba1);
	System.out.println(osoba3);
	System.out.println(osoba4);
	System.out.println(osoba5);
	System.out.println(osoba6);
	
	osoba4.dodajLat(5);
	System.out.println(osoba4);
	
	osoba3.pelnoletni();
	System.out.println(osoba3 + " pe³noletnia: " + osoba3.pelnoletni());
	System.out.println(osoba3 + " pe³noletnia: " + (osoba3.pelnoletni() ?  "tak": "nie"));
	
	
	}
	
}
