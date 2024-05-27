package Prova_2ºBIM;

import java.io.FileOutputStream;
import java.util.TreeSet;
import java.io.IOException;

public class IOex3 {

	public static void main(String[] args) {
		
		TreeSet<Integer>lista = new TreeSet<Integer>();
		FileOutputStream arquivo = null;
		
		for(int a = 0; a < 5; a++)
			if(a % 2 == 0)
				lista.add((a * a));
			else
				lista.add(-a);
	
	try {
		arquivo = new FileOutputStream("arquivo.txt");
		
		for(Integer c: lista) {
			if(c % 2 == 0) {
				System.out.print(c);
				arquivo.write(c);
			}
		}
	}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}

