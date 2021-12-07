package compare;

public class EmployeeSalary {
	
	private int sothutu;
	private String ten;
	private int mucluong;
	
	public EmployeeSalary() {
		super();
	}
	
	public EmployeeSalary(int sothutu, String ten, int mucluong) {
		super();
		this.sothutu = sothutu;
		this.ten = ten;
		this.mucluong = mucluong;
	}
	
	public int getSothutu() {
		return sothutu;
	}
	public void setSothutu(int sothutu) {
		this.sothutu = sothutu;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getMucluong() {
		return mucluong;
	}
	public void setMucluong(int mucluong) {
		this.mucluong = mucluong;
	}

}
