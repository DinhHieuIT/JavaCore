package sinhvien;

import java.util.Scanner;
//Danh sách thông tin sinh viên và điểm trung bình
public class Main {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Giaodien();
		String nhapso = null;
		Boolean exit=false;
		SinhvienService sinhvienService = new SinhvienService();
		while(true) {
		nhapso = scanner.nextLine();
		switch(nhapso) {
		case "1":
			sinhvienService.themSinhvien();
			break;
		case "2":
			int masoSua = sinhvienService.nhapMaso();
			sinhvienService.suaSinhvien(masoSua);
			break;
		case "3":
			int masoXoa = sinhvienService.nhapMaso();
			sinhvienService.xoaSinhvien(masoXoa);
			break;
		case "4":
			sinhvienService.sapxepSinhvienTheoDiem();
			break;
		case "5":
			sinhvienService.sapxepSinhvienTheoTen();
			break;
		case "6":
			sinhvienService.hienthiDanhsachSinhvien();
			break;
		case "0":
			System.out.println("Thoát khỏi chương trình");
			exit = true;
			break;
		default:
			System.out.println("Vui lòng nhập lại yêu cầu như bên dưới");
			break;
		}
		if(exit) {
			break;
		}
		Giaodien();
		}

	}
	public static void Giaodien() {
		System.out.println("--------QUẢN LÝ SINH VIÊN-------");
		System.out.println("1.Thêm sinh viên");
		System.out.println("2.Chỉnh sửa sinh viên dựa vào id");
		System.out.println("3.Xóa sinh viên dựa vào id");
		System.out.println("4.Sắp xếp sinh viên dựa vào điểm");
		System.out.println("5.Sắp xếp sinh viên dựa vào tên");
		System.out.println("6.Hiển thị thông tin sinh viên");
		System.out.println("0.Thoát khỏi chương trình");
		System.out.println("Vui lòng chọn số: ");
		
	}

}
