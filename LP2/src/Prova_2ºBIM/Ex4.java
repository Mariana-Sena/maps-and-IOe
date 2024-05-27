package Prova_2ºBIM;

import java.util.HashMap;

public class Ex4 {

	public static void main(String[] args) {
		
		HashMap<String,String> valores1;
		valores1 = new HashMap<String,String>();
		HashMap<String,String> valores2;
		valores2 = new HashMap<String,String>();
		
		for(Integer a = 1;a< 4; a++) {
			valores1.put(a.toString(), a.toString() + a.toString());
			Integer b = a * a;
			valores2.put(a.toString(), b.toString());
		}
		valores1.putAll(valores2);
		
		for(String x: valores1.keySet())
			System.out.print(x + valores1.get(x));
	}

}
