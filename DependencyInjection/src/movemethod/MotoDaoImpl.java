package movemethod;

public class MotoDaoImpl implements MoveDao {

	@Override
	public void speed() {
		
		System.out.println("Moto average Speed is 80 km/h");
		
	}

	@Override
	public void cost() {
		
		System.out.println("Moto average Cost is 20 million vnd");
	}

}
