package fr.cnam.main.entities;

public enum EventType {
	
	RE("Re"),
	FE("Fe"),
	IN("In");

	private String type;
	
	EventType(String type) {
		this.type = type;
	}

}
