package Prova_2ºBIM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOe2 {

	public static void main(String[] args) {
		
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("arquivo.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		}
		finally {
			try {
				in.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			/*finally {
				try {
					in.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}*/
		}
	}

}
