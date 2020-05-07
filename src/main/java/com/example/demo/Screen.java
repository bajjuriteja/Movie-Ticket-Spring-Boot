package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity

public class Screen {

	
	@Id
	private int screenid;
	
	private String sname;
	
	private int r;
	
	private int c;
	
	@ManyToOne
	@JsonBackReference
	private Theater theater;
	
	
	
	@Override
	public String toString() {
		return "Screen [screenid=" + screenid + ", sname=" + sname + ", r=" + r + ", c=" + c + ", theater=" + theater
				+ "]";
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	public List<Show> getLshows() {
		return lshows;
	}

	public void setLshows(List<Show> lshows) {
		this.lshows = lshows;
	}

	@OneToMany(mappedBy="screen")
	private List<Show> lshows = new ArrayList<>();
	

	public int getScreenid() {
		return screenid;
	}

	public void setScreenid(int screenid) {
		this.screenid = screenid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	
	
	
	
	
}
