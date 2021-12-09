package databaseConnect;

public class VaccinedPeople {
	
	private int id;
	private String name;
	private String phone;
	private String address;
	
	public VaccinedPeople() {
		super();
	}

	public VaccinedPeople(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "VaccinedPeople [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

}
