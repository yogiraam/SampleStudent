package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
    private	int stid;
	private String stname;
    private	String rollno;
	private int marks;
    private String branchname;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public Student(int stid, String stname, String rollno, int marks, String branchname) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.rollno = rollno;
		this.marks = marks;
		this.branchname = branchname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + ", rollno=" + rollno + ", marks=" + marks
				+ ", branchname=" + branchname + "]";
	}
    
	
	
	
	
	
	
	
	
	

}
