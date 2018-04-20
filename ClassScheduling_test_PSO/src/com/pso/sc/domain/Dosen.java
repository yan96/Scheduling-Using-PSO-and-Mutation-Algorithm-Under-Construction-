package com.pso.sc.domain;

public class Dosen {
	private int id;
	private String inisial;
	private String nama;
	
	public Dosen(int id, String inisial, String nama) {
		this.id = id;
		this.inisial = inisial;
		this.nama = nama;
	}
	
	public int getId() {
		return id;
	}

	public String getInisial() {
		return inisial;
	}
	public String getNama() {
		return nama;
	}
	
	public String toString(){
		return inisial;
	}
	

}
