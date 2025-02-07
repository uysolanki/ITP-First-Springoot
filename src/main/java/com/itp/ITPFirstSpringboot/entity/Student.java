package com.itp.ITPFirstSpringboot.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rno;
	
	@Size(min = 6, max = 20, message = "Firstname must be between 6 and 20 characters") 
	@Column(name="firstname")   //firstname
	@NotNull(message = "First name cannot be null") 
	private String firstName;   //first_name
	
	@Size(min = 6, max = 20, message = "Lastname must be between 6 and 20 characters") 
	@NotNull(message = "Last name cannot be null") 
	private String lastName;    //last_name
	
	@Min(value = 18, message = "Age must be at least 18 years") 
	private int age;
	
	@Positive
	@Digits(integer = 2, fraction = 2, message = "Percentage must be a valid number with up to 2 integer digits and 2 decimal places")
	private double percentage;
	
	@Pattern(regexp = "^(male|female)$", message = "Gender must be either 'male' or 'female'")
	private String gender;
	
	@Past
	@JsonFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Date Of Birth cannot be null") 
	LocalDate dob;
	
	
	@NotNull(message = "Email cannot be null") 
	@Email(message = "Email should be valid")
	@Column(unique = true)
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
				+ ", percentage=" + percentage + ", gender=" + gender + ", dob=" + dob + ", email=" + email + "]";
	}
	
	

}
