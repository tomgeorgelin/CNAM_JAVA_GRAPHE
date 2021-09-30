package fr.cnam.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import fr.cnam.main.entities.Event;
import fr.cnam.main.entities.EventType;
import fr.cnam.main.entities.Line;
import fr.cnam.main.read.FileManager;

public class Main {

	public static void main(String[] args) {

		File file = new File("new_input.csv");
		FileManager ri = new FileManager(file);
		
		try {
			TreeMap<Long, String> tm = ri.removeDuplicates();
					
			String[] lastStr = null;
			Long lastTime = null;
			List<Line> lines = new ArrayList<Line>();
			for (Entry<Long, String> entry : tm.entrySet()) {
				if (lastStr != null) {
					Line line = new Line((int) (entry.getKey() - lastTime));
					String[] str = entry.getValue().split(",");
					for (int i = 0; i < lastStr.length; i++) {
						if (!lastStr[i].equals(str[i])) {
							if (lastStr[i].equals("1")) {
								line.addEvent(new Event(EventType.FE, i + 1));
							} else {
								line.addEvent(new Event(EventType.RE, i + 1));
							}
						}
					}
					lines.add(line);
					lastStr = str;
					lastTime = entry.getKey();
					
				} else {
					lastStr = entry.getValue().split(",");
					lastTime = entry.getKey();
				}
				
//				System.out.println(entry.getKey() + " " + entry.getValue());
			}
			
			for (Line line : lines) {
				System.out.println(line.getEvents());
			}			
			
			System.out.println(tm.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
