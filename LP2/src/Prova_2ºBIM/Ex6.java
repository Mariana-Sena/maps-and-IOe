package Prova_2ºBIM;

import java.util.TreeMap;

public class Ex6 {

	public static void main(String[] args) {
		
		TreeMap<Integer,Integer> mapa;
		mapa = new TreeMap<Integer,Integer>();
		
		for(int a = 1; a < 5; a++)
			mapa.put(a,  a*a);
		
		for(Integer x: mapa.keySet())
			System.out.print(x * x);
		}

}
