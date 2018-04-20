package com.pso.sc.domain;

import java.util.ArrayList;

public class MataKuliah {
	private int id;
	private String nama;
	private String inisial;
	private String program;
	private int jumlahSks;
	private String komposisi;
	private ArrayList<Dosen> dosens;
	private ArrayList<AssistenDosen> assistenDosens;
	private ArrayList<Kelas> kelass;
	private int jumlahRombKelas = 0;
	
	
	
	public MataKuliah() {
	}
	
	
	public MataKuliah(int id, String nama, String inisial, String program, int jumlahSks, String komposisi,
			ArrayList<Dosen> dosens, ArrayList<AssistenDosen> assistenDosens, ArrayList<Kelas> kelass) {
		int i;
		this.id = id;
		this.nama = nama;
		this.inisial = inisial;
		this.program = program;
		this.jumlahSks = jumlahSks;
		this.komposisi = komposisi;
		this.dosens = dosens;
		this.assistenDosens = assistenDosens;
		this.kelass = kelass;
		for(i=0;i<kelass.size();i++){
			this.jumlahRombKelas = jumlahRombKelas + kelass.get(i).getJumlah();
		}
	}


//	public MataKuliah(int id, String nama, String inisial, String program, int jumlahSks, String komposisi,
//			ArrayList<Dosen> dosens, ArrayList<AssistenDosen> assistenDosens, ArrayList<Kelas> kelass, int jumlahRombKelas) {
//		this.id = id;
//		this.nama = nama;
//		this.inisial = inisial;
//		this.program = program;
//		this.jumlahSks = jumlahSks;
//		this.komposisi = komposisi;
//		this.dosens = dosens;
//		this.assistenDosens = assistenDosens;
//		this.kelass = kelass;
//		this.jumlahRombKelas = jumlahRombKelas ;
//	}
	
	public int getId() {
		return id;
	}
	public String getNama() {
		return nama;
	}
	public String getInisial() {
		return inisial;
	}
	public String getProgram() {
		return program;
	}
	public int getJumlahSks() {
		return jumlahSks;
	}
	public String getKomposisi() {
		return komposisi;
	}
	public ArrayList<Dosen> getDosens() {
		return dosens;
	}
	public ArrayList<AssistenDosen> getAssistenDosens() {
		return assistenDosens;
	}
	public ArrayList<Kelas> getKelass() {
		return kelass;
	}
	public int getJumlahRombKelas() {
		return jumlahRombKelas;
	}

}
