package com.itp.ITPFirstSpringboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jno;
	
	@NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 10, message = "Name should be between 2 and 10 characters")
	private String pname;
	
	@NotNull(message = "RunsScored cannot be null")
	@Positive
	private int rs;
	
	public Player() {}
	public Player(int jno, String pname, int rs) {
		this.jno = jno;
		this.pname = pname;
		this.rs = rs;
	}
	public int getJno() {
		return jno;
	}
	public void setJno(int jno) {
		this.jno = jno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getRs() {
		return rs;
	}
	public void setRs(int rs) {
		this.rs = rs;
	}
	@Override
	public String toString() {
		return "Player [jno=" + jno + ", pname=" + pname + ", rs=" + rs + "]";
	}
	
	
}
