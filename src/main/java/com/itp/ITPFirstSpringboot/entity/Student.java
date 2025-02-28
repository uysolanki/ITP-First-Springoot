package com.itp.ITPFirstSpringboot.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
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

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@EntityListeners(AuditingEntityListener.class)
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
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate dob;
	
	
	@NotNull(message = "Email cannot be null") 
	@Email(message = "Email should be valid")
	@Column(unique = true)
	private String email;
	
//	@CreatedDate 
//	@Column(name = "created_at") 
//	private Timestamp createdAt; 
//
//	@LastModifiedDate 
//	@Column(name = "modified_at") 
//	private Timestamp modifiedAt;

}
