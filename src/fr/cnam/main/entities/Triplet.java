package fr.cnam.main.entities;

public class Triplet {

	private Event ev1;
	private Event ev2;
	private TemporalConstraint tc;
	
	public Triplet(Event ev1, Event ev2, TemporalConstraint tc) {
		this.ev1 = ev1;
		this.ev2 = ev2;
		this.tc = tc;
	}
}
