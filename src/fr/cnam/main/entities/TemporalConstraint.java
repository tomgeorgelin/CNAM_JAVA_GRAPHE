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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	public String toString() {
		return Integer.toString(this.max - this.min);
	}
}
