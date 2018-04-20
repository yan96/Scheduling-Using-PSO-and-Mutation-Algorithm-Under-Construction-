package com.pso.sc.domain;

import java.util.ArrayList;

public class Fakultas {
	private String name;
	private ArrayList<MataKuliah> mataKuliahs;
	
	public Fakultas(String name, ArrayList<MataKuliah> mataKuliahs) {
		this.name = name;
		this.mataKuliahs = mataKuliahs;
	}

	public String getName() {
		return name;
	}

	public ArrayList<MataKuliah> getMataKuliahs() {
		return mataKuliahs;
	}
	
	

}
