package com.itp.ITPFirstSpringboot.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name="chiefminister")
public class ChiefMinister {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int cmno;
		
		@Column(name="cmname")
		private String cmName;
		
		@Column(name="cmage")
		private int cmAge;
		
		@Column(name="cmgender")
		private String cmGender;
}
