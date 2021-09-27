package fr.cnam.main;

import java.io.File;
import java.io.IOException;

import fr.cnam.main.read.ReadInput;

public class Main {

	public static void main(String[] args) {

		File file = new File("input.csv");
		ReadInput ri = new ReadInput(file);
				
		try {
			ri.readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
