package com.db.demo.jdbc;

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
		String user = "System";
		String password = "oracle";
		String sql = "SELECT * FROM SYSTEM.EMPLOYEES";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();

		System.out.println("-- Employees Data --");

		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnName(i) + " ");
		}
		System.out.println();
		while (rs.next()) {
			System.out.println(rs.getInt("eid") + " " + rs.getString("first_name") + " " + rs.getDouble("salary"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
