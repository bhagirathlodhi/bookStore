package com.springcore;

public class Student {
	private int studentIt;
	
	private String studentName;
	private String studentAddress;
	public int getstudentIt() {
		return studentIt;
	}
	public void setStudentIt(int studentIt) {
		this.studentIt = studentIt;
	}
	public String getStudentName() {
		return studentName;
	}
	@Override
	public String toString() {
		return "Student [studentIt=" + studentIt + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public Student(int studentIt, String studentName, String studentAddress) {
		super();
		this.studentIt = studentIt;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
