package dinhhieu;

public class Lavie extends DrinkWater {

	@Override
	public String getCostPerUnit() {
		return "Gía Lavie là 10 nghìn";
	}

	@Override
	public String getOrigin() {
		return "Nguồn lavie từ nhà máy vĩnh hảo";
	}

	@Override
	protected String getName() {
		
		return "Tên là Lavie";
	}
	
	public void cook() {
		System.out.println("Nước lavie có thể dùng nấu ăn");
	}

}
