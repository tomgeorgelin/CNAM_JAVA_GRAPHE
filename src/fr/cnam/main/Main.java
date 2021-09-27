package fr.cnam.main;

import java.io.File;
import java.io.IOException;

import fr.cnam.main.read.FileManager;

public class Main {

	public static void main(String[] args) {

		File file = new File("new_input.csv");
		FileManager ri = new FileManager(file);
				
		try {
			ri.removeDuplicates();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
