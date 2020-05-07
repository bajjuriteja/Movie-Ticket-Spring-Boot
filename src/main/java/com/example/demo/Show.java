package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Show {

	@Id
	private int shid;
	
	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	@Override
	public String toString() {
		return "Show [shid=" + shid + ", stime=" + stime + ", etime=" + etime + ", shoname=" + shoname + ", screen="
				+ screen + "]";
	}

	private int stime;
	
	private int etime;
	
	private String shoname;
	
	@ManyToOne
	@JsonBackReference
	private Screen screen;

	public int getShid() {
		return shid;
	}

	public void setShid(int shid) {
		this.shid = shid;
	}

	public int getStime() {
		return stime;
	}

	public void setStime(int stime) {
		this.stime = stime;
	}

	public int getEtime() {
		return etime;
	}

	public void setEtime(int etime) {
		this.etime = etime;
	}

	public String getShoname() {
		return shoname;
	}

	public void setShoname(String shoname) {
		this.shoname = shoname;
	}
	
	
	
	
	
	
}
