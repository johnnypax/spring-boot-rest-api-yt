package dev.archety.shool.models;

public abstract class Person {
	protected String firNam;
	protected String lasNam;
	
	public Person() { }
	
	public Person(String firNam, String lasNam) {
		super();
		this.firNam = firNam;
		this.lasNam = lasNam;
	}

	public String getFirNam() {
		return firNam;
	}

	public void setFirNam(String firNam) {
		this.firNam = firNam;
	}

	public String getLasNam() {
		return lasNam;
	}

	public void setLasNam(String lasNam) {
		this.lasNam = lasNam;
	}
	
	
	
	
}
