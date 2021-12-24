package dinhhieu.main;

public class ExtendMain {

	public static void main(String[] args) {
		Developer dev1 = new Developer();
		//Lớp con có thể đè lên lớp cha
	    dev1.checkInOut();
	    System.out.println("Brand of water drinking is " + dev1.water);
	    //Class con được hưởng tất cả phương thức và thuộc tính của class cha/
	    //Class con được truy cập các thành viên của class cha ngoại trừ modifier là private.
	    //System.out.println("Brand of water drinking is " + dev1.salaryTable);
       Tester test1 = new Tester();
       test1.checkInOut();
	}

}
