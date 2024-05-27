package Prova_2ºBIM;

import java.util.HashMap;

public class q1 {

	public static void main(String[] args) {
		HashMap<String, String> valores;
		valores = new HashMap<String, String>();
		String x = "";
		
		for(int a = 1; a < 3; a++) {
			x = Integer.toString(a+a);
			valores.put(x, x + "9");
			
			for(String y: valores.keySet())
				System.out.print(y + valores.get(x));
		}
	}

}
