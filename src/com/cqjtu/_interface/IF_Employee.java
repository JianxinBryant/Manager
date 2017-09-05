package com.cqjtu._interface;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.cqjtu.vo.Employee;

public interface IF_Employee {

	/**
	 * ��������
	 * 
	 * @param employee
	 */
	public Employee setAttributes(ResultSet res);

	/**
	 * ��������Ա����Ϣ�ļ���
	 */
	public ArrayList<Employee> employeeList = new ArrayList<Employee>();

	/**
	 * ����Ա����Ϣ ������ÿһ��Ա����Ϣ������������ļ��϶�����
	 */
	public void allEmployeeInfo(int startNo, int pageNum);

	/**
	 * ����Ա���û���������Ϣ
	 * 
	 * @param UserName
	 *            Ա���û���
	 */
	public int employeeInfoU(String UserName, int startNo, int pageNum);

	/**
	 * ����Ա��״̬������Ϣ
	 * 
	 * @param Stauts
	 *            Ա��״̬
	 */
	public void employeeInfoS(String Status, int startNo, int pageNum);

	/**
	 * ����Ա������������Ϣ
	 * 
	 * @param Stauts
	 *            Ա������
	 */
	public void employeeInfoN(String EmployeeName, int startNo, int pageNum);

	/**
	 * ���Ա����Ϣ
	 * 
	 * @param employee
	 * @return true || false
	 */
	public boolean addEmployee(Employee employee);

	/**
	 * ɾ��Ա����Ϣ
	 * 
	 * @param employee
	 * @return true || false
	 */
	public boolean delEmployee(Employee employee);

	/**
	 * �޸�����
	 * 
	 * @param UserName
	 *            Ա���û���
	 * @param NewPassword
	 *            ������
	 * @return true || false
	 */
	public boolean modifyPassword(String UserName, String password,
			String NewPassword, String MibaoDaan);

	/**
	 * ���ظ���ļ��϶���
	 * 
	 * @return EmployeeList
	 */
	public ArrayList<Employee> getEmployeeList();

}
