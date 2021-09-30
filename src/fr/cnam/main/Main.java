package fr.cnam.main;

import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

import fr.cnam.main.read.FileManager;

public class Main {

	public static void main(String[] args) {

		File file = new File("new_input.csv");
		FileManager ri = new FileManager(file);
				
		try {
			TreeMap<Long, String> tm = ri.removeDuplicates();
			
			for (Entry<Long, String> entry : tm.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
			
			System.out.println(tm.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
