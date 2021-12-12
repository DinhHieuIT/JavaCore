package movemethod;

public class PlaneDaoImpl implements MoveDao {
	
	@Override
	public void speed() {
		
		System.out.println("Planne average Speed is 200 km/h");
		
	}

	@Override
	public void cost() {
		
		System.out.println("Plane average Cost is 20 billion vnd");
	}

}
