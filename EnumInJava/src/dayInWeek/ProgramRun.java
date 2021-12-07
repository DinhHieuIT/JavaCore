package dayInWeek;

public class ProgramRun {

	public static void main(String[] args) {
		System.out.println("Chủ nhật các công ty có phải làm việc không ? ");
		//Trong phương thức breakTime có thể truyền bất kỳ giá trị nào 
		System.out.println(breakTime(1));
		System.out.println("Thứ 2 các anh có đi đá bóng không ?");
		System.out.println(footballTime(DayName.MONDAY));
		System.out.println("Tập hợp các ngày trong tuần là : "); 
		showDayInWeek();
		System.out.println();
		System.out.println("Hiển thị xếp loại học sinh : ");
		for(XepLoai s : XepLoai.values()) {
			System.out.println(s +" "+ s.getValue());
		}
	}
	
	public static String breakTime(int dayInWeek) {
		//Nếu muốn in tên các ngày trong tuần thì nó sẽ là con số 
		if(dayInWeek == DayInWeek.SUNDAY) {
			return "Không phải lên công ty làm việc ";
		}
		return "Phải lên công ty làm việc";
	}

	public static String footballTime(DayName dayName) {
		if(dayName == DayName.MONDAY) {
			return "Ngày này sẽ đi đá bóng";
		}
		return "Ngày này sẽ không đi đá bóng";
	}
	
	public static void showDayInWeek() {
		DayName[] allDays = DayName.values();
		for(DayName day : allDays) {
			System.out.print(day + " ");
		}
	}
}
