package dev.archety.shool.models;

import java.sql.Date;

public class Student extends Person{

	private String stuNum;
	private Date dateBr;
	
	public Student() {
		super();
	}
	public Student(String firNam, String lasNam, String stuNum, Date dateBr) {
		super(firNam, lasNam);
		this.stuNum = stuNum;
		this.dateBr = dateBr;
	}
	
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public Date getDateBr() {
		return dateBr;
	}
	public void setDateBr(Date dateBr) {
		this.dateBr = dateBr;
	}
	@Override
	public String toString() {
		return "Student [stuNum=" + stuNum + ", dateBr=" + dateBr + ", firNam=" + firNam + ", lasNam=" + lasNam + "]";
	}
	
	
}
