package db;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnection {
	public static Connection getConnection() {
		String username = "root";
		String password = "";
		String url = "jdbc:mysql://localhost/shixun?useUnicode=true&characterEncoding=utf8";// 连接数据库同时设置字符编码
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("数据库驱动加载成功");
			return conn;
		}  catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("数据库驱动加载失败");
		return null;
	}

//	public static void main(String[] args) {
//		Connection conn = DBconnection.getConnection();
//
//		String sql = "select * from employee";
//
//		try {
//			PreparedStatement pre = conn.prepareStatement(sql);
//			
//			ResultSet res = pre.executeQuery();
//			
//			while(res.next()){
//				System.out.println(res.getString("EmployeeName"));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
