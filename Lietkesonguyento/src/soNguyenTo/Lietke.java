package soNguyenTo;

import java.util.Scanner;

//Liệt kê n số nguyên tố đầu tiên trong java .Số nguyên tố chỉ chia hết cho 1 và chính nó.
public class Lietke {
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int dem = 0;
		int k = 2;
		System.out.println("Nhập danh sách n số nguyên tố đầu tiên : ");
		try {
			int n= scanner.nextInt();
			while(dem<n) {
				if(kiemTraSoNguyenTo(k)) {
				System.out.println(k+" ");
					dem++;
				}
				k++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean kiemTraSoNguyenTo(int n) {
		if(n<2) {
			return false;
		}
		int canbac2 = (int) Math.sqrt(n);
		for(int i=2; i<=canbac2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
