package com.itp.ITPFirstSpringboot.entity;


public class Student {
	
	private int rno;
	private String firstName;
	private String lastName;
	private int age;
	private double percentage;
	private String gender;
	private String email;
	
	public Student() {}
	public Student(int rno, String firstName, String lastName, int age, double percentage, String gender,
			String email) {
		this.rno = rno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.percentage = percentage;
		this.gender = gender;
		this.email = email;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", percentage=" + percentage + ", gender=" + gender + ", email=" + email + "]";
	}
	
	

}
