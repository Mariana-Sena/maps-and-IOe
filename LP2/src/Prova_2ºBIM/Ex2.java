package Prova_2ºBIM;
import java.util.HashMap;

public class Ex2 {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer>valores;
		valores = new HashMap<Integer,Integer>();
		
		for(int a = 1; a < 5; a++) 
			valores.put(a, a * a);
		
		for(Integer x:valores.keySet())
			System.out.print(x + valores.get(x));
	}

}
