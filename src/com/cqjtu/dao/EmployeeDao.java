package com.cqjtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.Paging;

import com.cqjtu._interface.IF_Employee;
import com.cqjtu.vo.Employee;

import db.DBconnection;

public class EmployeeDao implements IF_Employee {

	private static Connection conn;

	private static int count;

	private PreparedStatement pre = null;

	private ResultSet res = null;

	static {
		conn = DBconnection.getConnection();
		System.out.println(conn);
	}

	public EmployeeDao() {
		this.employeeList.clear();
	}

	/**
	 * 设置属性
	 * 
	 * @param employee
	 */
	@Override
	public Employee setAttributes(ResultSet res) {
		Employee employee = new Employee();

		try {
			employee.setEmployeeID(res.getInt("EmployeeID"));
			employee.setEmployeeName(res.getString("EmployeeName"));
			employee.setUserName(res.getString("UserName"));
			employee.setPhone(res.getString("Phone"));
			employee.setEmail(res.getString("Email"));
			employee.setStatus(res.getString("Status"));
			employee.setDepartment(res.getInt("Department"));
			employee.setPassword(res.getString("Password"));
			employee.setMiBaoDaan(res.getString("MibaoDaan"));

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employee;
	}

	/**
	 * 所有员工信息
	 */
	@Override
	public void allEmployeeInfo(int startNo, int pageNum) {
		String sql = "select *from employee order by EmployeeID asc limit ?,?";

		try {
			pre = conn.prepareStatement(sql);

			pre.setInt(1, startNo);
			pre.setInt(2, pageNum);

			res = pre.executeQuery();

			while (res.next()) {

				this.employeeList.add(setAttributes(res));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取员工表总记录数
	 * 
	 * @return 分页对象
	 */
	public Paging allCount() {
		String sql = "select count(*) from employee";

		Paging paging = new Paging();

		try {
			pre = conn.prepareStatement(sql);

			res = pre.executeQuery();

			while (res.next()) {

				paging.setCount(res.getInt(1));
				return paging;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据员工用户名查找信息
	 */
	@Override
	public int employeeInfoU(String UserName, int startNo, int pageNum) {
		String sql = "select *from employee where UserName like ? order by EmployeeID asc limit ?,?";

		UserName = "%" + UserName + "%";

		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, UserName);
			pre.setInt(2, startNo);
			pre.setInt(3, pageNum);

			res = pre.executeQuery();

			while (res.next()) {

				this.employeeList.add(setAttributes(res));

			}

			return count;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * 统计根据用户名查找的记录数
	 * @param UserName
	 * @return
	 */
	public Paging EbyUCount(String UserName) {
		String sql = "select count(*) from employee where UserName like ?";
		
		UserName = "%" + UserName + "%";
		
		Paging paging = new Paging();

		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, UserName);
			res = pre.executeQuery();

			while (res.next()) {
				paging.setCount(res.getInt(1));
				return paging;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据员工状态查找信息
	 * 
	 * @param Stauts员工状态
	 */
	@Override
	public void employeeInfoS(String Status, int startNo, int pageNum) {
		String sql = "select * from employee where Status like ? order by EmployeeID asc limit ?,?";

		Status = "%" + Status + "%";

		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, Status);
			pre.setInt(2, startNo);
			pre.setInt(3, pageNum);
			
			res = pre.executeQuery();

			while (res.next()) {

				this.employeeList.add(setAttributes(res));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 统计根据状态查找的记录数
	 * @param UserName
	 * @return
	 */
	public Paging EbySCount(String Status) {
		String sql = "select count(*) from employee where Status like ?";
		
		Status = "%" + Status + "%";
		
		Paging paging = new Paging();

		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, Status);
			res = pre.executeQuery();

			while (res.next()) {
				paging.setCount(res.getInt(1));
				return paging;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据员工ID查找信息
	 * 
	 * @param ID员工ID
	 */
	public Employee employeeInfoI(int EmployeeID) {
		String sql = "select * from employee where EmployeeID = ?";

		try {
			pre = conn.prepareStatement(sql);

			pre.setInt(1, EmployeeID);

			res = pre.executeQuery();

			while (res.next()) {
				return this.setAttributes(res);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 根据员工姓名查找信息
	 * 
	 * @param Stauts员工姓名
	 */
	@Override
	public void employeeInfoN(String EmployeeName, int startNo, int pageNum) {
		String sql = "select *from employee where EmployeeName like ? order by EmployeeID asc limit ?,?";

		try {
			pre = conn.prepareStatement(sql);

			EmployeeName = "%" + EmployeeName + "%";

			pre.setString(1, EmployeeName);
			pre.setInt(2, startNo);
			pre.setInt(3, pageNum);
			
			res = pre.executeQuery();

			while (res.next()) {

				this.employeeList.add(setAttributes(res));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 统计根据姓名查找的记录数
	 * @param UserName
	 * @return
	 */
	public Paging EbyNCount(String EmployeeName) {
		String sql = "select count(*) from employee where EmployeeName like ?";
		
		EmployeeName = "%" + EmployeeName + "%";
		
		Paging paging = new Paging();

		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, EmployeeName);
			res = pre.executeQuery();

			while (res.next()) {
				paging.setCount(res.getInt(1));
				return paging;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 添加员工信息
	 * 
	 * @param employee
	 * @return true || false
	 */
	public boolean addEmployee(Employee employee) {
		String sql = "insert into Employee (`EmployeeName`,`UserName`,`Phone`,`Email`,`Status`,`Department`,`Password`,`MibaoDaan`) values (?,?,?,?,?,?,?,?)";

		try {
			pre = conn.prepareStatement(sql);

			pre.setString(1, employee.getEmployeeName());
			pre.setString(2, employee.getUserName());
			pre.setString(3, employee.getPhone());
			pre.setString(4, employee.getEmail());
			pre.setString(5, "待审核");
			pre.setInt(6, employee.getDepartment());
			pre.setString(7, employee.getPassword());
			pre.setString(8, employee.getMiBaoDaan());

			if (pre.executeUpdate() > 0) {
				return true;
			}
			return false;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * 修改员工信息
	 * 
	 * @param employee
	 * @return true || false
	 */
	public boolean modifyEmployee(Employee employee) {
		String sql = "update Employee set EmployeeName = ?,Phone = ?,Email = ?,Status = ?,Department = ? where EmployeeID = ?";

		try {
			pre = conn.prepareStatement(sql);

			pre.setString(1, employee.getEmployeeName());
			pre.setString(2, employee.getPhone());
			pre.setString(3, employee.getEmail());
			pre.setString(4, employee.getStatus());
			pre.setInt(5, employee.getDepartment());
			pre.setInt(6, employee.getEmployeeID());

			if (pre.execute()) {
				System.out.println("修改语句成功执行。");
				return true;
			}
			return false;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 删除员工信息
	 * 
	 * @param employee
	 * @return true || false
	 */
	public boolean delEmployee(Employee employee) {
		String sql = "delete from employee where UserName = ? and Passwrod = ?";

		try {
			pre = conn.prepareStatement(sql);

			if (employee.getStatus() == "管理员") {
				sql = "delete from employee where EmployeeID = ?";
				pre = conn.prepareStatement(sql);
				pre.setInt(1, employee.getEmployeeID());
			} else {
				pre.setString(1, employee.getUserName());
				pre.setString(2, employee.getPassword());
			}

			if (pre.execute()) {
				return true;
			}

			return false;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 修改密码
	 * 
	 * @param UserName
	 *            员工用户名
	 * @param NewPassword
	 *            新密码
	 * @return true || false
	 */
	@Override
	public boolean modifyPassword(String UserName, String Password,
			String NewPassword, String MibaoDaan) {
		String sql = "update employee set Password = ? where UserName = ? and Password = ? and MibaoDaan = ?";

		try {
			pre = conn.prepareStatement(sql);

			pre.setString(1, NewPassword);
			pre.setString(2, UserName);
			pre.setString(3, Password);
			pre.setString(4, MibaoDaan);

			if (pre.execute()) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	/**
	 *
	 * @param checkInfo
	 * @return true || false
	 */
	public boolean checkUserName(String checkInfo){
		Connection con = DBconnection.getConnection();
		PreparedStatement pre = null;
		ResultSet res = null;
		String sql = "select * from employee where UserName= ?";
		try {
			pre = con.prepareStatement(sql);
			pre.setString(1, checkInfo);
			
			res = pre.executeQuery();
			if(res.next()){
				return true;
			}
			else
				return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	/***
	 * 
	 * @param employee
	 * @return true || false
	 */
	public int login(Employee employee){
		
		ResultSet res = null;
		String sql = "select * from employee where UserName= ? and Password= ?";
		
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, employee.getUserName());
			pre.setString(2, employee.getPassword());
			res = pre.executeQuery();
			if(res.next()){
				System.out.println("狀態："+res.getString("Status"));
				if(res.getString("Status").equals("管理员")){
					return 2;
				}
				return 1;
			}
			return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public Employee searchEmployeeIDByUserName(String UserName){
		
		ResultSet res = null;
		String sql = "select EmployeeID from employee where UserName= ?";
		
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1,UserName);
			res = pre.executeQuery();
			if(res.next()){
				Employee employee = new Employee();
				employee.setEmployeeID(res.getInt(1));
				return employee;
			}
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public boolean checkMiBaoDaan(Employee employee){
		
		ResultSet res = null;
		String sql = "select * from employee where UserName= ? and MiBaoDaan= ?";
		
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, employee.getUserName());
			pre.setString(2, employee.getMiBaoDaan());
			res = pre.executeQuery();
			if(res.next()){
				return true;
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	
	public Employee selectPasswordByUserName(String UserName){
		ResultSet res = null;
		String sql = "select Password from employee where UserName= ?";
		
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, UserName);
			res = pre.executeQuery();
			if(res.next()){
				Employee employee = new Employee();
				employee.setPassword(res.getString(1));
				return employee;
			}
			return null;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Employee> getEmployeeList() {
		return this.employeeList;
	}

	// public static void main(String[] args) {
	// EmployeeDao emd = new EmployeeDao();
	// Employee employee = new Employee();
	// employee.setStatus("管理员");
	// employee.setEmployeeID(5);
	// emd.delEmployee(employee);
	// }

}
