package pl.atena.edu.akademia1;

public class Stringi {

	public static void main(String[] args) {
		
		int age = 42;
		String output = age + " lata";
		System.out.println(output);
		
		String kursanci = String.join(", ","rozenek", "julian"); // pierwszy element to separator
		System.out.println(kursanci);
		
		String adam1 = "adam";
		String adam2 = "adam jest boski".substring(0, 4);
		System.out.println(adam2);
		
		boolean test2 = adam1.equals(adam2);
				System.out.println(test2);
				
		kursanci.substring(6);
				
	}
	
	
	
	
}
