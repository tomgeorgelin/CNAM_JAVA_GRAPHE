package fr.cnam.main.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;	

public class ReadInput {

	private File file;
	
	public ReadInput(File file) {
		this.file = file; 
	}
	
	public void readFile() throws IOException {
		
		String ligne;
		BufferedReader br = new BufferedReader(new FileReader(this.file));
		
		String last = "";
		int count = 0000;
		while ((ligne = br.readLine()) != null) {
			String last2;
			if(last == last2)  {
				last = ligne.split(",", -3)[1];
			}
				
//			System.out.println(ligne.split(",", -3)[1]);
//			System.out.println(ligne);
		}
		
		//System.out.println("1,0,0,1,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0".split(",").length);
		
	}
	
}
