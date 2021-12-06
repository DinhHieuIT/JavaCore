package streamBasic;

import java.util.Arrays;
import java.util.List;

public class FindEven {

	public static void main(String[] args) {
		List<Integer> numberarr = Arrays.asList(3,5,4,19,2,34,11);
		showList(numberarr);
		withoutStream(numberarr);
	
	}
	//Không Sử dụng stream thì đếm sau mỗi lần lặp thành công
	public static void withoutStream(List<Integer> arrs) {
		int count =0 ;
		for(Integer number : arrs) {
			if(number % 2 !=0) {
				count++;
			}
		}
		System.out.println("Answer don't use Stream : ");
		System.out.printf("There is %d elements that are odd", count);
	}
	//Sử dụng stream thì không cần đếm sau mối lần lặp .
	public static void useStream(List<Integer> arrs) {
		long count= arrs.stream().filter(number -> number%2!=0).count();
		System.out.println("Answer use Stream : ");
		System.out.printf("There is %d elements that are odd", count);
	}
	
	public static void showList(List<Integer> arrs) {
		System.out.println("How many odd number in array below ? ");
		for (Integer number : arrs) {
			System.out.print(number + " ");
		}
	}

}
