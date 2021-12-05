package sinhvien;

import java.util.Comparator;

public class SapxepSinhvienDuavaoTen implements Comparator<Sinhvien> {

	@Override
	public int compare(Sinhvien sinhvien1, Sinhvien sinhvien2) {
		return sinhvien1.getHovaten().compareTo(sinhvien2.getHovaten());
	}
	

}
