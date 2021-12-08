package databaseConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    
	private static final String hostName = "localhost";
	private static final String dbName="vaccinedmvc";
	private static final String username="root";
	private static final String password="mysql";
	
	private static final String connectURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;;
	
	public static void main(String[] args) {
		//1,Load driver depend on database type. For example Mysql
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connect = DriverManager.getConnection(connectURL, username, password);
			Statement statement = connect.createStatement();
			String insert = "INSERT INTO vaccinedpeople(name, phone, address) VALUE('Hieu','12345','Ha Tinh')";
			int rowsAffected = statement.executeUpdate(insert);
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
	}

}
