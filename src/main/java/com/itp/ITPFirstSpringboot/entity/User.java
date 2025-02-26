package com.itp.ITPFirstSpringboot.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class User {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int userid;
		private String username;
		private String password;
		
		private LocalDate accountExpiryDate;
		int accountLockedStatus;						//1-Non Locked 0-Locked
		private LocalDate credentialExpiryDate;
		int accountEnabledStatus;						//1-Enabled 0-Disabled

		
		@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
		@JoinTable(
		           name = "user_role",
		           joinColumns = @JoinColumn(name = "fuserid"),
		           inverseJoinColumns = @JoinColumn(name = "froleid")
		           )
		List<Role> roles;
}
