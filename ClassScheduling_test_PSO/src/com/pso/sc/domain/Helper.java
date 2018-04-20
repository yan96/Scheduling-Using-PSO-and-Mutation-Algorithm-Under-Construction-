package com.pso.sc.domain;

public class Helper {
	static public String getHari(int hari){
		switch (hari) {
		case 1:
			return "Senin";
		case 2:
			return "Selasa";
		case 3:
			return "Rabu";
		case 4:
			return "Kamis";
		case 5:
			return "Jumat";
		default:
			return null;
		}
	}
}
