package soccerInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class soccerCompare {

	public static void main(String[] args) {
		ArrayList<Soccer> soccers = new ArrayList<Soccer>();
		soccers.add(new Soccer("Ronaldo","Mu",90,1.9,1985));
		soccers.add(new Soccer("Pique","Barce",85,1.95,1986));
		soccers.add(new Soccer("Fred","Mu",75,1.7,1990));
		soccers.add(new Soccer("Ramos","PSG",90,1.85,1986));
		
		Collections.sort(soccers);
		System.out.println("Sort soccer by height");
		showList(soccers);
		
		System.out.println("Sort soccer by weight");
		Collections.sort(soccers,new Comparator<Soccer>() {

			@Override
			public int compare(Soccer o1, Soccer o2) {
				return o1.getWeight()>o2.getWeight() ? 1 : -1;
			}	
		});
		showList(soccers);
		System.out.println("Sort soccer by dateofbirth");
		Collections.sort(soccers,new Comparator<Soccer>() {

			@Override
			public int compare(Soccer o1, Soccer o2) {
				return o1.getDateofbirth()>o2.getDateofbirth() ? 1 : -1;
			}	
		});
		showList(soccers);
	}
	    
	public static void showList(List<Soccer> soccers) {
		for (Soccer soccer : soccers) {
			System.out.println(soccer.toString());
		}
		
	}
	
}
