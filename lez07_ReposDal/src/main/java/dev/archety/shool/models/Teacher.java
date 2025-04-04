package dev.archety.shool.models;

public class Teacher extends Person{
	
	private String teaSub;

	public Teacher() {
		super();
	}

	public Teacher(String firNam, String lasNam, String teaSub) {
		super(firNam, lasNam);
		this.teaSub = teaSub;
	}

	public String getTeaSub() {
		return teaSub;
	}

	public void setTeaSub(String teaSub) {
		this.teaSub = teaSub;
	}

	@Override
	public String toString() {
		return "Teacher [teaSub=" + teaSub + ", firNam=" + firNam + ", lasNam=" + lasNam + "]";
	}
	
	
}
