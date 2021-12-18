package accessGrant;

import model.Country;
//Một lớp chỉ có 2 modifier là public và default
public class MainProgram extends Country {
	
	private String speed = "60km/h";
	private static String speedStatic = "60km/h";

	public static void main(String[] args) {
		//Phương thức static không thể gọi biến non-static
		//Phương thức static không thể gọi trực tiếp phương thức non-static
		//System.out.println("Tốc độ của anh ấy là + " + speed);
        //showSpeed();
		showSpeedByStatic();
		//Không thể khởi tạo school vì lớp school khai báo default mà lại nằm khác package 
		//Chỉ có cùng lớp hoặc cung package mới truy cập được
		//Shool name = new School();
		
		Country vietnam = new Country();
		//vietnam.showAccess();Chỉ truy câp được từ lớp con kế thừa coutry.
		MainProgram country = new MainProgram();
		country.showAccess();
		
	}
	
	public void showSpeed() {
		System.out.println("Tốc độ của anh ấy là : " +speed);
	}
	
	public static void showSpeedByStatic() {
		System.out.println("Tốc độ của anh ấy là : " + speedStatic);
	}

}
