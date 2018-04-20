package com.pso.s;

import com.pso.s.Data;
import com.pso.sc.domain.Helper;

public class Driver {
	private Data data;
	private Jadwal jadwal = new Jadwal();
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.data = new Data();
		driver.printDataKeseluruhan();
		
	}
	
	private void printDataKeseluruhan(){
		System.out.println("Data Kelas yang tersedia");
		data.getKelass().forEach(x -> System.out.println("inisial: "+ x.getInisial()+ ", nama: "+ x.getNama()+", jumlah mahasiswa: "+ x.getJumlah()));
		System.out.println("Data Dosen yang tersedia");
		data.getDosens().forEach(x -> System.out.println("inisial: "+ x.getInisial()+ ", nama: "+ x.getNama()));
		System.out.println("Data Asissten Dosen yang tersedia");
		data.getAssistenDosens().forEach(x -> System.out.println("inisial: "+ x.getInisial()+ ", nama: "+ x.getNama()));
		System.out.println("Data Mata Kuliah yang tersedia");
		data.getMataKuliahs().forEach(x -> System.out.println("inisial: "+ x.getInisial()+ ", nama: "+ x.getNama()+ ", dosen: "+ x.getDosens() + ", assisten dosen"+ x.getAssistenDosens() + ", komposisi: "+ x.getKomposisi() + ", kelas: "+ x.getKelass() + ", jumlah rombongan kelas: "+ x.getJumlahRombKelas()));
		
		System.out.println("Data Partikel yang tersedia");
//		data.getPartikels().forEach(x -> System.out.println("Nama matkul" +x.getMataKuliah().getNama() +"Nama: " + x.getNama() + " hari: " + x.getPosisiHari()+ " sesi: " + x.getPosisiSesi() + " ruangan: " + x.getPosisiRuangan()));
		
		jadwal.getPartikels().forEach(x -> System.out.println("Nama matkul" +x.getMataKuliah().getNama() +"Nama: " + x.getNama() + " hari: " + x.getPosisiHari()+ " sesi: " + x.getPosisiSesi() + " ruangan: " + x.getPosisiRuangan()));
		
		
//		jadwal.getPartikels().forEach(x -> System.out.println(""+ x.getMataKuliah().getNama()));
//		data.getRuangans().get(24).getNama();
		System.out.println("Data Partikel yang tersedia convert");
		jadwal.getPartikels().forEach(x -> System.out.println("Nama matkul: " +x.getMataKuliah().getNama() +" Nama: " + x.getNama() + " hari: " + x.getPosisiHari()+ "Kecepatan Hari: "+ x.getKecepatanHari() +" hasil hari: " + Helper.getHari((int)x.getPosisiHari()) +" sesi: " + x.getPosisiSesi() + " ruangan: " + x.getPosisiRuangan()+ " local best:"+ x.getLocalBest()));
	}

}
