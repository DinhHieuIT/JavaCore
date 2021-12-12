package movemethod;

import java.util.Scanner;
//DI Container : Taọ và quản lý module/object con được inject
public class ChooseDao {
	
	static Scanner scanner = new Scanner(System.in);
	public static MoveDao getDao() {
		int choose;
		System.out.println("Please choose 1 or 2 : ");
		try {
//Inversion of Control : choose làm thay đổi luồng điều khiển của ứng dụng.
			choose = scanner.nextInt();
			if(choose == 1) {
				return new MotoDaoImpl();
			}else if (choose == 2) {
				return new PlaneDaoImpl();
			}else {
				System.out.println("Please input 1 or 2");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
		
	}
}
