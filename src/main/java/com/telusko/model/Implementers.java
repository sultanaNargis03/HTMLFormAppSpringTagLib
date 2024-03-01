package com.telusko.model;

public class Implementers
{
	private Integer id;
	private String iname;
	private String icity="Bengaluru";
	private Double isalary;
	
	public Implementers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Implementers(Integer id, String iname, String icity, Double isalary) {
		super();
		this.id = id;
		this.iname = iname;
		this.icity = icity;
		this.isalary = isalary;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getIname() {
		return iname;
	}



	public void setIname(String iname) {
		this.iname = iname;
	}



	public String getIcity() {
		return icity;
	}
	public void setIcity(String icity) {
		this.icity = icity;
	}
	public Double getIsalary() {
		return isalary;
	}
	public void setIsalary(Double isalary) {
		this.isalary = isalary;
	}
	@Override
	public String toString() {
		return "Implementers [id=" + id + ", iname=" + iname + ", icity=" + icity + ", isalary=" + isalary + "]";
	}
	
	
}
