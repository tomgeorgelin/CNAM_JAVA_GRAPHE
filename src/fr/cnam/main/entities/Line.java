package fr.cnam.main.entities;

import java.util.ArrayList;

public class Line {
	
	private int deltaT;
	private ArrayList<Event> events;
	
	
	public Line(int deltaT) {
		this.deltaT = deltaT;
		this.events = new ArrayList<>();
	}

	public int getDeltaT() {
		return deltaT;
	}
	
	public void setDeltaT(int deltaT) {
		this.deltaT = deltaT;
	}
	
	public ArrayList<Event> getEvents() {
		return events;
	}
	
	public void addEvent(Event event) {
		this.events.add(event);
	}
	
	
}
