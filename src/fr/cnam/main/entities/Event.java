package fr.cnam.main.entities;

public class Event {

	private EventType type;
	private int column;
	
	public Event(EventType type, int column) {
		this.type = type;
		this.column = column;	
	}
	
	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public String toString() {
		return this.type + "_" + this.column;
	}
	
}
