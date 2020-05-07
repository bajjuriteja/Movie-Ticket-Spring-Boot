package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	private int mid;
	
	private String mname;
	
	private String mgenre;
	
	private int mlen;
	
	private String mdirect;
	
	private int mrdat;
	
	

	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", mgenre=" + mgenre + ", mlen=" + mlen + ", mdirect="
				+ mdirect + ", mrdat=" + mrdat + "]";
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMgenre() {
		return mgenre;
	}

	public void setMgenre(String mgenre) {
		this.mgenre = mgenre;
	}

	public int getMlen() {
		return mlen;
	}

	public void setMlen(int mlen) {
		this.mlen = mlen;
	}

	public String getMdirect() {
		return mdirect;
	}

	public void setMdirect(String mdirect) {
		this.mdirect = mdirect;
	}

	public int getMrdat() {
		return mrdat;
	}

	public void setMrdat(int mrdat) {
		this.mrdat = mrdat;
	}
	
	
	
	
	
	
	
	
	
	
}
