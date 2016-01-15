package com.main.general;
/*
 * Write a program to make use of JDBC and 
 * insert/update/select values in the database.
 * 
 * @author: Manjula Acharya
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;



public class JDBCOperations {

	public static Connection conn;
	
	public static String connURL = "jdbc:oracle:thin:hr/hr123@hr.cwjgdp1wxdy2.us-west-1.rds.amazonaws.com:1521:orcl";
	public static String userName = "whiteboxqa";
	public static String userPwd = "Excellence";
			
	public static Connection getDBConnection(){
		
		if (conn == null)
		{
			try 
			{
				conn = DriverManager.getConnection(connURL, userName, userPwd);
				
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return conn;	
	}
	
	
	//Select 
	public void selectData()
	{
    	try 
    	{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select employee_id, first_name, last_name, salary from employees where department_id in (60, 100)");
			int records = 0;
		    
			while (rs.next()){
				records++;
				int emp_id = rs.getInt("Employee_Id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				double salary = rs.getDouble("salary");
				System.out.println("EmpId: " + emp_id + " EmpName:" + firstName+ " " + lastName + " Salary:" + salary);
			}
			rs.close();
			System.out.println("Total number of records:"+ records);
		} catch (SQLException e) 
    	{
			e.printStackTrace();
		}
    }
	
	
	//Insert
		public void insertData() throws SQLException
		{
			String sql = "INSERT INTO Employees (employee_id, first_name, last_name, email, hire_date, job_id) VALUES (?, ?, ?, ?, ?, ?)";
			 
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, 210);
			statement.setString(2, "John");
			statement.setString(3, "Smith");
			statement.setString(4,  "john.smith@gmail.com");
			statement.setDate(5, java.sql.Date.valueOf(java.time.LocalDate.now()));
			statement.setString(6, "HR_REP");
			 
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new employee was inserted successfully!");
			}
		}
	
	
	//Update
	public void updateData() throws SQLException
	{
		String sql = "UPDATE employees SET salary = ? WHERE employee_id=?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setDouble(1, 35000.00);
		statement.setInt(2, 110);
		 
		int rowsUpdated = statement.executeUpdate();
		if (rowsUpdated > 0) 
		{
		    System.out.println("An existing employee was updated successfully!");
		}
	}
	
	
   
	public static void main(String[] args) throws SQLException {
		
		Connection conn = getDBConnection();
		
		if(conn != null)
		{
			JDBCOperations jd = new JDBCOperations();
			
			//Call all your jdbc operations here
			jd.selectData(); //Select
			jd.insertData(); //Insert
			jd.updateData(); //Update
		}
		try
		{
			if(conn != null)
				conn.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}

