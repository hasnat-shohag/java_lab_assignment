import java.sql.*;

public class connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String  link = "jdbc:ucanaccess://C:/Users/Shohag/Documents/Database3.accdb";
			Connection connection = DriverManager.getConnection(link);
			System.out.println("Connected");
			connection.close();
 		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
