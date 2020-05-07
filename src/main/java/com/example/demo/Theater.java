package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Theater {

	@Id
	private int theaterid;
	
	private String thname;
	
	private String city;
	
	private String manname;
	
	private String manContact;
	
	@OneToMany(mappedBy="theater")
	private List<Screen> lscreens = new ArrayList<>();
	
	@OneToMany
	private List<Movie> lmovies = new ArrayList<>();

	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Theater [theaterid=" + theaterid + ", thname=" + thname + ", city=" + city + ", manname=" + manname
				+ ", manContact=" + manContact +  "]";
	}

	public List<Screen> getLscreens() {
		return lscreens;
	}

	public void setLscreens(List<Screen> lscreens) {
		this.lscreens = lscreens;
	}

	public int getTheaterid() {
		return theaterid;
	}

	public void setTheaterid(int theaterid) {
		this.theaterid = theaterid;
	}

	public String getThname() {
		return thname;
	}

	public void setThname(String thname) {
		this.thname = thname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getManname() {
		return manname;
	}

	public void setManname(String manname) {
		this.manname = manname;
	}

	public String getManContact() {
		return manContact;
	}

	public void setManContact(String manContact) {
		this.manContact = manContact;
	}
	
	
	
	
	
	
	
}
