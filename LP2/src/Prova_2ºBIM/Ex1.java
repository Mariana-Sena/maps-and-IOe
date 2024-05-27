package Prova_2ºBIM;

import java.util.HashMap;

public class Ex1 {
	
	public static void main (String[] args) {
		HashMap<String,String> valores;
		valores = new HashMap<String,String>();
		String x = "";
		
		for (int a = 1; a < 3; a++) {
			x = Integer.toString(a);
			valores.put(x, x + x);
		}
		for(String y:valores.keySet())
			System.out.print(y + valores.get(x));
	}
}

