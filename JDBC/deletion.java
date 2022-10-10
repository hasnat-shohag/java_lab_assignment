import java.sql.*;

public class deletion {
	public static void main(String args[]) {
		
		try {
			String link = "jdbc:ucanaccess://C:/Users/Shohag/Documents/daatabase.accdb";
			Connection connection = DriverManager.getConnection(link);
					
			Statement statement = connection.createStatement();

			String str = "delete from rifat where Name='Jui'";
			
			statement.executeUpdate(str);
			System.out.println("Deleted");
			
			connection.close();
		} catch (Exception ex) {
			System.out.print("Not Connected");
		}
	}

}