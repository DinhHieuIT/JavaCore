package dinhhieu;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		//upcasting là kiểu lớp con tham chiếu tới kiểu lớp cha
		DrinkWater drinkWater = new Redbull();
		//downcasting là kiểu đối tượng lớp cha tham chiếu tới kiểu lớp con
		Redbull redbull = (Redbull) drinkWater;
		DrinkWater drRedbull = new Redbull();
		if(drRedbull instanceof Lavie) {
			Lavie drLavie = (Lavie) drRedbull;
		}else {
			System.out.println("cant cast");
		}
		
		
		DrinkWater drLavie3 = new Lavie();
		if(drLavie3 instanceof Lavie) {
			Lavie lavie = (Lavie)drLavie3;
			lavie.cook();
		}
		
		//Lấy tên của các loại nước uống. Một biến kiểu dữ liệu superclass có thể tham chiếu
		//đến tất cả các object subclass.Cái này dùng upcasting
		List<DrinkWater> drinkWaters = new ArrayList<>();
		DrinkWater drRedbull1 = new Redbull();
		DrinkWater drLavie1 = new Lavie();

		drinkWaters.add(drRedbull1);
		drinkWaters.add(drLavie1);
		
		for (DrinkWater dr: drinkWaters) {
			System.out.println(dr.getName());
			System.out.println(dr.getOrigin());
		}
		

	}

}
