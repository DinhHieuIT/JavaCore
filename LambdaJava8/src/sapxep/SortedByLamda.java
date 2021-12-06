package sapxep;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedByLamda {

	public static void main(String[] args) {
		List<Integer> numberarr = Arrays.asList(1, 5, 2, 7, 20);
		List<String> stringarr = Arrays.asList("Bánh","Anh","Hóa","Đạt","Cứng");
		//SortNumberByCollection(numberarr);
		SortNumberByLamda(numberarr);
		showListNumber(numberarr);
		SortStringByCollection(stringarr);
		sortStringByLambda(stringarr);
		System.out.println();
		showListString(stringarr);

	}
	
  //Sắp xép sử dụng collecion comparator với số
   public static List<Integer> SortNumberByCollection(List<Integer> arr){
	   Collections.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 > o2 ? 1 : -1;
			}
		});
	return arr;
   }
   
 //Sắp xếp mảng số nguyên sử dụng Lambda
   public static List<Integer> SortNumberByLamda(List<Integer> arr){
	   Collections.sort(arr,(Integer o1,Integer o2) -> {
		   return o1 > o2 ? 1 : -1;
	   });
	return arr;
   }
   
  //Sắp xếp sử dụng collection comparator với String
   public static List<String> SortStringByCollection(List<String> arr){
	   Collections.sort(arr, new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
		   
	   });
	return arr;
   }
   
   //Sắp xếp number sử dụng Lamda với String
   public static List<String> sortStringByLambda(List<String> arr){
	   Collections.sort(arr, (String o1,String o2) -> {
		   return o1.compareTo(o2);
	   });
	return arr;
   }
   
   //Show list danh sach các phần tử của mảng so
   public static void showListNumber(List<Integer> arr) {
	   for (Integer number : arr) {
			System.out.print(number + " ");
		}
   }
   
   //Show list danh sach các phần tử của mảng string
   public static void showListString(List<String> arr) {
	   for (String element : arr) {
			System.out.print(element + " ");
		}
   }
}
