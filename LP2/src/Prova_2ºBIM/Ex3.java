package Prova_2ºBIM;

import java.util.HashMap;

public class Ex3 {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> valores1;
		valores1 = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> valores2;
		valores2 = new HashMap<Integer,Integer>();
		
		for(int a = 1; a < 4; a++) {
			valores1.put(a, a+a);
			valores2.put(a,a * a);
		}
		valores1.putAll(valores2);
		for(Integer x: valores1.keySet())
			System.out.print(x + valores1.get(x));
		
	}

}
