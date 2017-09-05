package com.cqjtu.vo;

public class Employee {

	private int EmployeeID;
	private String EmployeeName;
	private String UserName;
	private String Phone;
	private String Email;
	private String Status;
	private int Department;
	private String Password;
	private String MiBaoDaan;

	public Employee(){
		
	}
	
	public Employee(String EmployeeName, String UserName, String Phone, String Email, int Department, String Password, String MibaoDaan){
		this.EmployeeName = EmployeeName;
		this.UserName = UserName;
		this.Phone = Phone;
		this.Email = Email;
		this.Department = Department;
		this.Password = Password;
		this.MiBaoDaan = MibaoDaan;
	}
	
	public Employee(String UserName, String Password, String MibaoDaan){
		this.UserName = UserName;
		this.Password = Password;
		this.MiBaoDaan = MibaoDaan;
	}
	
	public Employee(String UserName,String Password){
		this.UserName = UserName;
		this.Password = Password;
	}
	
	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getDepartment() {
		return Department;
	}

	public void setDepartment(int department) {
		Department = department;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getMiBaoDaan() {
		return MiBaoDaan;
	}

	public void setMiBaoDaan(String miBaoDaan) {
		MiBaoDaan = miBaoDaan;
	}

}
