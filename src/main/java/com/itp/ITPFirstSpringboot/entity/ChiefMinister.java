package com.itp.ITPFirstSpringboot.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
