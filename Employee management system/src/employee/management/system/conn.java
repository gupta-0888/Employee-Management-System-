package employee.management.system;


import java.sql.*;

public class conn {
	
	Connection connection;
	 Statement statement;
	 conn(){
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem","root","root");
			 statement = connection.createStatement();
			 
		 }catch (Exception e) {
			 e.printStackTrace();
			// TODO: handle exception
		}
	 }
	
	public static void main(String[] args) {
		
	}

}
