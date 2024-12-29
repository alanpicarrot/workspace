package example.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/homework_db";
		String user = "root";
		String password = "123456";

		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			// 修改1號會員的密碼
			String updatePasswordSQL = """
					UPDATE member_info
					SET password = 'ji394mysql'
					WHERE member_id = 1;
										""";
			try (Statement stmt = conn.createStatement()) {
				stmt.executeUpdate(updatePasswordSQL);
			}

			// 修改3號會員的名稱及電子信箱
			String updateMemberSQL = """
					UPDATE member_info
					SET member_name = 'Vic Liu', email = 'vic.liu@example.com'
					WHERE member_id = 3;
										""";
			try (Statement stmt = conn.createStatement()) {
				stmt.executeUpdate(updateMemberSQL);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
