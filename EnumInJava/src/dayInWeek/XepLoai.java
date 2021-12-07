package dayInWeek;

public enum  XepLoai{
	
	GIOI(1), KHA(2), TRUNGBINH(3),YEU(4);
	
	private int value;

	XepLoai(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
