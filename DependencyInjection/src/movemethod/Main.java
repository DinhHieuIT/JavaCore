package movemethod;

public class Main {

	/*
	 * If add vehicle (Use DI)
	 * 1. Add DaoImpl
	 * 2. Edit ChooseDao
	 */
	public static void main(String[] args) {
		User user = new User();
		user.action();
	}
	
	/*
	 * If add vehicle (No DI)
	 * 1. Add DaoImpl
	 * 2. Edit ChooseDao
	 * 3. Edit User
	 */

}
