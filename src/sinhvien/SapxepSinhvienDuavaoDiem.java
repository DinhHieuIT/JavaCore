package sinhvien;

import java.util.Comparator;

public class SapxepSinhvienDuavaoDiem implements Comparator<Sinhvien> {

	@Override
	public int compare(Sinhvien sinhvien1, Sinhvien sinhvien2) {
		if(sinhvien1.getDiemtrungbinh() > sinhvien2.getDiemtrungbinh()) {
			return 1;
		}
		return -1;
	}

}
