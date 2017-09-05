package com.cqjtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.Paging;

import com.cqjtu._interface.IF_Meetingroom;
import com.cqjtu.vo.MeetingRoom;

import db.DBconnection;

public class MeetingRoomDao implements IF_Meetingroom {

	private static Connection conn;

	private PreparedStatement pre = null;

	private ResultSet res = null;

	static {
		conn = DBconnection.getConnection();
	}

	public MeetingRoom setAttributes(ResultSet res) {
		MeetingRoom room = new MeetingRoom();

		try {
			room.setRoomID(res.getInt("RoomID"));
			room.setRoomCode(res.getInt("RoomCode"));
			room.setRoomName(res.getString("RoomName"));
			room.setCaoacity(res.getInt("Capacity"));
			room.setStatus(res.getString("Status"));
			room.setDescription(res.getString("Description"));

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return room;
	}
	
	/**
	 * 获取会议室表总记录数
	 * 
	 * @return 分页对象
	 */
	public Paging allCount() {
		String sql = "select count(*) from meetingroom";

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
	 * 所有会议室信息 将所得每一个会议室信息遍历插入上面的集合对象里
	 */

	public ArrayList<MeetingRoom> allMeetingroomInfo(int startNo, int pageNum) {
		String sql = "select *from meetingroom order by RoomID asc limit ?,?";
		ArrayList<MeetingRoom> list = new ArrayList<MeetingRoom>();

		try {
			pre = conn.prepareStatement(sql);
			
			pre.setInt(1, startNo);
			pre.setInt(2, pageNum);
			
			res = pre.executeQuery();
			while (res.next()) {
				MeetingRoom r = new MeetingRoom();
				r.setRoomID(res.getInt(1));
				r.setRoomCode(res.getInt(2));
				r.setRoomName(res.getString(3));
				r.setCaoacity(res.getInt(4));
				r.setStatus(res.getString(5));
				r.setDescription(res.getString(6));
				list.add(r);
			}

			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
	
	/**
	 * 所有会议室信息 将所得每一个会议室信息遍历插入上面的集合对象里
	 */

	public ArrayList<MeetingRoom> allMeetingroomInfo() {
		String sql = "select *from meetingroom";
		ArrayList<MeetingRoom> list = new ArrayList<MeetingRoom>();

		try {
			pre = conn.prepareStatement(sql);
			
			res = pre.executeQuery();
			while (res.next()) {
				MeetingRoom r = new MeetingRoom();
				r.setRoomID(res.getInt(1));
				r.setRoomCode(res.getInt(2));
				r.setRoomName(res.getString(3));
				r.setCaoacity(res.getInt(4));
				r.setStatus(res.getString(5));
				r.setDescription(res.getString(6));
				list.add(r);
			}

			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	/**
	 * 添加会议室信息
	 * 
	 */
	public boolean addMeetingroom(MeetingRoom room) {

		String sql = "insert into meetingroom(`RoomCode`,`RoomName`,`Capacity`,`Status`,`Description`) values (?,?,?,?,?)";

		try {
			pre = conn.prepareStatement(sql);

			pre.setInt(1, room.getRoomCode());
			pre.setString(2, room.getRoomName());
			pre.setInt(3, room.getCaoacity());
			pre.setString(4, "1");
			pre.setString(5, room.getDescription());

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
	 * 修改会议室信息
	 * 
	 */
	public boolean modifyMeetingroom(MeetingRoom room) {
		// 调用一个删除语句，再调用一个添加语句
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;

	}

	/**
	 * 删除会议室信息
	 * 
	 */
	public boolean delMeetingroom(MeetingRoom room) {
		String sql = "delete from meetingroom where RoomID = ?";

		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, room.getRoomID());
			if (pre.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 返回该类的集合对象
	 * 
	 * @return MeetingroomList
	 */

	public ArrayList<MeetingRoom> getMeetingroomList() {
		return this.MeetingroomList;
	}

	public MeetingRoom MeetingRoomInfoI(int id) {
		String sql = "select * from meetingroom where RoomID = ?";
		MeetingRoom mr = null;
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, id);
			res = pre.executeQuery();

			while (res.next()) {
				mr = this.setAttributes(res);
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mr;
	}
}
