package Prova_2ºBIM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOex1 {

	public static void main(String[] args) {
		
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("leitura.txt");
			int c = 0;
			
			while ( (c = in.read() ) != -1) {
				System.out.println(c);
			}
		}
		catch(FileNotFoundException e){
			System.out.print("Arquivo não encontrado");
		}
		catch(IOException e) {
			System.out.println("Falha na leitua do arquivo");
		}
	}

}
