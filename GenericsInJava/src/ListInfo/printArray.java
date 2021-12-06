package ListInfo;

import java.util.Arrays;
import java.util.List;

public class printArray {

	public static void main(String[] args) {
		String[] stringArr = {"Anh","Pháp","Đức","Ý","Brazil"};
		List<String> stringList = convertList(stringArr);
		showList(stringList);
		Integer[] intArr= {1,3,7,2,4};
		List<Integer> intList = convertList(intArr);
		showList(intList);
	}

	public static <T> List<T> convertList(T[] arrs){
		return Arrays.asList(arrs);
	}
	
	public static <T> void showList(List<T> arrs) {
		System.out.println("Danh sách phần tử của mảng là : ");
		for(T element : arrs) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
