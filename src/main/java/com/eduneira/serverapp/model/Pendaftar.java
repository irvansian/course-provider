package com.eduneira.serverapp.model;

public class Pendaftar {
	private String nama;
	private String kota;
	private MataPelajaran mapel;
	private PilihanKelas pilihanKelas;
	private String email;
	private String nomorTelefon;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getKota() {
		return kota;
	}
	public void setKota(String kota) {
		this.kota = kota;
	}
	public MataPelajaran getMapel() {
		return mapel;
	}
	public void setMapel(MataPelajaran mapel) {
		this.mapel = mapel;
	}
	public PilihanKelas getPilihanKelas() {
		return pilihanKelas;
	}
	public void setPilihanKelas(PilihanKelas pilihanKelas) {
		this.pilihanKelas = pilihanKelas;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomorTelefon() {
		return nomorTelefon;
	}
	public void setNomorTelefon(String nomorTelefon) {
		this.nomorTelefon = nomorTelefon;
	}
	
	
	
}
