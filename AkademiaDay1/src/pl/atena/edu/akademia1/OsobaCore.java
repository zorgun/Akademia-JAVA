package pl.atena.edu.akademia1;

public class OsobaCore {

	public static final int PELNOLETNOSC = 18;
	
	private String imie;
	private String nazwisko;
	private int wiek;
	private int wzrost = 0;
	
	
	
	
	public OsobaCore(int wiek) {
		//super();
		this.wiek = wiek;
		System.out.println(wiek);
	}

	public OsobaCore() {
		System.out.print("Jestem");
	}
	/*
	public OsobaCore(String komunikat ) {
		System.out.println(komunikat);
	}
	*/
	/*public OsobaCore(Integer latka ) {
		System.out.println(latka);
	}*/
	/*
	public OsobaCore(int wiek, int wzrost) {
		//super();
		this.wiek = wiek;
		this.wiek = 20;   //inicjacja zmiennej
		this.wzrost = wzrost;
		System.out.println(wiek);
		System.out.println(wzrost);
	}
	*/
	//albo
	
	public OsobaCore(int wiek, int wzrost) {
		//super();
		
		this(wiek);   // odwo³anie do wartoœci w linii 16
		this.wzrost = wzrost;
		System.out.println(wiek);
		System.out.println(wzrost);
	}
	
	public OsobaCore(String imie, String nazwisko, int wiek, int wzrost) {
		//super();

		this(wiek, wzrost);
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	private OsobaCore(String imie) {
		//super();
		this.imie = imie;
	}
	
	public static OsobaCore instance(String imie) {
		return new OsobaCore(imie);
	}
	
	public void dodajLat(int lata) {
		this.wiek += lata;
	}
	
	public boolean pelnoletni() {
		return this.wiek<PELNOLETNOSC ? false: true;
	}

	@Override
	public String toString() {
		return "OsobaCore [imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + ", wzrost=" + wzrost + "]";
	}
	//wygenerowanie powyzszego stringa pomaga przy debugowaniu
	
	
	//ale jesli chcemy dodaæ now¹ metode to:
	/*
	//@Override
	public String toString(String nowy1) {
		return "OsobaCore [imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + ", wzrost=" + wzrost + "]";
	}
	*/
	
}
