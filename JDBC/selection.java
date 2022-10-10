import java.sql.*;

public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String link = "jdbc:ucanaccess://C:/Users/Shohag/Documents/daatabase.accdb";
			Connection connection = DriverManager.getConnection(link);
					
			Statement statement = connection.createStatement();
			
			String str="select * from rifat where AGE = 32";
			
			ResultSet result = statement.executeQuery(str);
				
			while (result.next()) {
				int id = result.getInt("ID");
				String s = result.getString("NAME");
				System.out.println("ID "+id +" Name : "+s);
			}
			
			System.out.println("Connected");
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}