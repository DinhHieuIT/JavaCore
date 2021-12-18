package upDownCasting;

//Downcasting và Upcasting được sử dụng trong kế thừa mà không cần khởi tạo 
//đối tượng với từ khóa new.
public class MainProgram {

	public static void main(String[] args) {
		Childrend baby = new Childrend();
		//Upcasting là chuyển thể hiện lớp con thành thể hiện lớp cha
		Father father1 = baby;
		Father father2 = (Father) baby;
		
		//Cả childrend và Father đều truy cập được phương thức run() của lớp cha
		//Khi biến tham chiếu của father tham chiếu đối tượng childrend gọi à upcasting
		 baby.eat();
		 baby.run();
		 father1.run();
		 //father1.eat();
		 
		 //Phương thức của lớp con có thể ghi đè phương thức lớp cha
		 father1.sing();
		 //Downcasting là chuyển thể hiện lớp cha thành thể hiện lớp con.
		 Father father3 = new Childrend();
		 Childrend child = (Childrend) father3;
		 child.eat();
		

	}

}
