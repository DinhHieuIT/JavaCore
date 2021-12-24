package dinhhieu.main;

public class Employee  {
	private String salaryTable ="Only Manager see it";
	String water = "lavie";
	void checkInOut() {
		System.out.println("All employee need checkIn và checkOut");
	}
	public String getSalaryTable() {
		return salaryTable;
	}
	public void setSalaryTable(String salaryTable) {
		this.salaryTable = salaryTable;
	}
	public String getWater() {
		return water;
	}
	public void setWater(String water) {
		this.water = water;
	}
	
	

}
