package com.pso.s;

import java.util.ArrayList;
import java.util.Arrays;

import com.pso.sc.domain.MataKuliah;
import com.pso.sc.domain.Partikel;

public class Jadwal {
	private Data data = new Data();
	private ArrayList<MataKuliah> mataKuliahs;
	private ArrayList<Partikel> partikels;

	public Jadwal() {
		mataKuliahs= data.getDataMataKuliahs();
		partikels = new ArrayList<>();
		Integer iterator = 1;
		
//		Partikel partikel1 = new Partikel(1, mataKuliahs.get(0), "p1");
//		partikel1.setPosisiHari();
//		partikel1.setPosisiSesi();
//		partikel1.setPosisiRuangan();
//		
//		Partikel partikel2 = new Partikel(2, mataKuliahs.get(1), "p2");
//		partikel2.setPosisiHari();
//		partikel2.setPosisiSesi();
//		partikel2.setPosisiRuangan();
		
		for(MataKuliah mk : mataKuliahs){
			Partikel partikel = new Partikel(iterator, mk, "p"+iterator);
			partikel.setPosisiHari();
			partikel.setKecepatanHari(partikel.getPosisiHari());
			partikel.setPosisiSesi();
			partikel.setKecepatanSesi(partikel.getPosisiSesi());
			partikel.setPosisiRuangan();
			partikel.setKecepatanRuangan(partikel.getPosisiRuangan());
			partikel.setLocalBest(partikel.getPosisiHari());
			partikels.add(partikel);
			iterator++;
		}

	}

	public Data getData() {
		return data;
	}

	public ArrayList<MataKuliah> getMataKuliahs() {
		return mataKuliahs;
	}

	public ArrayList<Partikel> getPartikels() {
		return partikels;
	}
	

	
}
