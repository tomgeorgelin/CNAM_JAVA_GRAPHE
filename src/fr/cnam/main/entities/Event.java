package fr.cnam.main.entities;

public class Event {

	private EventType type;
	private int column;
	private int time;
	
	public Event(EventType type, int column, int time) {
		this.type = type;
		this.column = column;	
		this.time = time;
	}

	public EventType getType() {
		return type;
	}

	public int getColumn() {
		return column;
	}
	
	public int getTime() {
		return time;
	}
	
}
