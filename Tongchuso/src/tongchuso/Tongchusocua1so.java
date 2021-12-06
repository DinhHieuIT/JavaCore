package tongchuso;

import java.util.Scanner;

public class Tongchusocua1so {

	public static void main(String[] args) {
		while(true) {
		System.out.println("Nhập số cần tính tổng : ");
		int sum = nhap();
		System.out.println("Tổng các chữ số là : " + sum);
	}
	}
	public static int nhap() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		while(true) {
		try {
			int n= scanner.nextInt();
			check = true;
			return tinhTong(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
	public static int tinhTong(long i) {
		int sum = 0;
		long n;
		while(i!=0) {
			n=i%10;
			sum+=n;
			i/=10;
		}
		return sum;
	}
	}


