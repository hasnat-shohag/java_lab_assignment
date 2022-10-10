import java.sql.*;

public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String link = "jdbc:ucanaccess://C:/Users/Shohag/Documents/daatabase.accdb";
			Connection connection = DriverManager.getConnection(link);
					
			Statement statement = connection.createStatement();
			
			String str = "update rifat set NAME = 'Hridoy' where NAME = 'fsf'";
			statement.executeUpdate(str);
			System.out.println("updated");
			
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}