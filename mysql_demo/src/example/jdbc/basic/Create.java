package example.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/homework_db";
		String user = "root";
		String password = "123456";

		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			// 新增三筆資料
			String insertSQL = """
					INSERT INTO member_info (member_id, account, password, member_name, address, email) VALUES
					(1, 'mem001', 'pass1234', 'John Doe', '123 Main St, City', 'john.doe@example.com'),
					(2, 'mem002', 'pass5678', 'Jane Smith', '456 Elm St, Town', 'jane.smith@example.com'),
					(3, 'mem003', 'pass91011', 'Alice Brown', '789 Oak St, Village', 'alice.brown@example.com');
										""";
			try (Statement stmt = conn.createStatement()) {
				stmt.executeUpdate(insertSQL);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
