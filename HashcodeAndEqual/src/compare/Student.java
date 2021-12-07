package compare;

import java.util.Objects;

public class Student {
	
	private int sothutu;
	private String hoten;
	private int dateofbirth;
	private double diemtrungbinh;
	
	public Student() {
		super();
	}

	public Student(int sothutu, String hoten, int dateofbirth, double diemtrungbinh) {
		super();
		this.sothutu = sothutu;
		this.hoten = hoten;
		this.dateofbirth = dateofbirth;
		this.diemtrungbinh = diemtrungbinh;
	}
	
	public int getSothutu() {
		return sothutu;
	}
	public void setSothutu(int sothutu) {
		this.sothutu = sothutu;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(int dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public double getDiemtrungbinh() {
		return diemtrungbinh;
	}
	public void setDiemtrungbinh(double diemtrungbinh) {
		this.diemtrungbinh = diemtrungbinh;
	}

	@Override
	public String toString() {
		return "Student [sothutu=" + sothutu + ", hoten=" + hoten + ", dateofbirth=" + dateofbirth
				+ ", diemtrungbinh=" + diemtrungbinh + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateofbirth, diemtrungbinh, hoten, sothutu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return diemtrungbinh == other.diemtrungbinh && dateofbirth == other.dateofbirth;
	}
	
	

}
