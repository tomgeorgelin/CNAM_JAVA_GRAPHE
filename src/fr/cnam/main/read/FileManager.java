package fr.cnam.main.read;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;	

public class FileManager {

	private File file;
	
	public FileManager(File file) {
		this.file = file; 
	}
	
	public void writeNewFile() throws IOException {
		
		String ligne;
		BufferedReader br = new BufferedReader(new FileReader(this.file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("new_" + this.file.getName())));
		
		String last = "", last2 = "";
		int count = 0;
		String newLine = "";
		while ((ligne = br.readLine()) != null) {
			
			if (last == "") {
				last = ligne.split(",", -3)[1];
			}
			
			last2 = ligne.split(",", -3)[1];
			
			if (last.equals(last2)) {
				count++;
			} else {
				count = 0;
			}
			
			last = last2;
			
			newLine = ligne.split(",")[0];
			newLine += "," + last2 + ":" + count + "000";
			newLine += ligne.substring(19);
			
			bw.append(newLine);
			bw.newLine();
				
		}
		
		bw.flush();
			
	}
	
}
