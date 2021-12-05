package sinhvien;

import java.io.Serializable;

public class Sinhvien implements Serializable {
    
	private int Maso;
	private String Hovaten;
	private byte tuoi;
	private String diachi;
	private float diemtrungbinh;
	
	public Sinhvien() {
		super();
	}

	public Sinhvien(int maso, String hovaten, byte tuoi, String diachi, float diemtrungbinh) {
		super();
		Maso = maso;
		Hovaten = hovaten;
		this.tuoi = tuoi;
		this.diachi = diachi;
		this.diemtrungbinh = diemtrungbinh;
	}
	
	public int getMaso() {
		return Maso;
	}
	public void setMaso(int maso) {
		Maso = maso;
	}
	public String getHovaten() {
		return Hovaten;
	}
	public void setHovaten(String hovaten) {
		Hovaten = hovaten;
	}
	public byte getTuoi() {
		return tuoi;
	}
	public void setTuoi(byte tuoi) {
		this.tuoi = tuoi;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public float getDiemtrungbinh() {
		return diemtrungbinh;
	}
	public void setDiemtrungbinh(float diemtrungbinh) {
		this.diemtrungbinh = diemtrungbinh;
	}
	
	
	
}
