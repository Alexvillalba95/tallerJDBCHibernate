package org.springframework.samples.petclinic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCApplication {

	/*public static void main(String[] args) {
		System.out.println("-------- Test de conexión con MySQL ------------");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("No encuentro el driver en el Classpath");
			e.printStackTrace();
			return;
		}

		System.out.println("Driver instalado y funcionando");
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/petclinic","root", "root");
			if (connection != null)
				System.out.println("Conexión establecida");
			
		    String sql = "Select * from owners";
		    
		    statement = connection.createStatement();
		    ResultSet rs = statement.executeQuery(sql);
		    
		    while(rs.next()){
		    
		    	System.out.println("Id: "+rs.getInt(1)+" Nombre: "+rs.getString(2)+" Apellido: "+rs.getString(3)+" Ciudad: "+ rs.getString(5));
		    }
		    
		    rs.close();
		    
		    int num = 0;
		    /*sql = "INSERT INTO owners VALUES (11, 'Alejandro', 'Villalba', 'Avenida Romanticismo', 'Sevilla', '663106987')";
		    int num = statement.executeUpdate(sql);
		    
		    rs.close();
		    
		    sql = "INSERT INTO pets VALUES (14, 'Leon', '2000-09-07', 2, 11)";
		    num = statement.executeUpdate(sql);		    
		    sql = "UPDATE owners SET city = 'Sevill' WHERE first_name = 'Betty';";
		    num = statement.executeUpdate(sql);
		    
		    String nombre = "Alejandro";
		    String apellido = "";
		    
		    sql = "SELECT * FROM owners WHERE first_name LIKE ? OR last_name LIKE ?";
		    
		    PreparedStatement ps = connection.prepareStatement(sql);
		    
		    ps.setString(1, nombre);
		    ps.setString(2, apellido);
		    
		    rs = ps.executeQuery();
		    rs.next();
		    System.out.println("Nombre: "+ rs.getString(2)+" Apellido: "+rs.getString(3));
		    
		    
		    
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		} finally {
			try {
				if(statement != null)
					connection.close();
			} catch (SQLException se) {
		    	  
		    }
		    try {
		        if(connection != null)
		            connection.close();
		    } catch (SQLException se) {
		         	se.printStackTrace();
		    }
		}

	}*/

}
