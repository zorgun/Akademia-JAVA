package pl.atena.edu.akademia1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigVonDecimal {

	public static void main(String[] args) {


		BigInteger n = BigInteger.valueOf(98767465362898756L);
		
		BigDecimal bd = BigDecimal.ONE;
		
		System.out.print(bd);
		System.out.println(n);
		
		//najwiêkszy wspolny dzielnik
		

		BigInteger nwd = BigInteger.valueOf(100).gcd(BigInteger.valueOf(8));
		System.out.println(nwd);
	}

}
