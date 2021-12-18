package model;

public class Country {
	
	private int id;
	private String name;
	private String discription;
	
	public Country() {
		
	}

	public Country(int id, String name, String discription) {
		super();
		this.id = id;
		this.name = name;
		this.discription = discription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	protected void showAccess() {
		System.out.println("Lớp ngoài truy cập lớp thuộc package khác khi lớp đó extends từ lớp thuộc package khác");
	}
	
}
