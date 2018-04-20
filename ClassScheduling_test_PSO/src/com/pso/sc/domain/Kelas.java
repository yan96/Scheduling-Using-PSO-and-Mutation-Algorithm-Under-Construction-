package com.pso.sc.domain;

public class Kelas {
	private int id;
	private String inisial;
	private String nama;
	private int jumlah;
	
	public Kelas(int id, String inisial, String nama, int jumlah) {
		this.id = id;
		this.inisial = inisial;
		this.nama = nama;
		this.jumlah = jumlah;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getJumlah() {
		return jumlah;
	}
	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}
	public String getInisial() {
		return inisial;
	}
	public void setInisial(String inisial) {
		this.inisial = inisial;
	}
	
	public String toString(){
		return inisial;
	}

}
