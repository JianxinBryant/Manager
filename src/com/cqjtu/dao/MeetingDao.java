package com.cqjtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cqjtu._interface.IF_Meeting;
import com.cqjtu.vo.Employee;
import com.cqjtu.vo.Meeting;

import db.DBconnection;

public class MeetingDao implements IF_Meeting{
	private static Connection conn;

	private PreparedStatement pre = null;

	private ResultSet res = null;

	static {
		conn = DBconnection.getConnection();
		System.out.println(conn);
	}

	/**
	 * 设置属性
	 * 
	 * @param meeting
	 */
	
	public Meeting setAttributes(ResultSet res) {
		Meeting meeting= new Meeting();

		try {
			meeting.setMeetingID(res.getInt("MeetingID"));
			meeting.setMeetingName(res.getString("MeetingName"));
			meeting.setRoomID(res.getInt("RoomID"));
			meeting.setReservationistID(res.getInt("ReservationistID"));
			meeting.setNumberofParticipants(res.getInt("NumberofParticipants"));
			meeting.setStartTime(res.getString("StartTime"));
			meeting.setEndTime(res.getString("EndTime"));
			meeting.setReservationTime(res.getString("ReservationTime"));
			meeting.setCanceledTime(res.getString("CanceledTime"));
			meeting.setStatus(res.getString("Status"));
			meeting.setDescription(res.getString("Description"));
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return meeting;
	}
	
	/**
	 * 所有会议信息
	 */
	public ArrayList<Meeting> allMeetingInfo() {
		String sql = "select * from meeting";

		try {
			pre = conn.prepareStatement(sql);

			res = pre.executeQuery();	
			ArrayList<Meeting> list = new ArrayList<Meeting>();
			while (res.next()) {
//				Meeting meeting = new Meeting();
//				meeting.setMeetingID(res.getInt("MeetingID"));
//				meeting.setMeetingName(res.getString("MeetingName"));
//				meeting.setRoomID(res.getInt("RoomID"));
//				meeting.setReservationistID(res.getInt("ReservationistID"));
//				meeting.setNumberofParticipants(res.getInt("NumberofParticipants"));
//				meeting.setStartTime(res.getString("StartTime"));
//				meeting.setEndTime(res.getString("EndTime"));
//				meeting.setReservationTime(res.getString("ReservationTime"));
//				meeting.setCanceledTime(res.getString("CanceledTime"));
//				meeting.setStatus(res.getString("Status"));
//				meeting.setDescription(res.getString("Description"));
				list.add(setAttributes(res));
//				System.out.println("111");
			}
			return list;
		} catch (Exception e) {
		}
		return null;
	}
	
	/**
	 * 根据会议编号查找信息
	 */
	public Meeting MeetingInfoI(int MeetingID) {
		String sql = "select * from meeting where MeetingID = ?";

		try {
			pre = conn.prepareStatement(sql);

			pre.setInt(1, MeetingID);

			res = pre.executeQuery();
			
			while(res.next()){
				
			return this.setAttributes(res);
			}
			

		} catch (Exception e) {
		}
		return null;
	}
	
	/**
	 * 根据会议名称查找信息
	 * 
	 * @param MeetingName
	 *            会议名
	 */
	public Meeting MeetingInfoN(String MeetingName)
	{
		String sql = "select * from meeting where MeetingName = ?";

		try {
			pre = conn.prepareStatement(sql);

			pre.setString(1, MeetingName);

			res = pre.executeQuery();

			while (res.next()) {

				return this.setAttributes(res);

			}
		} catch (Exception e) {
		}
		return null;
	}
	
	/**
	 * 根据会议室地址查找信息
	 * 
	 * @param RoomID
	 *            会议名
	 */
	public Meeting MeetingInfoR(int RoomID)
	{
		String sql = "select * from meeting where RoomID = ?";

		try {
			pre = conn.prepareStatement(sql);

			pre.setInt(1, RoomID);

			res = pre.executeQuery();

			while (res.next()) {

				return this.setAttributes(res);

			}
		} catch (Exception e) {
		}
		return null;
	}
	
	
	public ArrayList<Meeting> MeetingInfoRe(int ReservationistID){
		String sql = "select * from meeting where ReservationistID = ?";
		
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, ReservationistID);
			res = pre.executeQuery();
			
			ArrayList<Meeting> list = new ArrayList<Meeting>();
			while(res.next()){
				list.add(setAttributes(res));
			}
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	/**
	 * 添加会议
	 * 
	 * @param meeting
	 * @return true || false
	 */
	public boolean addMeeting(Meeting meeting) {
		String sql = "insert into meeting values (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pre = conn.prepareStatement(sql);

			pre.setInt(1, meeting.getMeetingID());
			pre.setString(2, meeting.getMeetingName());
			pre.setInt(3, meeting.getRoomID());
			pre.setInt(4, meeting.getReservationistID());
			pre.setInt(5, meeting.getNumberofParticipants());
			pre.setString(6, meeting.getStartTime());
			pre.setString(7, meeting.getEndTime());
			pre.setString(8, meeting.getReservationTime());
			pre.setString(9, meeting.getCanceledTime());
			pre.setString(10, meeting.getDescription());
			pre.setString(11, meeting.getStatus());
			
			if (pre.executeUpdate()==1) {
				return true;
			}
			return false;

		} catch (Exception e) {
		}
		return false;
	}


	/**
	 * 删除会议
	 * 
	 * @param meeting
	 * @return true || false
	 */
	public boolean delMeeting(Meeting meeting) {
		String sql = "delete from meeting where  MeetingID = ? ";

		try {

			pre = conn.prepareStatement(sql);
			pre.setInt(1, meeting.getMeetingID());
//			System.out.println(meeting.getMeetingID());
			if (pre.executeUpdate()==1) {
				return true;
			}

			return false;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
	public int updateMeeting(Meeting meeting){
		
		String sql = "update meeting set MeetingID=?,MeetingName=?,RoomID=?,ReservationistID=?,NumberofParticipants=?"
				            +",StartTime=?,EndTime=?,ReservationTime=?,CanceledTime=?,Description=?,Status=?";
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, meeting.getMeetingID());
			pre.setString(2, meeting.getMeetingName());
			pre.setInt(3, meeting.getRoomID());
			pre.setInt(4, meeting.getReservationistID());
			pre.setInt(5, meeting.getNumberofParticipants());
			pre.setString(6, meeting.getStartTime());
			pre.setString(7, meeting.getEndTime());
			pre.setString(8, meeting.getReservationTime());
			pre.setString(9, meeting.getCanceledTime());
			pre.setString(10, meeting.getDescription());
			pre.setString(11, meeting.getStatus());
			
			int flag = pre.executeUpdate();
			return flag;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public ArrayList<Meeting> selectThree(Meeting meeting){
		
		String sql = "select * from meeting";
		
		try {
			pre = conn.prepareStatement(sql);
			res = pre.executeQuery();
			ArrayList<Meeting> list = new ArrayList<Meeting>(); 
			while(res.next()){
				meeting.setMeetingID(res.getInt(1));
				meeting.setMeetingName(res.getString(2));
				meeting.setRoomID(res.getInt(3));
				list.add(meeting);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void selectMeeting(String UserName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Meeting> getMeetingList() {
		// TODO Auto-generated method stub
		return null;
	}

	
//	public static void main(String[] args) {
//		MeetingDao md= new MeetingDao();
//		Meeting meeting = new Meeting();
//		
//		md.allMeetingInfo();
//	}

	
}
