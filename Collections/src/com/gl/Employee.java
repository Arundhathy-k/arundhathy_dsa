package com.gl;

import java.util.Objects;

public class Employee {
	private int eid;
	private String ename;
	private String city;
	private String country;

	// e1, e2, e3, e4, e5
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		
//		return this.getEid() > o.getEid() ? 1 : -1; // asc order of id
//		//return this.getEid() < o.getEid() ? 1 : -1; // desc order of id
//	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String city, String country) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.city = city;
		this.country = country;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

	@Override
	public int hashCode() {
		int hash = Objects.hash(city, country, eid, ename);
		System.out.println(eid);
		System.out.println("hashcode called "+hash);
		return hash;
	}

	// e1.equals(e2)
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals called ");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		System.out.println(other.getEid());
		return Objects.equals(city, other.city) && Objects.equals(country, other.country) 
				&& eid == other.eid
				&& Objects.equals(ename, other.ename);
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", city=" + city + ", country=" + country + "]";
	}
}
