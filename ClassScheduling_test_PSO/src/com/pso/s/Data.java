package com.pso.s;

import java.util.ArrayList;
import java.util.Arrays;

import com.pso.sc.domain.AssistenDosen;
import com.pso.sc.domain.Dosen;
import com.pso.sc.domain.Kelas;
import com.pso.sc.domain.MataKuliah;
import com.pso.sc.domain.Partikel;
import com.pso.sc.domain.Ruangan;

public class Data {
	private ArrayList<Dosen> dosens;
	private ArrayList<AssistenDosen> assistenDosens;
	private ArrayList<Kelas> kelass;
	private ArrayList<MataKuliah> mataKuliahs;
	private ArrayList<Partikel> partikels;
	private ArrayList<Ruangan> ruangans;
	private int numberOfClasses = 0;
	
	public Data(){ initializeData();}
	public Data initializeData(){
		//11SI
		Dosen dosen1 = new Dosen(1, "MSL", "A");
		Dosen dosen2 = new Dosen(2, "YBN", "B");
		Dosen dosen3 = new Dosen(3, "IFY", "C");
		Dosen dosen4 = new Dosen(4, "RML", "D");
		Dosen dosen5 = new Dosen(5, "NMA", "E");
		Dosen dosen6 = new Dosen(6, "GDE", "E");
		Dosen dosen7 = new Dosen(7, "RZS", "E");
		Dosen dosen8 = new Dosen(8, "MMM", "E");
		Dosen dosen9 = new Dosen(9, "ANM", "E");
		Dosen dosen10 = new Dosen(10, "RMS", "E");
		Dosen dosen11 = new Dosen(11, "ASD", "E");
		Dosen dosen12 = new Dosen(12, "LMG", "E");
		Dosen dosen13 = new Dosen(13, "ANA", "E");
		Dosen dosen14 = new Dosen(14, "YYS", "E");
		dosens = new ArrayList<Dosen>(Arrays.asList(dosen1, dosen2, dosen3, dosen4, dosen5, dosen6, dosen7, dosen8, dosen9, dosen10, dosen11, dosen12, dosen13, dosen14));
		
		AssistenDosen asdos1 = new AssistenDosen(1, "JNM", "A");
		
		assistenDosens = new ArrayList<AssistenDosen>(Arrays.asList(asdos1));
		
		//11SI
		Kelas kelas1 = new Kelas(1, "11SI1", "S1 Sistem Informasi 01 Angkatan 2017", 30);
		Kelas kelas2 = new Kelas(2, "11SI2", "S1 Sistem Informasi 02 Angkatan 2017", 30);
		kelass = new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2));
		
		//11SI		
		MataKuliah matkul1 = new MataKuliah(1, "Matematika Dasar I", "MADAS I", "Sarjana", 4, "T-1", new ArrayList<Dosen>(Arrays.asList(dosen1, dosen2, dosen3, dosen4)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul2 = new MataKuliah(2, "Matematika Dasar I", "MADAS I", "Sarjana", 4, "T-2", new ArrayList<Dosen>(Arrays.asList(dosen1, dosen2, dosen3, dosen4)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul3 = new MataKuliah(3, "Matematika Dasar I", "MADAS I", "Sarjana", 4, "T-3", new ArrayList<Dosen>(Arrays.asList(dosen1, dosen2, dosen3, dosen4)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul4 = new MataKuliah(4, "Matematika Dasar I", "MADAS I", "Sarjana", 4, "T-4", new ArrayList<Dosen>(Arrays.asList(dosen1, dosen2, dosen3, dosen4)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul5 = new MataKuliah(5, "Fisika Dasar I", "FISDAS I", "Sarjana", 4, "T-1", new ArrayList<Dosen>(Arrays.asList(dosen5, dosen6, dosen7)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul6 = new MataKuliah(6, "Fisika Dasar I", "FISDAS I", "Sarjana", 4, "T-2", new ArrayList<Dosen>(Arrays.asList(dosen5, dosen6, dosen7)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul7 = new MataKuliah(7, "Fisika Dasar I", "FISDAS I", "Sarjana", 4, "T-3", new ArrayList<Dosen>(Arrays.asList(dosen5, dosen6, dosen7)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul8 = new MataKuliah(8, "Fisika Dasar I", "FISDAS I", "Sarjana", 4, "T-4", new ArrayList<Dosen>(Arrays.asList(dosen5, dosen6, dosen7)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul9 = new MataKuliah(9, "Sains Teknologi dan Seni di Masyarakat", "STA", "Sarjana", 2, "T-1", new ArrayList<Dosen>(Arrays.asList(dosen8, dosen9)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul10 = new MataKuliah(10, "Sains Teknologi dan Seni di Masyarakat", "STA", "Sarjana", 2, "T-2", new ArrayList<Dosen>(Arrays.asList(dosen8, dosen9)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul11 = new MataKuliah(11, "Bahasa Inggris I", "ENG I", "Sarjana", 2, "T-1", new ArrayList<Dosen>(Arrays.asList(dosen10)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul12 = new MataKuliah(12, "Bahasa Inggris I", "ENG I", "Sarjana", 2, "T-2", new ArrayList<Dosen>(Arrays.asList(dosen10)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul13 = new MataKuliah(13, "Pengantar Teknologi Informasi", "PTI", "Sarjana", 2, "T-1", new ArrayList<Dosen>(Arrays.asList(dosen11, dosen12)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul14 = new MataKuliah(14, "Pengantar Teknologi Informasi", "PTI", "Sarjana", 2, "T-2", new ArrayList<Dosen>(Arrays.asList(dosen11, dosen12)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul15 = new MataKuliah(15, "Pengantar Teknologi Informasi", "PTI", "Sarjana", 2, "P-1", new ArrayList<Dosen>(Arrays.asList(dosen11, dosen12)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul16 = new MataKuliah(16, "Pengantar Teknologi Informasi", "PTI", "Sarjana", 2, "P-2", new ArrayList<Dosen>(Arrays.asList(dosen11, dosen12)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul17 = new MataKuliah(17, "Pembentukan Karakter Del", "DEL CHA", "Sarjana", 2, "T-1", new ArrayList<Dosen>(Arrays.asList(dosen13)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul18 = new MataKuliah(18, "Pembentukan Karakter Del", "DEL CHA", "Sarjana", 2, "T-2", new ArrayList<Dosen>(Arrays.asList(dosen13)), new ArrayList<AssistenDosen>(Arrays.asList()), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul19 = new MataKuliah(19, "Programming I", "PROG I", "Sarjana", 2, "T-1", new ArrayList<Dosen>(Arrays.asList(dosen14)), new ArrayList<AssistenDosen>(Arrays.asList(asdos1)), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul20 = new MataKuliah(20, "Programming I", "PROG I", "Sarjana", 2, "T-2", new ArrayList<Dosen>(Arrays.asList(dosen14)), new ArrayList<AssistenDosen>(Arrays.asList(asdos1)), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul21 = new MataKuliah(21, "Programming I", "PROG I", "Sarjana", 2, "P-1", new ArrayList<Dosen>(Arrays.asList(dosen14)), new ArrayList<AssistenDosen>(Arrays.asList(asdos1)), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		MataKuliah matkul22 = new MataKuliah(22, "Programming I", "PROG I", "Sarjana", 2, "P-2", new ArrayList<Dosen>(Arrays.asList(dosen14)), new ArrayList<AssistenDosen>(Arrays.asList(asdos1)), new ArrayList<Kelas>(Arrays.asList(kelas1, kelas2)));
		mataKuliahs = new ArrayList<MataKuliah>(Arrays.asList(matkul1, matkul2, matkul3, matkul4, matkul5, matkul6, matkul7, matkul8, matkul9, matkul10, matkul11, matkul12, matkul13, matkul14, matkul15, matkul16, matkul17, matkul18, matkul19, matkul20, matkul21, matkul22));
		
		
		/*
		Partikel partikel1 = new Partikel(1, matkul1, "p1");
		partikel1.setPosisiHari();
		partikel1.setPosisiSesi();
		partikel1.setPosisiRuangan();
		
		Partikel partikel2 = new Partikel(2, matkul2, "p2");
		partikel2.setPosisiHari();
		partikel2.setPosisiSesi();
		partikel2.setPosisiRuangan();
		
		partikels = new ArrayList<Partikel>(Arrays.asList(partikel1, partikel2));
		*/
		return this;
	}
	
	public ArrayList<MataKuliah> getDataMataKuliahs(){
		return mataKuliahs;
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
	public ArrayList<MataKuliah> getMataKuliahs() {
		return mataKuliahs;
	}
	public int getNumberOfClasses() {
		return numberOfClasses;
	}
	public ArrayList<Partikel> getPartikels() {
		return partikels;
	}
	
	public ArrayList<Ruangan> getRuangans() {
		return ruangans;
	}
	
	
	

}
