package com.itp.ITPFirstSpringboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rno;
	
	@Column(name="firstname")   //firstname
	private String firstName;   //first_name
	
	private String lastName;    //last_name
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
