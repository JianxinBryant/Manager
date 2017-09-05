package com.cqjtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cqjtu.vo.Employee;
import com.cqjtu.vo.Meeting;
import com.cqjtu.vo.MeetingParticipants;

import db.DBconnection;

public class MPDao {
	private static Connection conn;

	private PreparedStatement pre = null;

	private ResultSet res = null;

	private ArrayList<MeetingParticipants> mpList = new ArrayList<MeetingParticipants>();

	static {
		conn = DBconnection.getConnection();
		System.out.println(conn);
	}

	/**
	 * 设置属性
	 * 
	 * @param employee
	 */
	public MeetingParticipants setAttributes(ResultSet res) {
		MeetingParticipants mp = new MeetingParticipants();

		try {
			mp.setEmployeeID(res.getInt("EmployeeID"));
			mp.setMeetingID(res.getInt("MeetingID"));

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mp;
	}

	/**
	 * 所有会议员工关系信息
	 */
	public void allMpInfo() {
		String sql = "select *from meetingparticipants";

		try {
			pre = conn.prepareStatement(sql);

			res = pre.executeQuery();

			while (res.next()) {

				this.mpList.add(setAttributes(res));

			}
		} catch (Exception e) {
		}
	}

	public void abc(ArrayList<MeetingParticipants> mpList,
			ArrayList<Employee> employeeList, 
			ArrayList<Meeting> meetingList) {

	}

	public ArrayList<MeetingParticipants> getMpList() {
		return mpList;
	}

}
