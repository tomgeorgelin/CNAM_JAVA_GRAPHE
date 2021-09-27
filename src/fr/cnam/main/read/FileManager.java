package fr.cnam.main.read;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;	

public class FileManager {

	private File file;
	
	public FileManager(File file) {
		this.file = file; 
	}
	
	public void writeNewFile() throws IOException {	
		String line;
		BufferedReader br = new BufferedReader(new FileReader(this.file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("new_" + this.file.getName())));
		
		String last = "", last2 = "";
		int count = 0;
		String newLine = "";
		while ((line = br.readLine()) != null) {
			
			if (last == "") {
				last = line.split(",", -3)[1];
			}
			
			last2 = line.split(",", -3)[1];
			
			if (last.equals(last2)) {
				count++;
			} else {
				count = 0;
			}
			
			last = last2;
			
			newLine = line.split(",")[0];
			newLine += "," + last2 + ":" + count + "000";
			newLine += line.substring(19);
			
			bw.append(newLine);
			bw.newLine();
				
		}
		
		bw.flush();
	}
	
	public TreeMap<String, String> removeDuplicates() throws IOException {
		String line;
		BufferedReader br = new BufferedReader(new FileReader(this.file));

		TreeMap<String, String> lines = new TreeMap<String, String>();
		br.readLine();
		String firstLine = br.readLine();
		lines.put(firstLine.split(",")[1], firstLine.substring(25, 84));
		String lastTime = firstLine.split(",")[1];
		while ((line = br.readLine()) != null) {
			
			String time = line.split(",")[1];
			String newLine = line.substring(25, 84);
			if (!lines.get(lastTime).equals(newLine)) {
				lines.put(time, newLine);
				lastTime = time;
			}
		}
		
		return lines;
	}
	
}
