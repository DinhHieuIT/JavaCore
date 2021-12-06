package streamBasic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

public class FindEven {

	public static void main(String[] args) {
		List<Integer> numberarr = Arrays.asList(3,5,4,19,2,34,11);
		showList(numberarr);
		//showListByStream(numberarr);
		System.out.println();
		useStream(numberarr);
		System.out.println();
		withoutStream(numberarr);
		System.out.println();
		maxNumber(numberarr);
		useStatistics(numberarr);
	
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
	
	//Tìm số lớn nhất trong dãy với stream 
	public static void maxNumber(List<Integer>arrs) {
		Integer maxnum = arrs.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max number is " + maxnum);
	}
	
	//Sử dụng phương thức summaryStatistics để lấy giá trị count, min, max, sum và average
	public static void useStatistics(List<Integer> arrs) {
		IntSummaryStatistics root = arrs.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("count :" + root.getCount());
		System.out.println("Max :" + root.getMax());
		System.out.println("Min :" + root.getMin());
		System.out.println("Sum :" + root.getSum());
		System.out.println("Average :" + root.getAverage());
	}
	public static void showList(List<Integer> arrs) {
		System.out.println("How many odd number in array below ? ");
		for (Integer number : arrs) {
			System.out.print(number + " ");
		}
		
	}
	
	public static void showListByStream(List<Integer> arrs) {
		arrs.stream().forEach(System.out::print);
	}

}
