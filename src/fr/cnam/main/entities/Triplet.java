package fr.cnam.main.entities;

public class Triplet {

	private Event evtRef;
	private Event evtCont;
	private TemporalConstraint tc;
	
	public Triplet(Event evtRef, Event evtCont, TemporalConstraint tc) {
		this.evtRef = evtRef;
		this.evtCont = evtCont;
		this.tc = tc;
	}
	
	public Event getEvtRef() {
		return evtRef;
	}

	public void setEvtRef(Event evtRef) {
		this.evtRef = evtRef;
	}

	public Event getEvtCont() {
		return evtCont;
	}

	public void setEvtCont(Event evtCont) {
		this.evtCont = evtCont;
	}

	public TemporalConstraint getTc() {
		return tc;
	}

	public void setTc(TemporalConstraint tc) {
		this.tc = tc;
	}

	public String toString() {
		return "(" + this.evtRef + ", " + this.evtCont + ", " + this.tc + ")";
	}
}
