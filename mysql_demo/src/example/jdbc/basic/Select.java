package example.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		//設定連線資訊（url:port，db名稱，user名稱，密碼）
		String url = "jdbc:mysql://localhost:3306/homework_db";
		String user = "root";
		String password = "123456";

		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			// 搜尋資料
			String searchSQL = """
					SELECT * FROM member_info
					WHERE account = 'mem002' AND password = 'pass5678';
										""";
			//透過連線建立一個Statement物件，接收我們想要實際執行的SQL語法
			try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(searchSQL)) {
				while (rs.next()) {
					System.out.println("Member ID: " + rs.getInt("member_id"));
					System.out.println("Account: " + rs.getString("account"));
					System.out.println("Password: " + rs.getString("password"));
					System.out.println("Member Name: " + rs.getString("member_name"));
					System.out.println("Address: " + rs.getString("address"));
					System.out.println("Email: " + rs.getString("email"));
				}
			}

			// 1號會員的登入操作
			String loginSQL = """
					SELECT * FROM member_info
					WHERE account = 'mem001' AND password = 'pass1234';
										""";
			try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(loginSQL)) {
				while (rs.next()) {
					System.out.println("Member ID: " + rs.getInt("member_id"));
					System.out.println("Account: " + rs.getString("account"));
					System.out.println("Password: " + rs.getString("password"));
					System.out.println("Member Name: " + rs.getString("member_name"));
					System.out.println("Address: " + rs.getString("address"));
					System.out.println("Email: " + rs.getString("email"));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
