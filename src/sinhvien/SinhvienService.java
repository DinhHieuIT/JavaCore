package sinhvien;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SinhvienService {

	public static Scanner scanner = new Scanner(System.in);
	private List<Sinhvien> danhsachsinhvien;
	private SinhvienDao sinhvienDao;
	
	public SinhvienService() {
		sinhvienDao = new SinhvienDao();
		danhsachsinhvien = sinhvienDao.doc();
	}
	
	public void themSinhvien() {
		
		int maso = (danhsachsinhvien.size() > 0) ? (danhsachsinhvien.size() + 1) : 1;
		System.out.println("Ma so cua sinh vien la : " + maso);
		String hovaten = nhapHovaten();
		byte tuoi = nhapTuoi();
		String diachi= nhapDiachi();
		float diemtrungbinh = nhapDiemtrungbinh();
		Sinhvien sinhvien = new Sinhvien(maso, hovaten, tuoi, diachi, diemtrungbinh );
		danhsachsinhvien.add(sinhvien);
		sinhvienDao.viet(danhsachsinhvien);
		
	}
	
	public void suaSinhvien(int maso) {
		System.out.println("Nhập mã số sinh viên cần sửa : ");
		boolean tontaiSinhvien = false;
		int tongsosinhvien = danhsachsinhvien.size();
		for (int i=0;i<tongsosinhvien;i++) {
			if(danhsachsinhvien.get(i).getMaso()==maso) {
				tontaiSinhvien = true;
				danhsachsinhvien.get(i).setHovaten(nhapHovaten());
				danhsachsinhvien.get(i).setTuoi(nhapTuoi());;
				danhsachsinhvien.get(i).setDiachi(nhapDiachi());;
				danhsachsinhvien.get(i).setDiemtrungbinh(nhapDiemtrungbinh());
				break;
			}
			
			if(!tontaiSinhvien) {
				System.out.println("Không tồn tại sinh viên mã số là " + maso);
			}else {
				sinhvienDao.viet(danhsachsinhvien);
			}
		}
		
	}
	
	public void xoaSinhvien (int maso) {
		int tongsosinhvien = danhsachsinhvien.size();
		Sinhvien sinhvien=null;
		for (int i=0;i<tongsosinhvien;i++) {
			if(danhsachsinhvien.get(i).getMaso()==maso) {
				sinhvien=danhsachsinhvien.get(i);
			}
		}
		if(sinhvien !=null) {
			danhsachsinhvien.remove(sinhvien);
			sinhvienDao.viet(danhsachsinhvien);
		}else {
			System.out.println("Không tồn tại sinh viên với mã số là " + maso);
		}
	}
 
	public void sapxepSinhvienTheoDiem() {
		Collections.sort(danhsachsinhvien, new SapxepSinhvienDuavaoDiem());
	}
	
	public void sapxepSinhvienTheoTen() {
		Collections.sort(danhsachsinhvien,new SapxepSinhvienDuavaoTen());
	}
	
	public void hienthiDanhsachSinhvien() {
		for (Sinhvien sinhvien : danhsachsinhvien) {
			 System.out.format("%5d | ", sinhvien.getMaso());
	            System.out.format("%20s | ", sinhvien.getHovaten());
	            System.out.format("%20s | ", sinhvien.getDiachi());
	            System.out.format("%5d | ", sinhvien.getTuoi());
	            System.out.format("%10.1f%n", sinhvien.getDiemtrungbinh());
		}
	}
	
	private String nhapHovaten() {
		System.out.println("Nhập họ và tên : ");
		return scanner.nextLine();
	}
	
	private byte nhapTuoi() {
		System.out.println("Nhập tuổi sinh viên : ");
		while(true) {
		try {
			byte tuoi = Byte.parseByte((scanner.nextLine()));
			if(tuoi<0 && tuoi >100) {
				throw new NumberFormatException();
			}
			return tuoi;
		} catch (NumberFormatException e) {
		System.out.println("Vui lòng nhập số nằm trong khoảng 0 đến 100");
		}
		}
	}
	
	private String nhapDiachi() {
		System.out.println("Nhập địa chỉ của sinh viên : ");
		String diachi = scanner.nextLine();
		return diachi;
	}
	
	private float nhapDiemtrungbinh() {
		System.out.println("Nhập điểm trung bình : ");
		float diemtrungbinh;
		while(true) {
		try {
			diemtrungbinh = Float.parseFloat(scanner.nextLine());
			if(diemtrungbinh<0.0 && diemtrungbinh >10.0) {
				throw new NumberFormatException();
			}
			return diemtrungbinh;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		}
	}
	
	public int nhapMaso() {
		System.out.println("Nhập mã số sinh viên : ");
		while(true) {
		try {
			int maso = Integer.parseInt(scanner.nextLine());
			return maso;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	}

	public List<Sinhvien> getDanhsachsinhvien() {
		return danhsachsinhvien;
	}

	public void setDanhsachsinhvien(List<Sinhvien> danhsachsinhvien) {
		this.danhsachsinhvien = danhsachsinhvien;
	}

}
