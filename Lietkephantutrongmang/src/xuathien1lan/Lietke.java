package xuathien1lan;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Lietke {
   public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhập số phần tử của mảng : ");
		try {
			int sophantu = scanner.nextInt();
			int[] mangvuatao =taomang(sophantu);
			if(sophantu > 0) {
				hienthimang(mangvuatao);
			//Mang chứa các phần tử và số lần xuất hiện
			Map<Integer, Integer> mangphantuduynhat= new TreeMap<Integer,Integer>();
			for(int i=0;i<mangvuatao.length;i++) {
				Phantuvasolanxuathien(mangphantuduynhat, mangvuatao[i]);
			}
			
			System.out.println("Các phần tử xuất hiện duy nhất 1 lần là : ");
			for (Integer key:mangphantuduynhat.keySet()) {
				if(mangphantuduynhat.get(key) ==1) {
					System.out.print(key + " ");
				}
			}
			}
		} catch (Exception e) {
			System.out.println("Số phần tử của mảng phải là số nguyên dương");
		}	
	}
	
	//Nhập một mảng số nguyên 
	public static int[] taomang(int n){
		
		int[] mangsonguyen = new int[n];
		for (int i=0;i<n;i++) {
	    System.out.println("Nhập vào phần tử thứ : " + i);
	    mangsonguyen[i] = scanner.nextInt();
				}
		return mangsonguyen;
			}
	
	//Hiển thị các phần tử của mảng
	public static void hienthimang(int arr[]) {
		System.out.println("Tập hợp các phần tử của mảng là : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//Map chứa các phần tử và số lần xuất hiện 
	public static void Phantuvasolanxuathien (Map<Integer, Integer>mang, int phantu) {
		if(mang.containsKey(phantu)) {
			int solan= mang.get(phantu)+1;
			mang.put(phantu, solan);
		}else {
			mang.put(phantu, 1);
		}
		
	}
}
