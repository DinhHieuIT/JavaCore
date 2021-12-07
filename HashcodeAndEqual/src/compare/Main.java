package compare;

public class Main {

	public static void main(String[] args) {
		//Với lớp chúng ta chưa override phương thức equals.
		EmployeeSalary NamSalary = new EmployeeSalary(1,"Nam",123456);
		EmployeeSalary TrangSalary = new EmployeeSalary(1,"Nam",123456);
		
		if(NamSalary.equals(TrangSalary)) {
			System.out.println("Nam và Trang giống nhau");
		}else {
			System.out.println("Nam và Trang khác nhau");
		}
		
		//Với lớp chúng ta đã override phương thức equals.
		Student NamInfo = new Student(1,"Nam",1989,3.2);
		Student TrangInfo = new Student(2,"Trang",1989,3.2);
		
		if (NamInfo.equals(TrangInfo)) {
			System.out.println("Trang và Nam xếp hạng cùng nhau dựa vào năm sinh và điểm ");
		}else {
			System.out.println("Trang và Nam thứ hạng khác nhau dựa vào năm sinh và điểm ");
		}
	
	}

}
