import java.sql.*;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String link = "jdbc:ucanaccess://C:/Users/Shohag/Documents/daatabase.accdb";
			Connection connection = DriverManager.getConnection(link);
					
			Statement statement = connection.createStatement();
			
			String str="INSERT INTO rifat (ID, NAME, AGE) "
			          + "VALUES (30, 'Jui', 26)";
			
			statement.executeUpdate(str);
			
			
			System.out.println("Connected");
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		        
	}
}