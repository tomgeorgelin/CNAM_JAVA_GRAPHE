package fr.cnam.main;

import java.io.File;
import java.io.IOException;

import fr.cnam.main.read.FileManager;

public class Main {

	public static void main(String[] args) {

		File file = new File("input.csv");
		FileManager ri = new FileManager(file);
				
		try {
			ri.readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
