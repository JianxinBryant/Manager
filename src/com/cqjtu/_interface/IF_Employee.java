package com.cqjtu._interface;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.cqjtu.vo.Employee;

public interface IF_Employee {

	/**
	 * 设置属性
	 * 
	 * @param employee
	 */
	public Employee setAttributes(ResultSet res);

	/**
	 * 接收所有员工信息的集合
	 */
	public ArrayList<Employee> employeeList = new ArrayList<Employee>();

	/**
	 * 所有员工信息 将所得每一个员工信息遍历插入上面的集合对象里
	 */
	public void allEmployeeInfo(int startNo, int pageNum);

	/**
	 * 根据员工用户名查找信息
	 * 
	 * @param UserName
	 *            员工用户名
	 */
	public int employeeInfoU(String UserName, int startNo, int pageNum);

	/**
	 * 根据员工状态查找信息
	 * 
	 * @param Stauts
	 *            员工状态
	 */
	public void employeeInfoS(String Status, int startNo, int pageNum);

	/**
	 * 根据员工姓名查找信息
	 * 
	 * @param Stauts
	 *            员工姓名
	 */
	public void employeeInfoN(String EmployeeName, int startNo, int pageNum);

	/**
	 * 添加员工信息
	 * 
	 * @param employee
	 * @return true || false
	 */
	public boolean addEmployee(Employee employee);

	/**
	 * 删除员工信息
	 * 
	 * @param employee
	 * @return true || false
	 */
	public boolean delEmployee(Employee employee);

	/**
	 * 修改密码
	 * 
	 * @param UserName
	 *            员工用户名
	 * @param NewPassword
	 *            新密码
	 * @return true || false
	 */
	public boolean modifyPassword(String UserName, String password,
			String NewPassword, String MibaoDaan);

	/**
	 * 返回该类的集合对象
	 * 
	 * @return EmployeeList
	 */
	public ArrayList<Employee> getEmployeeList();

}
