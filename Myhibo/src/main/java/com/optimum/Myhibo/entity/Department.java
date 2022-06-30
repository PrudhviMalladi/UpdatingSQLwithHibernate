package com.optimum.Myhibo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String dptcode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDptcode() {
		return dptcode;
	}
	public void setDptcode(String dptcode) {
		this.dptcode = dptcode;
	}
	
	
	public Department( String name, String dptcode) {
		super();
		
		this.name = name;
		this.dptcode = dptcode;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", dptcode=" + dptcode + "]";
	}
}
