package Prova_2ºBIM;
import java.util.HashMap;

public class Ex5 {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> valores;
		valores = new HashMap<Integer,Integer>();
		
		for(int a = 1; a < 5; a++) {
			valores.put(a, a*a);
			valores.put(a + 1, a * a);
		}
		
		for(int a = 1;a < 5; a++)
			valores.remove(a + a);
		
		for(Integer x: valores.keySet())
			System.out.print(x + valores.get(x))	;
	}

}
