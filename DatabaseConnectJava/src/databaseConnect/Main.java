package databaseConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    
	private static final String hostName = "localhost";
	private static final String dbName="vaccinedmvc";
	private static final String username="root";
	private static final String password="mysql";
	
	private static final String connectURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
	
	private static SessionFactory factory ;
	
	private static List<VaccinedPeople> vaccinedPeoples = new ArrayList<VaccinedPeople>();
	
	public static void main(String[] args) {
		
		//1,Load driver depend on database type. For example Mysql
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connect = DriverManager.getConnection(connectURL, username, password);
			Statement statement = connect.createStatement();
			String insert = "INSERT INTO vaccinedpeople(name, phone, address) VALUE('Hieu','12345','Ha Tinh')";
			String load = "SELECT * FROM vaccinedpeople";
			int rowsAffected = statement.executeUpdate(insert);
			ResultSet rs = statement.executeQuery(load);
			
			while(rs.next()) {
				VaccinedPeople vaccinedPeople = new VaccinedPeople();
				vaccinedPeople.setId(rs.getInt("id"));
				vaccinedPeople.setName(rs.getString("name"));
				vaccinedPeople.setPhone(rs.getString("phone"));
				vaccinedPeople.setAddress(rs.getString("address"));
				vaccinedPeoples.add(vaccinedPeople);
			}
			
			if(rowsAffected == 0) {
				System.out.println("Insert failed");
			}else {
				System.out.println("Insert successful");
			}
			statement.close();
			connect.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Sử dụng hibernate
		VaccinedPeopleService vaccinedPeopleService = new VaccinedPeopleService();
		Integer id1 = vaccinedPeopleService.addPeople("Hoan","1285","Ha Tinh");
		vaccinedPeopleService.showList(vaccinedPeoples);
		
	
	
	
	
	
	
	
	
	}
}
