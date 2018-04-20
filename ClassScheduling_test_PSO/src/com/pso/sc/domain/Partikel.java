package com.pso.sc.domain;
import java.util.Random;

public class Partikel {
	private int id;
	private MataKuliah mataKuliah;
	private String nama;
	private double posisiHari;
	private double posisiSesi;
	private double posisiRuangan;
	private double kecepatanHari;
	private double kecepatanSesi;
	private double kecepatanRuangan;
	private double fitness;
	private double localBest;
	
	
	public Partikel(int id, MataKuliah mataKuliah, String nama) {
		super();
		this.id = id;
		this.mataKuliah = mataKuliah;
		this.nama = nama;
	}

	public Partikel(int id, MataKuliah mataKuliah) {
		this.id = id;
		this.mataKuliah = mataKuliah;
	}
	
	public Partikel(int id, MataKuliah mataKuliah, int posisiHari, int posisiSesi, int posisiRuangan) {
		this.id = id;
		this.mataKuliah = mataKuliah;
		this.posisiHari = posisiHari;
		this.posisiSesi = posisiSesi;
		this.posisiRuangan = posisiRuangan;
	}
	public int getId() {
		return id;
	}
	public MataKuliah getMataKuliah() {
		return mataKuliah;
	}
	public double getPosisiHari() {
		return posisiHari;
	}
	public double getPosisiSesi() {
		return posisiSesi;
	}
	public double getPosisiRuangan() {
		return posisiRuangan;
	}
	
	public void setPosisiHari() {
		Random rand = new Random();
//		rangeMin + (rangeMax - rangeMin) * r.nextDouble();
//		posisiHari = rand.nextInt(5)+1;
		posisiHari = 1 +(5-1)* rand.nextDouble();
	}
	
	public void setPosisiSesi() {
		Random rand = new Random();
		posisiSesi = 1 + (8 - 1) * rand.nextDouble();
//		posisiSesi = rand.nextInt(8)+1;
	}
	
	public void setPosisiRuangan() {
		Random rand = new Random();
		String[] keterangan = mataKuliah.getKomposisi().split("-");
		String keterangan_1 = keterangan[0];
//		String keterangan_2 = keterangan[1];
		if(keterangan_1.equals("T")){
//			posisiRuangan = rand.nextInt(24)+1;
			posisiRuangan = 1 + (24-1) * rand.nextDouble();
		}else
//			posisiRuangan = rand.nextInt((38-25))+25;
			posisiRuangan = 25 + (38-25) * rand.nextDouble();
	}
	
	

	public void setKecepatanHari(double kecepatanHari) {
		this.kecepatanHari = kecepatanHari;
	}

	public void setKecepatanSesi(double kecepatanSesi) {
		this.kecepatanSesi = kecepatanSesi;
	}

	public void setKecepatanRuangan(double kecepatanRuangan) {
		this.kecepatanRuangan = kecepatanRuangan;
	}

	public double getFitness() {
		return fitness;
	}

	public void setFitness(double fitness) {
		this.fitness = fitness;
	}
	

	public double getLocalBest() {
		return localBest;
	}

	public void setLocalBest(double localBest) {
		this.localBest = localBest;
	}

	public double getKecepatanHari() {
		return kecepatanHari;
	}

	public double getKecepatanSesi() {
		return kecepatanSesi;
	}

	public double getKecepatanRuangan() {
		return kecepatanRuangan;
	}

	public String getNama() {
		return nama;
	}
}
