package com.pso.sc.domain;

public class Ruangan {
	private int id;
	private String nama;
	private String jenis;
	private int kapasitas;
	
	public Ruangan(int id, String nama, String jenis, int kapasitas) {
		this.id = id;
		this.nama = nama;
		this.jenis = jenis;
		this.kapasitas = kapasitas;
	}

	public int getId() {
		return id;
	}

	public String getNama() {
		return nama;
	}

	public String getJenis() {
		return jenis;
	}

	public int getKapasitas() {
		return kapasitas;
	}
	
	
	
	

}
