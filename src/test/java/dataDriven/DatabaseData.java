package dataDriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;


public class DatabaseData {

	@Test
	public void getData() throws SQLException
	{
		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root", "root");
		
		String query = "select * from demodata" ;
		
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery(query);
		
		while (res.next()) {
			String data = res.getString(1)+" " +res.getString(2);
			System.out.println(data);
		}
		con.close();
	}
}
