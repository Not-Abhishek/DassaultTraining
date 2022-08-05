package com.art.main;

public class EmployeeDTO {
	private String name;
	private String city;
	private int idNumber;

	public EmployeeDTO() {

	}

	public EmployeeDTO(int idNumber, String name, String city) {
		this.name = name;
		this.city = city;
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [IdNumber=" + idNumber + ", name=" + name + ", city=" + city + "]";
	}

}
