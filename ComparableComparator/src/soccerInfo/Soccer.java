package soccerInfo;

public class Soccer implements Comparable<Soccer> {
	
	private String name;
	private String team;
	private int weight;
	private double height;
	private int dateofbirth;
	
	public Soccer() {
		super();
	}
	
	public Soccer(String name, String team, int weight, double height, int dateofbirth) {
		super();
		this.name = name;
		this.team = team;
		this.weight = weight;
		this.height = height;
		this.dateofbirth = dateofbirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(int dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	@Override
	public String toString() {
		return "Soccer [name=" + name + ", team=" + team + ", weight=" + weight + ", height=" + height
				+ ", dateofbirth=" + dateofbirth + "]";
	}

	@Override
	public int compareTo(Soccer o) {
		if(this.height-o.height>0) {
			return 1;
		}else if(this.height-o.height<0){
			return -1;
		}else {
			return 0;
		}
	}

}
