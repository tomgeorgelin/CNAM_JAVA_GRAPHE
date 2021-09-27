package fr.cnam.main.entities;

public class TemporalConstraint {
	
	private int id;
	private int min;
	private int max;
	
	public TemporalConstraint(int id, int min, int max) {
		this.id = id;
		this.min = min;
		this.max = max;
	}
}
